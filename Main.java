

MyUser = {
   Surname: "Sinugo",
  Firstname: "Tshifhiwa ",
  Maidenname: "Sadiki ",
  Contact: 0762852677,
  Education: " Univen",
};

   var userSur = MyUser.Surname;
console.log(userSur);

var userFirst = MyUser.Firstname;
console.log(userFirst);

var userMai = MyUser. Maidenname;
console.log(userMai);

var userCon = MyUser.Contact;
console.log(userCon);

var userEdu = MyUser.Education;
console.log(userEdu);

class Address {

    constructor(streetnum, surbub, city, country) {
    this.streetnum = "13333/67";
    this.surbub = "protea glen";
    this.city = "soweto";
    this.country = "south africa";
  }

MyAddress(streetn, surb, cit, coun) {
    streetn = this.streetnum;
    surb = this.surbub;
    cit = this.city;
    coun = this.country;
    return "your address is " + streetn + " " + surb + " " + cit + " " + coun;
  }

}

console.log(Address.MyAddress);


