fun main(args: Array<String>)
{
    /*
      //1 задача

      val age1: Int = 42
      val age2: Int = 21

      //2задача
      val age1: Int = 42
      val age2: Int = 21
      val avg1: Int = (age1 + age2) / 2
*/
      //3 задача
      val age1: Double = 42.0
      val age2: Double = 21.0
      val avg1: Double = (age1 + age2) / 2 //
      print(avg1)
/*
      //4 задача
      val firstName :String =  "Timur"
      val lastName :String =  "Shevotsukov"

      //5 задача
      val firstName :String =  "Nigal"
      val lastName :String =  "Matevosyan"
      val fullName :String =  firstName + " " + lastName
      println(fullName)
*/
      //6 задача
      val firstName :String =  "Nigal"
      val lastName :String =  "Matevosyan"
      val fullName :String =  firstName + " " + lastName
      val myDetails :String =  "Привет, меня зовут"
      println(myDetails + " " + fullName)

      //7 задача
      val dates = Triple(13,10,2015)
      //8 Задача
      val day = dates.first
      val month = dates.second
      val year = dates.third
      /*println(day)
      println(month)
      println(year)*/
      //9 задача
      val monthANDyear = """
              |$month
              |$year
      """.trimMargin()
      println(monthANDyear)

    //10 задача
    val pair = Pair(2017, year)
}