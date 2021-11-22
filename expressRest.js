import Express from "express";
const app = Express();
const port = 3000;
app.use(Express.json());
app.use(Express.urlencoded({extended: true}));
// import countries from './countries.json';


//custom iddle
function mid(req, res, next) {
    const {id} = req.params;
    const {email} = req.body;
    next();
}
const data = {
    "count": ["Afghanistan", "USA", "Pakistan", "India", "England"],
    "capitals": {
        "city": "Kabul",
        "districts": [11, 12, 13, 14, 15]
    }
}

app.get('/book', (req, res) => {
    res.status(200).json(data);
});

app.get('/book/:id', mid ,(req, res) => {
    const {id} = req.params;
    const {count} = data;
    if (id == 1) res.status(200).send(count);
    else
        res.status(404).send({"error": "No found the data"})
    // const {count} = req.body;
})
app.post('/save', (req, res) => {
    console.log(req.body)
    res.status(200).send({"received": req.body});
})

app.listen(port, () => {port})

