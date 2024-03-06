import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Username,Password;
        int right = 3;
        int balance = 1500;
        int select;
        while (right>0){
            System.out.print("Kullanıcı Adınız: ");
            Username = input.nextLine();
            System.out.print("Şifreniz: ");
            Password = input.nextLine();
            if (Username.equals("patika") && Password.equals("dev123")){
                System.out.println("Merhaba, Bankamıza Hoşgeldiniz!");
                do {
                    System.out.println("1-Para Yatırma\n"+
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                           "4-Çıkış Yap" );
                    System.out.println("Lütfen Yapmak istediğiniz İşlemi seçiniz: ");
                    select =input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para Miktarı: ");
                            int price =input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para Miktarı: ");
                            int price2 = input.nextInt();
                            if (price2 > balance){
                                System.out.println("Bakiye yetersiz");
                            } else {
                                balance -= price2;
                            } break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar Görüşmek Üzere");
                            break;
                   }
                } while (select !=4);
                break;
            } else {
                right--;
                System.out.println("Hatalı Kullanıcı adı veya Şifre girdiniz. Lütfen tekrar deneyiniz");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur banka ile iletişime geçiniz");
                } else {
                    System.out.println("Kalan Hakkınız: "+ right);
                }
            }
        }
    }
}
