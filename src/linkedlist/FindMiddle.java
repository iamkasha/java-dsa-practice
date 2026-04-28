package linkedlist;

/*
 * LeetCode #876 — Middle of the Linked List
 * Find the middle node using the slow/fast pointer technique.
 * If two middle nodes exist, return the second one.
 * Time: O(n)  Space: O(1)
 */
public class FindMiddle {

    public static ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode odd = ListNode.build(new int[]{1, 2, 3, 4, 5});
        System.out.println("Middle of [1,2,3,4,5]: " + findMiddle(odd).val); // 3

        ListNode even = ListNode.build(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println("Middle of [1,2,3,4,5,6]: " + findMiddle(even).val); // 4
    }
}
