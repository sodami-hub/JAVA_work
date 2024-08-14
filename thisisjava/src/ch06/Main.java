package ch06;

public class Main {
    public static void main(String[] args) {

        //Example15-확인
//        MemberService memberService = new MemberService();
//        boolean result = memberService.login("hong","12345");
//        if(result) {
//            System.out.println("log in successful.");
//        } else {
//            System.out.println("login failed.");
//        }

        //Example16 - 확인
//        Printer print = new Printer();
//        print.println(10);
//        print.println(true);
//        print.println(3.15);
//        print.println("홍길동");

        //Example17 - 확인
//        Printer.println(10);
//        Printer.println(true);
//        Printer.println(3.14);
//        Printer.println("hong");

        //Example18 - 확인
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if (obj1 == obj2) {
            System.out.println("shop 1 and shop 2 are the same instance.");
        } else {
            System.out.println("shop 1 and shop 2 are the difference instance.");
        }


    }
}
