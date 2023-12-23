fun minimumDistance(arr: IntArray): Int {
    val indices = mutableMapOf<Int, Int>()
    var minDist = Int.MAX_VALUE

    for (i in arr.indices) {
        val num = arr[i]
        if (num in indices) {
            minDist = minOf(minDist, i - indices[num]!!)
        }
        indices[num] = i
    }

    return if (minDist != Int.MAX_VALUE) minDist else -1
}

fun main() {
    print(minimumDistance(intArrayOf(1,3,4,5,6,4,1)))
}