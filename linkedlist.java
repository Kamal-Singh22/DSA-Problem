
class Node {

    int data;

    Node next;

    Node(int newData) {

        this.data = newData;

        this.next = null;

    }

}

public class linkedlist {

    public static boolean searchkey(Node head, int key) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == key) {

                return true;

            }

            temp = temp.next;

        }

        return false;

    }

    public static int llSize(Node head) {

        Node temp = head;

        int count = 0;

        while (temp != null) {

            count++;

            temp = temp.next;

        }

        return count;

    }

    public static Node middleEle(Node head) {

        if (head == null) {
            return null;
        }

        Node fast = head;

        Node slow = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;

            fast = fast.next.next;

        }

        return slow;

    }

    public static int Occurance(Node head, int key) {

        Node temp = head;

        int count = 0;

        while (temp != null) {

            if (temp.data == key) {

                count++;

            }

            temp = temp.next;

        }

        return count;

    }

    public static void main(String[] args) {

        Node head = new Node(10);

        head.next = new Node(20);

        head.next.next = new Node(30);

        head.next.next.next = new Node(40);

        head.next.next.next.next = new Node(50);

        head.next.next.next.next.next = new Node(10);

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " ");

            temp = temp.next;

        }

        System.out.print("\n" + searchkey(head, 10));

        System.out.print("\n" + llSize(head));

        Node res = middleEle(head);

        if (res != null) {

            System.out.println("\n" + res.data);

        } else {

            System.out.print("Null");

        }

        int key = 10;

        System.out.print(Occurance(head, key));

    }

}
