alert("Welcome new User");
const btn=document.querySelector(".register");
const rules=document.querySelector(".rules");
const form=document.querySelector(".form");
const id=document.querySelector("#customer_id");
const submit=document.querySelector(".submit");
let customerID="";

function verifyID(){
  let idVal=id.value;
  let valid=idVal.includes("XYZ");
  if(valid){
    document.write("Cupon code generated succesfully\n"+customerID.value);
    alert("Your id has been created succesfully and will be shared to your registered email as well")
  }
  else{
    document.write("Invalid ID");
  }
}
function generateID(){
    let val=id.value;
    if(verifyID){
      cuvalstomerID=val+7456;
    }
}
btn.addEventListener("click",()=>{
    rules.style.display="none";
    form.style.display="block";
})
submit.addEventListener("click",verifyID);
