fun main(){

    class Car (parBrand: String, parModel: String, parYear: Int){
        var brand = parBrand
        var model = parModel
        var year = parYear
        var fuel = 100

        fun drive (){
            println("Wrooom!")
            fuel -= 25
        }
    }

    val car1 = Car("Ford", "Mustang", 1969)
    val car2 = Car("BMW", "X5", 1999)
    val car3 = Car("Tesla", "Model S", 2020)

    val cars = arrayOf(car1, car2, car3)

    for (x in cars){
    /*
    for (Car x : cars){
        ...
    }
     */
        if ((2022 - x.year) > 24){
            println(x.model + " is at least 25 years old")
        }
        else{
            println(x.model + " isn't older than 24 years")
        }

        when(x.brand){
            "Ford" -> println(x.model + " was made by an american company")
            "BMW" -> println(x.model + " was made by an german company")
            "Tesla" -> println(x.model + " was made by an american company")
        }

        /*
        switch(x.brand){
            case "Ford":
                System.out.println(x.model + " was made by an american company");
                break;
            case "BMW":
                System.out.println(x.model + " was made by an german company");
                break;
            case "Tesla":
                System.out.println(x.model + " was made by an american company");
                break;
            default:
                System.out.println(x.model + " was made by a company");
        }

        Seit Java 13
        switch(x.brand){
            "Ford" -> System.out.println(x.model + " was made by an american company");
            "BMW" -> System.out.println(x.model + " was made by an german company");
            "Tesla" -> System.out.println(x.model + " was made by an american company");
        }
        */

        if(x.brand == "BMW"){
            while(x.fuel > 0){
                x.drive()
            }
        }
    }


}
