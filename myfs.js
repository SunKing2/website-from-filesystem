function myLog(data) {
  console.log(data)
}
const fs = require('fs')
const sFiles = ['./partials/pre-head.html', './partials/head.html', './partials/body.html', './partials/post-body.html']

fs.readFile(sFiles[0], 'utf8', (err, data) => {
  if (err) throw err
  myLog(data)
  fs.readFile(sFiles[1], 'utf8', (err, data) => {
    if (err) throw err
    myLog(data)
    fs.readFile(sFiles[2], 'utf8', (err, data) => {
      if (err) throw err
      myLog(data)
      fs.readFile(sFiles[3], 'utf8', (err, data) => {
        if (err) throw err
        myLog(data)
      })
    })
  })
})
