import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    CoroutineScope(Dispatchers.IO).launch {
//        test1()
        test2().collect {
            println(it)
        }
    }
    runBlocking {
        delay(30000)
    }
}

suspend fun test1() {
    (1..10).asFlow().collect {
        println(it)
    }
}

fun test2(): Flow<Int> {
    return flow {
        repeat(10) {
            emit(it)
            delay(100)
        }
    }
}