const { escape } = require("querystring");

function writeCookie(){
    if(document.myForm.customer.value==''){
        alert("Enter some value!")
        return;
    }
    cookievalue=escape(document.myForm.customer.value)+ ";";
    document.cookie=" name :"+cookievalue;
    document.write( "Setting the cookie :"+ "name"+ cookievalue);
}