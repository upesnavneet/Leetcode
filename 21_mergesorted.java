
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.Arrays;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int count = 0;

        ListNode temp1 = list1;
        while (temp1 != null) {
            count++;
            temp1 = temp1.next;
        }

        ListNode temp2 = list2;
        while (temp2 != null) {
            count++;
            temp2 = temp2.next;
        }

        int[] arr = new int[count];
        int i = 0;

        while (list1 != null) {
            arr[i++] = list1.val;
            list1 = list1.next;
        }

        while (list2 != null) {
            arr[i++] = list2.val;
            list2 = list2.next;
        }

        Arrays.sort(arr);

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }

        return dummy.next;
    }
}