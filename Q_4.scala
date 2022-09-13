object Q_4 extends App {
  class Account(id:String, n:Int, b:Double){
    val NIC:String = id
    val accountNo: Int = n
    var balance: Double =b

    override def toString(): String = "NIC: "+NIC+ " AccNo: "+accountNo+ " Balance: "+balance
  }

  val acc1= new Account("200030300470",3278982,76500)
  val acc2= new Account("200056789340",3279876,-5000)
  val acc3= new Account("200045690960",3278972,45500)
  val acc4= new Account("199934569091",3279875,-20000)

  var bank:List[Account] = List(acc1,acc2,acc3,acc4)

  println("Accounts with negative balance: ")
  val overdraft = bank.filter(x=>x.balance<0)
  val sum = bank.map((x)=>(x.balance)).reduce((x,y)=>(x+y))
  val interest = (b:List[Account])=>b.map((x)=>(x.NIC,x.accountNo,if(x.balance>0)x.balance*1.05d else x.balance*1.10d))

  println("List of accounts with negative balance: " +overdraft +"\n")
  println("Sum of all accounts: Rs: " +sum+ "\n")
  println("Final balance of all accounts: "+interest(bank)+"\n")
}
