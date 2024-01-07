class SinglyLinkedList {
    private class Node(val data: Int, var next: Node? = null)

    private var head: Node? = null

    fun addFront(data: Int){
        val newNode = Node(data)
        newNode.next = head
        head = newNode
    }

    fun addBack(data: Int){
        val newNode = Node(data)
        if (head == null) {
            head = newNode
            return
        }
        else {
            var currentNode = head

            while (currentNode?.next != null){
                currentNode = currentNode.next
            }
            currentNode?.next = newNode
        }
    }

    fun addAfter(after: Int, data: Int){
        var currentNode = head

        while(currentNode?.next != null){
            if (currentNode.data == after) {
                val newNode = Node(data)
                newNode.next = currentNode.next
                currentNode.next = newNode
                return
            }
            currentNode = currentNode.next
        }
    }

    fun deleteFront(){
        head = head?.next
    }

    fun deleteBack(){
        var currentNode = head

        if (head?.next == null) {
            head = null
            return
        }

        while (currentNode?.next?.next != null){
            currentNode = currentNode.next
        }
        currentNode?.next = null
    }

    fun deleteAfter(after: Int){
        var currentNode = head

        while (currentNode != null){
            if (currentNode.data == after) {
                currentNode.next = currentNode.next?.next
            }
            currentNode = currentNode.next
        }
    }

    fun print(){
        var currentNode = head
        while(currentNode != null) {
            print("${currentNode.data} ")
            currentNode = currentNode.next
        }
    }
}