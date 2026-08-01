alert("Welcome User");
const btn=document.querySelector(".register");
const rules=document.querySelector(".rules");
const form=document.querySelector(".form");
const id=document.querySelector("#customer_id");
const submit=document.querySelector(".submit");
const checkID=document.querySelector(".VerifyID");
let customerID="";

function verifyID(){
  let idVal=id.value;
  let valid=idVal.includes("XYZ");
  if(valid){
    alert("Your id is valid you may proceed now");
    return true;
  }
  else{
    alert("Invalid ID");
    return false;
  }
}
function generateID(){
    let val=id.value;
    if(verifyID()){
      customerID=val+7456;
      alert("Your id has been created succesfully and will be shared to your registered email as well")
      form.innerHTML=`<h3>Code generated successfully </h3><p>Your coupon code is ${customerID}</p>`;
    }
    else{
      alert("Your Customer ID must start with XYZ");
    }
}
btn.addEventListener("click",()=>{
    rules.style.display="none";
    form.style.display="block";
})
checkID.addEventListener("click",verifyID);
submit.addEventListener("click",generateID);
