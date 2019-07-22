package topQuestion;

public class TowNumPlus {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int high = 0;
        ListNode node = new ListNode(0);
        ListNode cursor = node;
        while(l1!=null || l2!=null || high != 0){
            int tmp = 0;
            if(l1 == null && l2 == null && high != 0){
                tmp = high;
            }else if(l1 == null && l2 != null){
                tmp = l2.val + high;
            }else if(l1 != null && l2 == null){
                tmp = l1.val + high;
            }else{
                tmp = l1.val + l2.val + high;
            }
            //进位要重设为0
            high = 0;
            if(tmp >= 10){
                high = tmp/10;
                tmp = tmp%10;
            }
            cursor.next = new ListNode(tmp);
            cursor = cursor.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }

        return node.next;
    }

    public static void main(String[] args) {
        TowNumPlus towNumPlus = new TowNumPlus();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode list = towNumPlus.addTwoNumbers(l1, l2);
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}