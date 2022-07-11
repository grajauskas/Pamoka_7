package lt.egidijusman;

import java.util.ArrayList;
import java.util.List;

public class Imone {

    public Object getDabuotojai;
    String pavadinimas;
    int ikurimoMetai;
    List<Darbuotojas> dabuotojai;

    public Imone(String pavadinimas, int ikurimoMetai) {
        this.pavadinimas = pavadinimas;
        this.ikurimoMetai = ikurimoMetai;
        this.dabuotojai = new ArrayList<>();

    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public int getIkurimoMetai() {
        return ikurimoMetai;
    }

    public List<Darbuotojas> getDabuotojai() {
        return dabuotojai;
    }

    public void pridekDarbuotoja(Darbuotojas drb, String pareigos, int stazas) {
        drb.setPareigos(pareigos);
        drb.setStazas(stazas);
        this.dabuotojai.add(drb);
    }

    public void filtuokDarbuotojus(int stazas) {
        System.out.println("Isfiltruotojas darbuotoju sarasas kuriu stazas yra: " + stazas);
        dabuotojai.forEach(darb -> {
            if (darb.getStazas() >= stazas) {
                darb.spausdingDarbuotojoInfo();
            }
        });

    }


}
