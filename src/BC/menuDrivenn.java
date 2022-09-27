package BC;

public class menuDrivenn {
        Integer tea;
        Integer coffee;
        Integer idli;
        Integer dosa;

    public menuDrivenn(Integer tea, Integer coffee, Integer idli, Integer dosa) {
        this.tea = tea;
        this.coffee = coffee;
        this.idli = idli;
        this.dosa = dosa;
    }

    public Integer getTea() {
        return tea;
    }

    public void setTea(Integer tea) {
        this.tea = tea;
    }

    public Integer getCoffee() {
        return coffee;
    }

    public void setCoffee(Integer coffee) {
        this.coffee = coffee;
    }

    public Integer getIdli() {
        return idli;
    }

    public void setIdli(Integer idli) {
        this.idli = idli;
    }

    public Integer getDosa() {
        return dosa;
    }

    public void setDosa(Integer dosa) {
        this.dosa = dosa;
    }
}
