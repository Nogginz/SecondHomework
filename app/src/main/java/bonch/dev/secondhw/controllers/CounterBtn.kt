package bonch.dev.secondhw.controllers

class CounterBtn(initialCount: Int = 0) {
//Кто вишенка на всем этом торте?
    var currentCount = initialCount
     private set

    fun increment(amount: Int = 1){
        currentCount += amount
    }
}