public class New_Generic <T>{
    T num;
    public void set(T value){
        System.out.println("T has instantiated at this step");
        num = value;
    }
    public T get(){
        return (num);
    }
}
class New{
    public static void main(String[] args) {
       New_Generic<Integer> t = new New_Generic<Integer>();
       t.set(5);
       New_Generic<Character> t1 = new New_Generic<Character>();
       t1.set('M');
        System.out.println("value are: "+t.get()+" "+t1.get());
    }
}