const names=document.getElementById('names')
const email=document.getElementById('email')
const password=document.getElementById('password')
const form=document.getElementById('form')
const errorElement=document.getElementById('error')
const nameRegex = /^[A-Za-z\s]+$/;
const emailRegex = /^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$/;
const passwordRegex=/^(?=.+[A-Za-z])(?=.+\d)[\w]{8, }$/;
//Function
form.addEventListener('submit',(e) =>{
    
    if(!nameRegex.test(names.value)){
        alert("Invalid name, please try agin!!")
        return e.preventDefault();
    }  
    if(!emailRegex.test(email.value)){
        alert("Invalid email, please try agin!!")
        return e.preventDefault();
    }
    if(!passwordRegex.test(password.value)){
        alert("Invalid password setting, please try agin!!")
        return e.preventDefault();
    }
    if(nameRegex.test(names.value) && emailRegex.test(email.value) && passwordRegex.test(password.value)){
        alert("Succesful Login");
        return;
    }
    if(names.value===''||password.value===''||email==='')
    {
        alert("failed");
    }
})
//Nested function
document.getElementById('familyMembers').addEventListener('click',function(event){
    event.preventDefault();//Prevent button default behaviour

    const familyMembers=["Dad",'Mom','Sister','Ammama'];
    displayFamilyMembers(familyMembers);
});
function displayFamilyMembers(family){
    document.writeln('family Members');
    document.writeln(family);//Print the family names in the document
    function displayFriends(){
        const friends=['shyam','mehar','srinu','yuva kiran'];
        document.writeln('Friends');
        document.writeln(friends);//print the friends names
    }
    displayFriends();//Call the nested function
}
//constructor based function
var constructorFunction= new Function('s','y','return s+y;');
function activate(){
    var result;
    result=constructorFunction('Shyam','Sundhar');
    document.write(result);
}
var func = new Function("x", "y", "return x*y;");
function secondFunction() {
   var result;
   result = func(10,20);
   document.write ( result );
}
//function literals

var func = function(x,y) { 
return x*y 
};
function secondFunction() {
var result;
result = func(10,20);
document.write ( result );
}
         