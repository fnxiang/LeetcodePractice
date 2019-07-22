package topQuestion;

/*
* 21.合并两个有序链表
*
* result :
* 执行用时 :2 ms,在所有Java提交中击败了91.19%的用户
* 内存消耗 :36.2 MB,在所有Java提交中击败了87.36%的用户
*
* */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l2 == null){
            return l1;
        }
        if (l1 == null){
            return l2;
        }
        ListNode cursor = l1;
        while(l2 != null){

            while (l1.next != null){
                if(l2.val <= l1.val){
                    ListNode tmp = new ListNode(l1.val);
                    l1.val = l2.val;
                    tmp.next = l1.next;
                    l1.next = tmp;
                    break;
                }else if(l2.val <= l1.next.val){
                    ListNode tmp = new ListNode(l2.val);
                    tmp.next = l1.next;
                    l1.next = tmp;
                    break;
                }else {
                    l1 = l1.next;
                }
            }

            if(l1.next == null && l1.val <= l2.val){
                l1.next = l2;
                break;
            }else if(l1.next == null && l2.val < l1.val){
                ListNode tmp = new ListNode(l1.val);
                l1.val = l2.val;
                tmp.next = l1.next;
                l1.next = tmp;
            }

            l2 = l2.next;
        }
        return cursor;
    }

    public static void main(String[] args) {
        MergeTwoLists ob = new MergeTwoLists();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode result = ob.mergeTwoLists(l1, l2);
    }
}


//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) { val = x; }
//}