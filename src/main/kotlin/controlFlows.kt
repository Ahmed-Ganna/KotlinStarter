
fun main(args: Array<String>) {

/*

    //If else


    val num = 5


    var result =  when(num){
        in (1..2) , in (3..4) -> "Bad"
        in (5..9)-> "Good"
        10 -> "Greet"
        else -> "Unknown"
    }

    val listNames = arrayOf("Ahmed" ,"Ganna")

    val resultString = when("Ahmed"){
        "Mohamed" -> "Bad"
        in listNames -> "Good"
        else ->"UnKnown"
    }

    val animal : Animal

    animal = Cat()

    when(animal){
        is Cat -> print("is a cat")
        is Dog -> print("is a dog")
    }
*/

    //List - immutable
    val list = listOf("A","M","MA","12")

    //ArrayList
    val arrayList = mutableListOf<String>()


    if (true){
        arrayList.add("Third")
        arrayList.add("Fourth")
    }


    for (i in 0..list.size){
        println(i)
    }

    arrayList.forEach {item->
        println(item)
    }





}
