fun main(args: Array<String>){
    val car1 = Car()
    val ceo1 = Ceo()
    val social = Social().Instagram()
    val jeff = Person( "Jeff Bezso")
    val tony = Person( "Tony Stack",50)
    val std1 = Student("Ms.Supansa")
    val natcha = Animal()
    natcha.name = "Ms.natcha" //access setter
    println(natcha.name) //access getter

    car1.brand = "Ford"
    car1.model = "Mustang"
    car1.year = 1969

    ceo1.name = "Elon Mask"
    ceo1.age = "45"
    ceo1.comp = "Facebook"
    ceo1.printCeo()

    println(natcha)
    println(social.hi())
    println("${car1.brand} ${car1.model} ${car1.year}")
}






