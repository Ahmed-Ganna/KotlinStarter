fun main(args: Array<String>) {

//val animal : Animal? = Animal("Dog","Male")
/*    var animal : Animal? = null

    print("${animal?.name} - ${animal?.gender} hello")
    */
    //Data class
    val product = Product("Suger","5","link.jpg")

    //println( product.toString())

    val product2 = Product("Suger","6","link.jpg")

    println(product == product2)

/* Clone data class
    val clonedProduct = product.copy(id = "6")

    println( clonedProduct.toString())
*/
}
open class Animal(var name:String? ,val gender:String ,val age:Int? = null)
class Dog : Animal("Dog" , "Male")
class Cat : Animal("Cat","Female")
class Person(name: String , gender:String):Item(name){
    var gender:String
    //Primary constructor
    init {
        if (gender !in arrayOf("male","female")) this.gender = "male"
        else this.gender = gender
    }

    fun ddd(){
        name
    }

}

data class Product(val name:String? = null , var id:String? = null ,val image:String? = null):HasName,HasImage{

    override fun getItName(): String? {
        return name
    }

    override fun getItImage(): String? {
        return image
    }


}

interface HasName{
    fun getItName():String?
}

interface HasImage{
    fun getItImage():String?
}

open class Item(val name: String?){

}