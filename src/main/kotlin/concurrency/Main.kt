package concurrency

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


/*
 A coroutineScope builder can be used inside any suspending function to perform
 multiple concurrent operations. Let's launch two concurrent coroutines inside
 a doWorld suspending function
*/

fun main() = runBlocking {
    doWorld()
    println("Done")
}


suspend fun doWorld() = coroutineScope {
    launch {
        delay(1000L)
        println("...at the same time (1)")
    }

    launch {
        delay(1000L)
        println("...at the same time (2)")
    }
    println("This will print...")
}
/*
* Both pieces of code inside launch { ... } blocks execute concurrently
* after 1 second from start. A coroutineScope in doWorld completes only
* after both are complete, so doWorld returns and allows Done string to be
* printed only after that
* */


