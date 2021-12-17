public class NEW {

    public <T> void disp(T arr[]){
        System.out.println("array has following element");
        for(T element:arr){
            System.out.println(element);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Integer num[]= new Integer[]{45,65,85,98};
        String names[]= new String[]{"yogesh","pal","yash"};
        NEW m = new NEW();
        m.disp(num);
        m.disp(names);
    }
}
