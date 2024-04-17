package job

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job: Job = launch { // launch a new coroutine and keep a reference to its Job
        delay(1000L)
        println("World")
    }

    println("Hello")
    job.join()  // Wait until the child coroutine completes
    println("Done")
}
