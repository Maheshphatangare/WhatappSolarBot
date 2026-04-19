package com.bott.bot;

public class SolarService {

    public String processMessage(String msg) {

        if (msg.contains("3kw")) {
            return calculate(3);
        } else if (msg.contains("5kw")) {
            return calculate(5);
        } else if (msg.contains("subsidy")) {
            return subsidyInfo();
        } else {
            return "👋 Welcome!\nSend:\n1. 3kW\n2. 5kW\n3. subsidy";
        }
    }

    private String calculate(int kw) {
        int pricePerKW = 65000;
        int subsidyPerKW = 18000;

        int total = kw * pricePerKW;
        int subsidy = kw * subsidyPerKW;
        int finalPrice = total - subsidy;

        return "⚡ " + kw + "kW Solar System\n\n" +
                "Price: ₹" + total + "\n" +
                "Subsidy: ₹" + subsidy + "\n" +
                "Final Cost: ₹" + finalPrice;
    }

    private String subsidyInfo() {
        return "Govt subsidy available approx ₹18,000 per kW under PM scheme.";
    }
}
