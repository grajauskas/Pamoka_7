package lt.egidijusman;

import java.time.LocalDate;

public class Darbuotojas {
    private String name;
    private String lastName;
    private String asmensKodas;
    private int amzius;
    private String pareigos;
    private int stazas;

    public Darbuotojas(String name, String lastName, String asmensKodas) {
        this.name = name;
        this.lastName = lastName;
        this.asmensKodas = asmensKodas;
        this.amzius = paskaiciuokAmziu();


    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAsmensKodas() {
        return asmensKodas;
    }

    public int getAmzius() {
        return amzius;
    }

    public String getPareigos() {
        return pareigos;
    }

    public int getStazas() {
        return stazas;
    }

    public void setPareigos(String pareigos) {
        this.pareigos = pareigos;
    }

    public void setStazas(int stazas) {
        this.stazas = stazas;
    }

    private int paskaiciuokAmziu() {

        char pirmasAkSkaicius = asmensKodas.charAt(0);
        int gimimoMetai = Integer.parseInt(asmensKodas.substring(1, 3));
        int einamiMetai = LocalDate.now().getYear();

        switch (pirmasAkSkaicius) {
            case '3':
            case '4':
                gimimoMetai += 1900;
                break;
            case '5':
            case '6':
                gimimoMetai += 2000;
                break;
            default:
                System.out.println("Ivestas blogai asmens kodas");


        }
        return einamiMetai - gimimoMetai;
    }

    public void spausdingDarbuotojoInfo() {
        System.out.println(String.format(
                "Darbuotojas [vardas: %s, pavarde: %s, ak: %s, amzius: %s, pareigos: %s, stazas: %s]",
                this.name,
                this.lastName,
                this.asmensKodas,
                this.amzius,
                this.pareigos,
                this.stazas
        ));


    }

}
