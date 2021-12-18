public class PriorityLine {

    Node root;

    public PriorityLine() {
    }


    public void add(int pri, String Name) {

        Node newNode = new Node(pri, Name);

        Node temp = root;
        boolean flag = true;

        if(root==null){

            root=newNode;

        }
        else if (root.pri > newNode.pri) {

            newNode.next = root;
            root = newNode;

        }
        else {

            while(temp.next!=null&&flag==true){

                if (newNode.pri > temp.next.pri) {

                    temp = temp.next;

                }
                else{

                    flag=false;

                }

            }

            Node saver = temp.next;
            temp.next=newNode;
            newNode.next=saver;

        }

    }

    public void remove(String name) {

        Node temp = root;

        if(root==null){

        }
        else if (root.Name.equals(name)){

            root=root.next;

        }
        else{

            while (temp.next!=null) {

                if(temp.next.Name.equals(name)){
                    if(temp.next.next!=null){
                        Node saver = temp.next.next;
                        temp.next = saver;
                    }
                    else{
                        temp.next = null;
                    }
                    break;
                }


                temp=temp.next;

            }

        }

    }


    public String extractMin(){

        Node temp = root;
        root = root.next;
        return temp.Name;

    }


    public String availablePriorities(){

        Node temp = root;
        String result = "";
        int spot=1;

        while (spot < 500) {

            if (spot != 1) {

                result += ", ";

            }

            if (temp != null) {
                if (spot != temp.pri) {

                    result += spot;

                    temp = temp.next;
                    spot++;
                }
                if(temp !=null) {
                    if (temp.next != null) {
                        temp = temp.next;
                    }
                }
            }
            else{
                result += spot;
            }
            if(spot%55==0){
                result+="\n";
            }
            spot++;
        }

            return result;
    }


    public String toString() {

        Node temp = root;
        String result = "";

        while (temp != null) {

            result = result + "(" + temp.pri + "," + temp.Name + ")";
            temp = temp.next;

        }

        return result;

    }





    public class Node {

        String Name;
        Integer pri;
        Node next;

        public Node(int pri, String Name) {

            this.pri = pri;
            this.Name = Name;

        }


    }


}
