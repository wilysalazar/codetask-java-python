import java.util.Scanner;

interface temperature {
    public float temp(float t);
}
 class fahrenheitcelsius implements temperature {

    @Override
    public float temp(float t) {
        t = ((t - 32) * 5) / 9;
        return t;
    }
}

public class Iface {
    public static void main(String[] args) {
        System.out.println("Enter temperature in fahrenheit");
        Scanner scan = new Scanner(System.in);
        float t = scan.nextFloat();

        temperature conver = new fahrenheitcelsius();
        float celsius = conver.temp(t);
        System.out.println("Temp in celsius is:" + celsius);
    }
}
