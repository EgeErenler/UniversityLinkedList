package university;

class LinkedList {
    Node head;
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(String data) {
        Node newNode = new Node(data);
        newNode.next = null;

        if (this.head == null) {
            this.head = newNode;
        } else {
            Node last = this.head;

            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }
    }

    public void printList() {
        Node currNode = this.head;
        StringBuilder line = new StringBuilder();
        int count = 0;

        while (currNode != null) {
            if (count == 0) {
                line.append(currNode.data).append("\t\t\t\t\t");
            } else {
                line.append(currNode.data).append("\t\t\t\t\t");
            }

            currNode = currNode.next;
            count++;
        }

        System.out.println(line);
    }
}
