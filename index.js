const express = require('express');
const bps = require("body-parser");

const app = express();

app.use(bps.json());
app.use(bps.urlencoded({
    extended: false
}));

const port = 6000;


app.get('/', async (req, res) => {

    try {

        res.send('hey king');

    } catch (error) {
        console.log(error);
    }

});

app.post('/', async (req, res) => {
    try {
        res.send(req.body);
    } catch (error) {
        console.log(error);
        res.send(error.message);
    }
});

app.listen(port, () => {
    console.log('server started at' + ' ' + port);
});