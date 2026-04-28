package linkedlist;

/*
 * LeetCode #21 — Merge Two Sorted Lists
 * Merge two sorted linked lists into one sorted list.
 * Time: O(n + m)  Space: O(1)
 */
public class MergeSortedLists {

    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = ListNode.build(new int[]{1, 3, 5, 7});
        ListNode l2 = ListNode.build(new int[]{2, 4, 6, 8});
        System.out.println("Merged: " + ListNode.print(merge(l1, l2))); // 1->2->3->4->5->6->7->8
    }
}
