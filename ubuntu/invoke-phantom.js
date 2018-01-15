var webpage = require('webpage');
var page = webpage.create()
page.open('http://www.ibm.com:8080/green/timer/dots', function(status) {
  page.close();
});
