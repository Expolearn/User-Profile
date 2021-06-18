var user = {
  Surname: "",
  Firstname: " ",
  Maidenname: " ",
  Contact: 00000000000,
  ResidentalAddress: " ",
  Education: " ",
  Password: "",
  Age: "",
  Maritalsstatus: "",
  Race: "",
  Gender: "",
};

console.table(user);


const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});


readline.question('what is your age?', input => {


  if (input < 19) {

      console.log('You not allowed');
      

  } else if (input >= 20 && input < 1000) {

      console.log('you are 20 and above');
      console.log('You are female');

  } else {

      console.log('you are too old');
  }  
  


  readline.close();
});

