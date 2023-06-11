import kotlinx.coroutines.*
fun main(): Unit = runBlocking {
    val a = CoroutineScope(Dispatchers.IO).async {
        launch {
            for (i in 0 until 5) {
                println(i)
                delay(400)
                gogo()
            }
        }
        async { arrayListOf(1, 2, 3, 4).sum() }.await()
        val b = CoroutineScope(Dispatchers.IO).async {
            val a = withContext(Dispatchers.IO) {
                1
            }
            a
        }.await()
        println(b)
    }
    println("hello ${a.await()}")

}
suspend fun gogo() {
    for (i in 0 until 5) {
        delay(300)
        println(i)
    }
}
