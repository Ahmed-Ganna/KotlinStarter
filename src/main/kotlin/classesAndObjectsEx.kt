 class Company (var name:String="asmaa" , var age:Int=1 ,var experience:String? = null , var job:String? = null) {


      fun getCompanyData() {
         var comp = Company()
         print("${comp.age} ${comp.experience}")

     }
 }

 class Vechil (val name :String , year:Int=1 ) {
   var year:Int = 0

     init {

         this.year = if (2000<year) 2000 else if (year>2020) 2020 else this.year

         print(this.year)
     }


 }


 public fun main(args: Array<String>) {
     var comp = Company()
comp.getCompanyData()
 }



