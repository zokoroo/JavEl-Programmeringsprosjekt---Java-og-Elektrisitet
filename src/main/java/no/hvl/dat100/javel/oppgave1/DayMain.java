package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        // Tester av funksjoner
        DailyPower.printPowerPrices(powerprices_day);
        DailyPower.printPowerUsage(powerusage_day);
        DailyPower.computePowerUsage(powerusage_day);
        DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        System.out.printf("%.2f NOK %n",DailyPower.computePowerSupport(powerusage_day, powerprices_day));
        System.out.printf("%.2f NOK %n", DailyPower.computeNorgesPrice(powerusage_day));
        System.out.printf("%.2f kWh %n", DailyPower.findPeakUsage(powerusage_day));
        System.out.printf("%.2f kWh %n", DailyPower.findAvgPower(powerusage_day));
    }
}
