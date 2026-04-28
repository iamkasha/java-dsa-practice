package linkedlist;

/*
 * LeetCode #141 — Linked List Cycle
 * Detect if a linked list contains a cycle using Floyd's slow/fast pointer algorithm.
 * Time: O(n)  Space: O(1)
 */
public class DetectCycle {

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.build(new int[]{1, 2, 3, 4, 5});
        System.out.println("No cycle: " + hasCycle(head)); // false

        // Manually create a cycle: tail points back to node with val=3
        ListNode cycleNode = head.next.next;
        ListNode tail = head;
        while (tail.next != null) tail = tail.next;
        tail.next = cycleNode;
        System.out.println("With cycle: " + hasCycle(head)); // true
    }
}
