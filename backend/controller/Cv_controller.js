const Cv = require("../model/Cv");

exports.add_cv = (req, res) => {
  new Cv({
    content: req.file.path,
  })
      .save()
      .then((result) => {
        res.status(200).json({
          message: "cv added successfully",
        });
      })
      .catch((error) => {
        console.log("error", error);
        res.status(500).json({
          message: "cv adding failed",
        });
      });
};
exports.get_cv = async (req, res) => {
  try {
  const cv = await Cv.find({});
   
  res.status(200).json(
      cv[0]
   );
  } catch (e) {
    res.status(500).json({
      message: "failed to get cv"
   });
  }
};