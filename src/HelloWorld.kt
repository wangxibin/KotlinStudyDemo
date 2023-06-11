import java.net.URLDecoder
import java.net.URLEncoder

fun main(args: Array<String>) {
    val s:String = URLEncoder.encode("?","utf-8")
    println("Hello, world")
    println(s)
}