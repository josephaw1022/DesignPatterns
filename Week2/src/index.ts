

const express = require('express')
const app = express()
const port = 3000




const BookDriver = ():void => {

    // const run = ():void => { 
    //     let bestSeller: BestSellers = new BestSellers() ; 
    //     let myStore: Store = new Store(bestSellers); 
    //     let myCustomer:Customer = new Customer(bestSellers, "Amy", "Smith") ; 
    // }

    // return run()



}



app.get('/', (req:any, res:any) => {
  const response = BookDriver()
  req && res.send({response})
})


app.listen(port, () => {
  console.log(`Example app listening at http://localhost:${port}`)
})

