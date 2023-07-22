const btn=document.querySelector('button');
const divblock=document.querySelector('.divblock')
function random(number){
    return Math.floor(Math.random()*(number+1));
}
btn.addEventListener('click',changeBackground)
function changeBackground(){
    const randCol=`rgb(${random(255)},${random(255)},${random(255)})`;
    divblock.style.backgroundColor=randCol;
}
//Keydown
const input=document.getElementById('input1')
const log=document.getElementById('log')
input.addEventListener('keydown',logKey)
function logKey(e){
log.textContent+=` ${e.code}`;
}
//KeyUp
const input1 = document.getElementById('input2')
const log1 = document.getElementById("log1");

input1.addEventListener("keyup", logKey1);

function logKey1(e) {
  log1.textContent += ` ${e.code}`;
}
//keypress
const input2=document.getElementById('input3')
const log2=document.getElementById('log2')
input2.onkeypress=logkey3;
function logkey3(e){
    log2.textContent+= ` ${e.code}`;
}
//input
const input3 = document.querySelector("input");
const log3 = document.getElementById("values");

input3.addEventListener("input", updateValue);

function updateValue(e) {
  log3.textContent = e.target.value;
}
const form = document.getElementById("form");

form.addEventListener(
  "focus",
  (event) => {
    event.target.style.background = "pink";
  },
  true,
);

form.addEventListener(
  "blur",
  (event) => {
    event.target.style.background = "";
  },
  true,
);
const btn1 = document.querySelector("button");
const box = document.querySelector("div");
const video = document.querySelector("video");

btn1.addEventListener("click", () => box.classList.remove("hidden"));

video.addEventListener("click", (event) => {
  event.stopPropagation();
  video.play();
});

box.addEventListener("click", () => box.classList.add("hidden"));
