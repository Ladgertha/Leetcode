package tree

/**
 * Time O(n) Space: best O(log(N)) (balanced tree)
 * worse O(n) unbalanced tree to keep recursion stack
 */
fun main() {

}

fun isSameTree(p: TestNode?, q: TestNode?): Boolean {
    return when {
        p == null && q == null -> true
        p == null || q == null || p.value != q.value -> false
        else -> isSameTree(p.right, q.right) && isSameTree(p.left, q.left)
    }
}

class TestNode(var value: Int) {
    var left: TestNode? = null
    var right: TestNode? = null
}