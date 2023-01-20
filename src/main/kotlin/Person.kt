class Person constructor(val fname: String ,val age:Int = 45) {
    val firsName: String
    val perAge: Int

    //initials block
    init {
        firsName = fname
        perAge = age
        println("First Name = $firsName")
        println("First Name = $firsName Age = $age")
    }
}
