const mongoose = require("mongoose");

const CvSchema = mongoose.Schema({
  content: {type: String, require: true}
});

module.exports = mongoose.model("Cv", CvSchema);
