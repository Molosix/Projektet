const express = require("express");
const router = express.Router();
const Cv_controller = require('../controller/Cv_controller');
// const cv_controller = require("../controller/cv_controller");

let multer = require("multer");
let multerS3 = require("multer-s3");
var aws = require("aws-sdk");
var s3 = new aws.S3({
  /* ... */
});

let upload = multer(
  { dest: "uploads/" },
  {
    storage: multerS3({
      s3: s3,
      bucket: "some-bucket",
      contentType: multerS3.AUTO_CONTENT_TYPE,
      expires: "Tue, 22 Nov 2020 14:44:00 GMT",
      key: function (req, file, cb) {
        cb(null, Date.now().toString());
      },
    }),
  }
);


//cv to commet use ctrl key plus /
router.post(
  "/add_cv",
  upload.single("image"),    
    Cv_controller.add_cv
);

//get CV
router.get(
    "/get_cv",
     Cv_controller.get_cv
  );

module.exports = router;