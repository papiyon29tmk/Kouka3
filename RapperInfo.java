class RapperInfo {
    private String name;
    private String genre;
    private String origin;
    private String debutYear;
    private String detail;

    public RapperInfo(String name, String genre, String origin, String debutYear, String detail) {
        this.name = name;
        this.genre = genre;
        this.origin = origin;
        this.debutYear = debutYear;
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDebutYear() {
        return debutYear;
    }

    public String getDetail() {
        return detail;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDebutYear(String debutYear) {
        this.debutYear = debutYear;
    }

    public void setDetail(String detail){
        this.detail = detail;
    }
}