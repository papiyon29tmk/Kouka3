import java.util.ArrayList;
import java.util.List;

class RapperListImpl implements RapperList {
    @Override
    public List<Rapper> getRappers() {
        List<Rapper> rappers = new ArrayList<>();
        rappers.add(new Rapper("2Pac", "Gangsta rap", "ニューヨーク", "1987"));
        rappers.add(new Rapper("REAL-T", "Jrap", "大阪", "2019"));
        rappers.add(new Rapper("Vin jay", "Hip Hop", "ニューヨーク", "2017"));
        rappers.add(new Rapper("Maiji", "Jrap", "北九州", "2020"));
        rappers.add(new Rapper("DTF", "Hip Hop", "フランス", "2015"));
        rappers.add(new Rapper("Jay-Z", "Hip Hop", "ニューヨーク", "1996"));
        rappers.add(new Rapper("Kanye West", "Hip Hop", "イリノイ", "2004"));
        rappers.add(new Rapper("Lil Wayne", "Hip Hop", "ルイジアナ", "1999"));
        rappers.add(new Rapper("Snoop Dogg", "Gangsta rap", "カリフォルニア", "1992"));
        rappers.add(new Rapper("TAKABO", "Jrap", "北九州", "2018"));
        return rappers;
    }
}
