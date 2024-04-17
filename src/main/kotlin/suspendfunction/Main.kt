package suspendfunction

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay

fun main() = runBlocking { // this: CoroutineScope
    launch { doWorld() }
        println("Hello")
    }

suspend fun doWorld() {
    delay(1000L)
    println("World!")
}