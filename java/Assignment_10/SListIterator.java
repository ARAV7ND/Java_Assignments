package Assignment_10;

public class SListIterator<T> {
    SList<T> head;
    SList<T> tail;
    public void add(T data){
        SList<T> newNode = new SList<T>(data);
        if(head==null){
            head = newNode;
            tail= newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void iterate(){
        SList<T> current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    public void remove(int position){
        if(head==null){
            return;
        }
        SList<T> current = head;
        if(position==0){
            head = current.next;
        }
        for(int i=0;current!=null && (i<position-1);i++){
            current = current.next;
        }
        if(current==null || current.next==null){
            return;
        }
        SList<T> temp = current.next.next;
        current.next = temp;
    }
}
