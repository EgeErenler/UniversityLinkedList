package university;

class Tree {
    private Node root;

    static class Node {
        private LinkedList data;
        private Node child;

        public Node(LinkedList data) {
            this.data = data;
        }
    }

    public void insert(LinkedList data) {
        Node child = new Node(data);
        Node currNode = this.root;

        if (this.root == null) {
            this.root = child;
        } else {
            while (currNode.child != null) {
                currNode = currNode.child;
            }

            currNode.child = child;
        }
    }

    public void printAll() {
        Node currNode = root;
        int count = 1;

        if (currNode == null) {
            System.out.println("There is no preference yet.");
        } else {
            System.out.println("\tUniversity Name\t\t\t\t\tEntrance Score\t\t\t\t\tFacilities\t\t\t\t\t\tCity");
            System.out.printf("%d)\t", count);
            currNode.data.printList();
            count++;

            while (currNode.child != null) {
                currNode = currNode.child;
                System.out.printf("%d)\t", count);
                currNode.data.printList();
                count++;
            }
        }
        System.out.println();
    }
}
