import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;
// メインクラス　ラッパー図鑑
class RapperDictionary {
    public static void main(String[] args) {
        // RapperListとRapperManagerのインスタンスを生成
        RapperList rapperList = new RapperListImpl();
        List<RapperInfo> rappers = rapperList.getRappers();
        RapperManager rapperManager = new RapperManager(rappers);
        Scanner scanner = new Scanner(System.in);
        // メニューループ
        while (true) {
            System.out.println("図鑑を見る:y\n図鑑を終了:n");
            String input = scanner.next();
                // nが入力されたらループを抜けてプログラムを終了する
            if (input.equalsIgnoreCase("n")) {
                break;
                // yが入力されたらメニューを表示する
            } else if (input.equalsIgnoreCase("y")) {
                // メニュー表示
                System.out.println("以下のメニューから選択してください");
                System.out.println("1:ラッパーの詳細を表示する");
                System.out.println("2:ラッパーの名前で検索する");
                System.out.println("3:ラッパーのジャンルで検索する");
                System.out.println("4:ラッパーのデビュー年でソートする");
                System.out.println("5:ラッパーの情報を編集する");
                // 例外処理
                try {

                    int choice = scanner.nextInt();
                      // 入力された数値に応じて処理を分岐する
                    switch (choice) {
                        case 1:
                            // ラッパーの詳細を表示する
                            System.out.println("入力されたラッパーの詳細を表示します。\n1:2Pac\n2:REAL-T\n3:Vin jay\n4:Maiji\n5:DTF\n6:Karma\n7:Kanye West\n8:Lil Wayne\n9:Snoop Dogg\n10:TAKABO");
                            int number = scanner.nextInt();
                              // 入力された番号に対応するラッパーの情報を取得する
                            if (number >= 1 && number <= 10) {
                                  // ラッパーの情報を出力する
                                RapperInfo rapper = rappers.get(number - 1);
                                System.out.println("名前: " + rapper.getName());
                                System.out.println("ラップジャンル: " + rapper.getGenre());
                                System.out.println("出身: " + rapper.getOrigin());
                                System.out.println("デビュー: " + rapper.getDebutYear());
                                System.out.println("詳細:" + rapper.getDetail());
                            } else {
                                System.out.println("番号が正しくありません");
                            }
                            break;
                        case 2:
                            // ラッパーの名前で検索する
                            System.out.println("検索したいラッパーの名前を入力してください");
                            String name = scanner.next();
                            {
                            RapperInfo rapper = rapperManager.searchByName(name);
                            if (rapper != null) {
                                System.out.println("名前: " + rapper.getName());
                                System.out.println("ラップジャンル: " + rapper.getGenre());
                                System.out.println("出身: " + rapper.getOrigin());
                                System.out.println("デビュー: " + rapper.getDebutYear());
                                System.out.println("詳細:" + rapper.getDetail());
                            } else {
                                System.out.println("その名前のラッパーは見つかりませんでした");
                            }
                        }
                            break;
                        case 3:
                            // ラッパーのジャンルで検索する
                            System.out.println("検索したいラッパーのジャンルを入力してください");
                            String genre = scanner.next();
                            List<RapperInfo> result = rapperManager.searchByGenre(genre);
                            if (!result.isEmpty()) {
                                System.out.println(genre + "のラッパーは以下の通りです");
                                for (RapperInfo r : result) {
                                    System.out.println("名前: " + r.getName());
                                    System.out.println("出身: " + r.getOrigin());
                                    System.out.println("デビュー: " + r.getDebutYear());
                                    System.out.println();
                                }
                            } else {
                                System.out.println("ジャンルが見つかりません。");
                            }
                            break;
                            case 4:
                            // ラッパーのデビュー年でソートする
                            System.out.println("ラッパーのリストをデビュー年の昇順にソートします");
                            rapperManager.sortByDebutYear();
                            System.out.println("ソートが完了しました");
                            break;
                        case 5:
                            // ラッパーの情報を編集する
                            System.out.println("編集したいラッパーの番号を入力してください");
                            int index = scanner.nextInt();
                            if (index >= 1 && index <= 10) {
                                RapperInfo rapper = rappers.get(index - 1);
                                System.out.println("現在の情報は以下の通りです");
                                System.out.println("名前: " + rapper.getName());
                                System.out.println("ラップジャンル: " + rapper.getGenre());
                                System.out.println("出身: " + rapper.getOrigin());
                                System.out.println("デビュー: " + rapper.getDebutYear());
                                System.out.println("新しい情報を入力してください");
                                System.out.println("名前: ");
                                String newName = scanner.next();
                                System.out.println("ラップジャンル: ");
                                String newGenre = scanner.next();
                                System.out.println("出身: ");
                                String newOrigin = scanner.next();
                                System.out.println("デビュー: ");
                                String newDebutYear = scanner.next();
                                System.out.println("詳細: ");
                                String newDetail = scanner.next();
                                rapperManager.editRapper(rapper, newName, newGenre, newOrigin, newDebutYear, newDetail);
                                System.out.println("情報が更新されました");
                            } else {
                                System.out.println("番号が正しくありません");
                            }
                            break;
                        default:
                            System.out.println("メニューにない番号が入力されました");
                            break;
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