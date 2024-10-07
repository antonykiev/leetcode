class TreeNode(var element: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun inorderTraversal(root: TreeNode?): List<Int> {
    root ?: return emptyList()
    if (root.left == null && root.right == null) return listOf(root.element)

    return TODO()
}

fun main() {
    val res = inorderTraversal(
        null,
//        TreeNode(5)
    )
    println(res)
}