
public class Main {
    
    public static void main(String[] args) {
        SimpleDate d = new SimpleDate(13, 12, 1995);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(13, 12, 1995)));
        
    }
}
