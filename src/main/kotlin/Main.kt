fun main(args: Array<String>) {

    val TypePaySystem = "MasterCard" //MasterCard, Visa, Mir, VKPay

    val amount = 3500

    val previousAmount = 0

    println(run(TypePaySystem, amount, previousAmount))
}