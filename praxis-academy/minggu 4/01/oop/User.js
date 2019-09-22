class User {
    name = "Anonymous";

    // constructor(name){
    //     // invokes the setter
    //     this.name = name;
    // }

    // get name(){
    //     return this._name;
    // }

    // set name(value){
    //     if (value.length < 4) {
    //         alert("Name is too short.");
    //         return;
    //     }
    //     this._name = value;
    // }

    sayHi(){
        alert(`Hello, ${this.name}!`);
    }
}

new User().sayHi();

// let user = new User("John");
// alert(user.name); // John

// user = new User(""); // Name too short.