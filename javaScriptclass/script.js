// function add(i, j) {
//   return i + j;
// }
// result = add(2, 3);
// console.log(result);

// function greet() {
//   console.log("hello");
// }

// greet.message = "world";
// console.log(greet.message);

// const add = (a, b) => a + b;
// console.log(add(4, 3));

// const greet = () => console.log("hello");

// const add = () => {
//   i = parseInt(document.getElementById("num1").value);
//   j = parseInt(document.getElementById("num2").value);
//   result = i + j;
//   document.getElementById("result").innerHTML = result;
// };

// function show() {
//   //   r = confirm("Do you want to continue?");
//   //   if (r == true) {
//   //     window.location.href = "https://www.google.com";
//   //   }

//   //   r = prompt("Roll");
//   //   if (r) {
//   //     window.location.href = "https://www.google.com";
//   //   }
//   //   open("ticket.html", "Bus Ticket", "width=300, height=300");
//   //   print();
//   dobj = new Date();
//   h = dobj.getHours();
//   m = dobj.getMinutes();
//   s = dobj.getSeconds();
//   document.getElementById("time").innerHTML = h + ":" + m + ":" + s;
//   setTimeout("show()", 1000);
// }

// let i = "javaScript";
// console.log(i.length);
// console.log(i.toUpperCase());
// console.log(i.substring(0, 4));

// data = "javaScript,python,java";
// arr = data.split(",");
// console.log(arr);

// console.log(arr[0].charAt(3));

// function showme() {
//   document.getElementsByTagName("p")[1].innerText = "Hello mulllaa";
// }

// function showme2() {
//   const items = document.querySelectorAll(".k");
//   items.forEach((item) => (item.style.color = "red"));
// }

// function showme3() {
//   const newDiv = document.createElement("div");
//   newDiv.textContent = "Hello";
//   document.body.appendChild(newDiv);
// }

// i = 0;
// function showme4() {
//   const newDiv = document.createElement("div");
//   newDiv.textContent = "Tanmay";
//   const referenceNode = document.getElementById("m");
//   document.body.insertBefore(newDiv, referenceNode);
// }

// document.getElementById("K").addEventListener("click", () => {
//   console.log("clicked");
//   alert("clicked");
// });

// document.getElementById("k");

// function show() {
//   const removeMe = document.getElementById("removeMe");
//   removeMe.remove();
// }

// let myPromise = new Promise((resolve, reject) => {
//   let success = true;
//   setTimeout(() => {
//     if (success) {
//       resolve("Success");
//     } else {
//       reject("not Success");
//     }
//   }, 3000);
// });
// myPromise
//   .then((Response) => document.write(Response))
//   .catch((err) => document.writeln(err));

const comp = { cname: "Deloitte", cid: 101 };
const employee = {
  eid: 101,
  __proto__: comp,
};
document.writeln(employee.cname);
