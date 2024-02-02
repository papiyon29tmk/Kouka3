import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;
class RapperDictionary {
    public static void main(String[] args) {
        RapperList rapperList = new RapperListImpl();
        List<Rapper> rappers = rapperList.getRappers();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("図鑑を見る:y\n図鑑を終了:n");
            String input = scanner.next();
            if (input.equalsIgnoreCase("n")) {
                break;
            } else if (input.equalsIgnoreCase("y")) {
                System.out.println("入力されたラッパーの詳細を表示します。\n1:2Pac\n2:REAL-T\n3:Vin jay\n4:Maiji\n5:DTF\n6:Jay-z\n7:Kanye West\n8:Lil Wayne\n9:Snoop Dogg\n10:TAKABO");
                try {
                    int number = scanner.nextInt();
                    if (number >= 1 && number <= 10) {
                        RapperInfo rapper = rappers.get(number - 1);
                        System.out.println("名前: " + rapper.getName());
                        System.out.println("ラップジャンル: " + rapper.getGenre());
                        System.out.println("出身: " + rapper.getOrigin());
                        System.out.println("デビュー: " + rapper.getDebutYear());
                    } else {
                        System.out.println("番号が正しくありません");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("整数以外の値が入力されました");
                }
            } else {
                System.out.println("yまたはnを入力してください");
            }
        }
        scanner.close();
    }
}