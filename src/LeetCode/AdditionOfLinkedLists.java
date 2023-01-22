package LeetCode;


public class AdditionOfLinkedLists {


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode root = null;
        ListNode pointer = null;
        ListNode temp;
        boolean isCarriable = false;
        while (l1 != null && l2 != null) {
            int nodeval1 = l1.val;
            int nodeval2 = l2.val;
            int sum = nodeval1 + nodeval2;
            if (isCarriable) {
                sum++;
                isCarriable = false;
            }
            if (sum <= 9) {
                temp = new ListNode(sum, null);
                root = createNode(root, temp);
            } else {
                isCarriable = true;
                int remainder = sum % 10;
                temp = new ListNode(remainder, null);
                root = createNode(root, temp);
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 == null && l2 != null) {
            while (l2 != null) {
                int val = l2.val;
                isCarriable = createNewNodeForRemaining(root, isCarriable, val);
                l2 = l2.next;
            }
        }

        if (l2 == null && l1 != null) {
            while (l1 != null) {
                int val = l1.val;
                isCarriable = createNewNodeForRemaining(root, isCarriable, val);
                l1 = l1.next;
            }
        }
        if (isCarriable) {
            temp = new ListNode(1, null);
            pointer = root;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = temp;
        }
        return root;
    }

    private static ListNode createNode(ListNode root, ListNode temp) {
        ListNode pointer;
        if (root == null) {
            root = temp;
        } else {
            pointer = root;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = temp;
        }
        return root;
    }

    private static boolean createNewNodeForRemaining(ListNode root, boolean isCarriable, int val) {
        ListNode temp;
        ListNode pointer;

        if (isCarriable) {
            ++val;
            isCarriable = false;
        }
        if (val <= 9) {
            temp = new ListNode(val, null);
        } else {
            isCarriable = true;
            int remainder = val % 10;
            temp = new ListNode(remainder, null);
        }
        pointer = root;
        while (pointer.next != null) {
            pointer = pointer.next;
        }
        pointer.next = temp;
        return isCarriable;
    }


    public static void main(String[] args) {

        int a[] = {9, 9, 1};
        int b[] = {1};
        ListNode l1 = createLinkedList(a);
        ListNode l2 = createLinkedList(b);
        final ListNode result = addTwoNumbers(l1, l2);
        System.out.println(result);
    }


    private static ListNode createLinkedList(int[] a) {

        ListNode root = null;
        ListNode ptr;
        for (int i : a) {
            ListNode temp = new ListNode(i, null);
            root = createNode(root, temp);
        }
        return root;

    }
}

