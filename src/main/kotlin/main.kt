import java.time.temporal.TemporalAmount

fun main(){
    var m=CurrentAccount(782861097,"waithera",5000.00)
      m.deposit(432.00)
    println(m.balance)
    println(m.accountnumber)
    println(m.balance)
    nums("nkimalantoi")







}
/*create a classCurrentAccount with the following attributes:account
number, account name, balance. It has the following functions:
a.deposit(amount: Double) - Increments the balance by the
amount deposited
b.withdraw(amount: Double) - Decrements the balance by the
amount withdrawn
c.details() - Prints out the account number and balance and
name in this format: “Account number x with balance y is
operated by z”(5points)*/
class CurrentAccount(var accountnumber:Int,var accountname:String,var balance:Double){
    fun deposit(amount: Double){
        balance+=amount


    }
}
fun withdraw(amount: Double){


}
fun  detail(){
    var x=0
    var y=0
    var z=0
    println("accountnumber $x with balance $y is operated by $z")

}
// 4) Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return
//“bnn
fun  nums(names:String):Int{
    var h=""
    names.forEachIndexed { index, c ->
        if { index%2 =0 }
    }
    return h
}
data class Product(var name:String,var weight:Double,var price:Int,var category:String)














