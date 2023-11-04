public class Main {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        String string = new String("asdf zxcv  asdfz a    ");
        int begin = 0;
        int end = string.length() - 1;

        while(true) {
            int judge = 0;
            if(string.charAt(begin) == ' ') {
                begin++;
                judge += 1;
            }
            if(string.charAt(end) == ' ') {
                end--;
                judge += 1;
            }
            if(judge == 0) {
                break;
            }
        }
        int last = end;
        int front = 0;
        for( int i = end; i >= begin; i--) {
            if(string.charAt(i) == ' ' || i == begin){
                if (i != begin)
                    front = i + 1;
                else
                    front = i;
                buffer.append(string.substring(front, last + 1) + " ");
                last = front - 1;
            }
        }
        System.out.println(buffer.toString());
    }
}
