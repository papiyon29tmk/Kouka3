// ラッパーの情報を管理する

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class RapperManager {

    // ラッパーのリストをフィールドとして持つ
    private List<RapperInfo> rappers;

    // コンストラクタでラッパーのリストを受け取る
    public RapperManager(List<RapperInfo> rappers) {
        this.rappers = rappers;
    }

    // ラッパーの名前で検索するメソッド
    public RapperInfo searchByName(String name) {
        // リストをループして名前が一致するラッパーを探す
        for (RapperInfo rapper : rappers) {
            if (rapper.getName().equals(name)) {
                // 見つかったらそのラッパーを返す
                return rapper;
            }
        }
        // 見つからなかったらnullを返す
        return null;
    }

    // ラッパーのジャンルで検索するメソッド
    public List<RapperInfo> searchByGenre(String genre) {
        // ジャンルが一致するラッパーを格納するリストを作る
        List<RapperInfo> result = new ArrayList<>();
        // リストをループしてジャンルが一致するラッパーを探す
        for (RapperInfo rapper : rappers) {
            if (rapper.getGenre().equals(genre)) {
                // 見つかったらリストに追加する
                result.add(rapper);
            }
        }
        // リストを返す
        return result;
    }

    // ラッパーのデビュー年でソートするメソッド
    public void sortByDebutYear() {
        // リストをデビュー年の昇順にソートする
        Collections.sort(rappers, new Comparator<RapperInfo>() {
            @Override
            public int compare(RapperInfo r1, RapperInfo r2) {
                // デビュー年を数値に変換して比較する
                return Integer.parseInt(r1.getDebutYear()) - Integer.parseInt(r2.getDebutYear());
            }
        });
    }

    // ラッパーの情報を編集するメソッド
    public void editRapper(RapperInfo rapper, String name, String genre, String origin, String debutYear, String detail) {
        // ラッパーのフィールドを更新する
        rapper.setName(name);
        rapper.setGenre(genre);
        rapper.setOrigin(origin);
        rapper.setDebutYear(debutYear);
        rapper.setDetail(detail);
    }

    // ラッパーのリストを表示するメソッド
    public void showRappers() {
        // リストをループしてラッパーの情報を出力する
        for (RapperInfo rapper : rappers) {
            System.out.println("名前: " + rapper.getName());
            System.out.println("ラップジャンル: " + rapper.getGenre());
            System.out.println("出身: " + rapper.getOrigin());
            System.out.println("デビュー: " + rapper.getDebutYear());
            System.out.println("詳細:" + rapper.getDetail());
        }
    }

}
