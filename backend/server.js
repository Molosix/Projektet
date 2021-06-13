let express = require('express');
let mongoose = require('mongoose');
let bodyparser = require('body-parser');
let cors = require('cors');
require("dotenv").config();
let index = require("./router/index");
const mongodbURL = process.env.MONGODB_URL;
const app = express();

mongoose.connect(mongodbURL, {
    useNewUrlParser: true,
    useUnifiedTopology: true,
    useCreateIndex: true
}).catch(error => console.log(error.reason));

app.use(cors());

app.use('/uploads', express.static(process.cwd() + '/uploads'));
app.use(bodyparser.json());
app.use('/',index);

app.listen(5000,()=>{
    console.log('Server started at http://localhost:5000');
});