import java.util.ArrayList;
import java.util.List;

class RapperListImpl implements RapperList {
    @Override
    public List<RapperInfo> getRappers() {
        List<RapperInfo> rappers = new ArrayList<>();
        rappers.add(new Rapper("2Pac", "Gangsta rap", "ニューヨーク", "1987", "2Pac（トゥパック）は、アメリカのヒップホップMCで俳優でした。彼は1971年にニューヨークのハーレム地区で生まれ、ブラックパンサー党の活動家だった母親の影響を受けました。彼は高校を中退してカリフォルニアに移り、デジタル・アンダーグラウンドというグループに加入しました。彼は1991年にソロデビューし、その後も多くのアルバムや映画に出演しました。彼の音楽は社会問題や黒人の苦悩を率直に表現し、多くのファンや批評家から高い評価を得ました。しかし、彼は東海岸と西海岸のヒップホップの対立に巻き込まれ、1996年にラスベガスで銃撃されて死亡しました。彼はヒップホップ史上最も影響力のあるアーティストの一人として認められています"));
        rappers.add(new Rapper("REAL-T", "Jrap", "大阪", "2019", "大阪生野区出身のラッパーであり、REALグループという犯罪グループのナンバー２である。今は逮捕されており出所するのは2027あたりといわれている。"));
        rappers.add(new Rapper("Vin jay", "HIPHOP", "ニューヨーク", "2017", "アメリカのラッパーであり、高速なラップが特徴のラッパー"));
        rappers.add(new Rapper("Maiji", "Jrap", "北九州", "2020", "北九州出身のラッパーであり、フリースタイルや音源などでたびたび話題となるMC。小倉を主に活動している。"));
        rappers.add(new Rapper("DTF", "Mumble rap", "フランス", "2015", "フランスのラッパーであり、二人で活動している。不思議な感覚に陥れるリズムが頭に残る。"));
        rappers.add(new Rapper("Karma", "UK drill", "ロンドン", "2021", "ロンドンを主に活動しており、ZONE2というギャングの一員であり、唯一捕まっていない。今までに殺害してきたラッパーの名前を曲に入れるいかれっぷり。"));
        rappers.add(new Rapper("Kanye West", "HIPHOP", "イリノイ", "2004", "とりあえず有名なラッパー。"));
        rappers.add(new Rapper("Lil Wayne", "HIPHOP", "ルイジアナ", "1999", "とりあえず有名なラッパー。"));
        rappers.add(new Rapper("Snoop Dogg", "Gangsta rap", "カリフォルニア", "1992", "2Pacにならび伝説的なラッパー。元cripsに所属していたがいまだに生き延びている。"));
        rappers.add(new Rapper("TAKABO", "Jrap", "北九州", "2018", "北九州の城を保有している謎多きラッパー。本職とみられる刺青の人たちとMVをとっており怖がられているラッパーの一人。"));
        return rappers;
    }
}
