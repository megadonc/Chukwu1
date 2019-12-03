public class Math{

    public static void main(String[] args) {
        Math app = new Math();
        int a =3;
        int b = 4;
        app.add(a,b);
        app.sub(a,b);
    }
    public int add(int first, int second ){
        return first + second;
    }

    public int sub(int first, int second ){
        System.out.print("My math");
        return first - second;
    }
}