package com.company;

public class Main {

    static Maschine[][] machines;

    public static void main(String[] args) {
	// write your code here
        ModellS modellS1 = new ModellS(1, 32, 1, 1, 1);
        ModellM modellM1 = new ModellM(1, 128, 2, 2, 1);
        ModellInfinity modellInfinity1 = new ModellInfinity(1, 256, 3, 1, 1);

    //Alle verfügbaren Maschinen
        Maschine farbMaschine1 = new Maschine(5, 15, "", "", true);
        Maschine speicherMaschine1 = new Maschine(2, 10, "farbMaschine", "", false);
        Maschine kameraMaschine1 = new Maschine(10, 12, "", "", true);
        Maschine simMaschine1 = new Maschine(5, 7, "farbMaschine", "kameraMaschine", false);
        Maschine sdMaschine1 = new Maschine(5, 6, "kameraMaschine", "simMaschine", false);

        Maschine farbMaschine2 = new Maschine(5, 15, "", "", false);
        Maschine kameraMaschine2 = new Maschine(10, 12, "", "", false);

        machines[0][0] = farbMaschine1;
        machines[0][1] = farbMaschine2;
        machines[2][0] = speicherMaschine1;
        machines[3][0] = kameraMaschine1;
        machines[3][1] = kameraMaschine2;
        machines[5][0] = simMaschine1;
        machines[6][0] = sdMaschine1;


        //Baue zusammen
        baueZusammen(modellM1);
        baueZusammen(modellS1);
        baueZusammen(modellInfinity1);
    }


    public static void baueZusammen(Handy modell){
        //Array für Bauteile
        int[] bauteile = {modell.getFarbe(), modell.getSpeicher(), modell.getKamera(), modell.getSimKarte(), modell.getSdKarte()};
        int bauteileDieVerbautWurden = 0;


        for(int i=0; i<7; i++) {

            if (machines[i][0].getVorgaenger1().equals("") && machines[i][0].getVorgaenger2().equals("") && !machines[i][0].getArbeitet() && bauteile[i] >= 1) {
                bauteile[i]= 0;
                machines[i][0].setArbeitet(true);
                bauteileDieVerbautWurden++;
            } else if(machines[i][0].getVorgaenger1().equals("farbMaschine") && bauteile[1] ==0 || machines[i][0].getVorgaenger1().equals("kameraMaschine") && bauteile[3] ==0){
                bauteile[i]= 0;
                machines[i][0].setArbeitet(true);
                bauteileDieVerbautWurden++;
            } else if(machines[i][0].getVorgaenger2().equals("kameraMaschine") && bauteile[3] ==0 || machines[i][0].getVorgaenger2().equals("simMaschine") && bauteile[5] ==0){
                bauteile[i]= 0;
                machines[i][0].setArbeitet(true);
                bauteileDieVerbautWurden++;
            }else {
                if(machines[i][0].isZweiMaschinen()){
                    if(machines[i][1].getVorgaenger1().equals("") && machines[i][1].getVorgaenger2().equals("") && !machines[i][1].getArbeitet() && bauteile[i] >=1){
                        bauteile[i]= 0;
                        machines[i][1].setArbeitet(true);
                        bauteileDieVerbautWurden++;
                    }
                }
            }
        }
        if(bauteileDieVerbautWurden == 5){
            System.out.println("Habe fertig!");
        } else{
            fehlendeKomponenten(bauteile, bauteileDieVerbautWurden);
        }
    }

    public static void fehlendeKomponenten(int[] bauteile, int b){
        int bauteileDieVerbautWurden = b;
        for(int i=0; i<7; i++){
                if (machines[i][0].getVorgaenger1().equals("") && machines[i][0].getVorgaenger2().equals("") && !machines[i][0].getArbeitet() && bauteile[i] >= 1) {
                    bauteile[i]= 0;
                    machines[i][0].setArbeitet(true);
                    bauteileDieVerbautWurden++;
                } else if(machines[i][0].getVorgaenger1().equals("farbMaschine") && bauteile[1] ==0 || machines[i][0].getVorgaenger1().equals("kameraMaschine") && bauteile[3] ==0){
                    bauteile[i]= 0;
                    machines[i][0].setArbeitet(true);
                    bauteileDieVerbautWurden++;
                } else if(machines[i][0].getVorgaenger2().equals("kameraMaschine") && bauteile[3] ==0 || machines[i][0].getVorgaenger2().equals("simMaschine") && bauteile[5] ==0){
                    bauteile[i]= 0;
                    machines[i][0].setArbeitet(true);
                    bauteileDieVerbautWurden++;
                }else {
                    if(machines[i][0].isZweiMaschinen()){
                        if(machines[i][1].getVorgaenger1().equals("") && machines[i][1].getVorgaenger2().equals("") && !machines[i][1].getArbeitet() && bauteile[i] >=1){
                            bauteile[i]= 0;
                            machines[i][1].setArbeitet(true);
                            bauteileDieVerbautWurden++;
                        }
                    }
                }
        }
        if(bauteileDieVerbautWurden == 5){
            System.out.println("Habe fertig!");
        } else{
            fehlendeKomponenten(bauteile, bauteileDieVerbautWurden);
        }

    }


}
