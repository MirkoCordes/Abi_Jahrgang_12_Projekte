package com.MirkoCordes.OOP;

public class Main {

    public static void main(String[] args) {
        //ToDo: 
        //Stringarray erzeugen mit Namen
        //Ticketarray erzeugen mit Ticketnamen
        //evtl. Zonenarray erzeugen
        //evtl. Datumarray erzeugen

        System.out.println("Anzahl der Schwarzfahrer: ");
        Einzelticket einsTicket1 = new Einzelticket(3, "20200329", 1);
        Einzelticket einsTicket2 = new Einzelticket(4, "20200529", 1);
        Mehrfahrtenkarte mehrfahrtenkarte = new Mehrfahrtenkarte(70, 7, 1);
        Generalabo generalabo = new Generalabo(4, "Hans Peter", "20210320");

        System.out.println("Schwarzfahrer: " + kontrolliere());
    }

    public int kontrolliere(String[] namen, Ticket[] tickets, int zone, String datum) {
        int schwarzFahrer = 0;

        if (namen.length != tickets.length)
            throw new IllegalArgumentException();

        // IHR CODE HIER!
        for(int i=0; i<10; i++){
            if(tickets[i].istEntwertet()){
                schwarzFahrer++;
            } else if(!tickets[i].gueltigInZone(zone)){
                schwarzFahrer++;
            }else {
                tickets[i].entwerten();
            }
        }

        return schwarzFahrer;
    }
}
