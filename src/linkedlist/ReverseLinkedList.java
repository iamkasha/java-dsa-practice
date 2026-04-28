package linkedlist;

/*
 * LeetCode #206 — Reverse Linked List
 * Reverse a singly linked list iteratively.
 * Time: O(n)  Space: O(1)
 */
public class ReverseLinkedList {

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.build(new int[]{1, 2, 3, 4, 5});
        System.out.println("Original: " + ListNode.print(head));
        head = reverse(head);
        System.out.println("Reversed: " + ListNode.print(head));
    }
}
