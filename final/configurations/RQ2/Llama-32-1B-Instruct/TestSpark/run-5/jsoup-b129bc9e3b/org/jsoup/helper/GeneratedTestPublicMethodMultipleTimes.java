package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestPublicMethodMultipleTimes {

    public static void main(String[] args) {
        String url = "http://example.com";
        Document document = Jsoup.parse(url);
        System.out.println(document.selectFirst(".header").text().trim());
    }

    public static String generatePublicClass(String className, int numTimes) {
        StringBuilder sb = new StringBuilder();
        sb.append("public class ").append(className).append(" {\n");
        for (int i = 0; i < numTimes; i++) {
            sb.append("    public static void main(String[] args) {\n");
            sb.append("        Jsoup soup = new Jsoup(\"http://example.com\");\n");
            sb.append("        Element header = soup.selectFirst(\".header\");\n");
            sb.append("        System.out.println(header.text());\n");
            sb.append("    }\n");
            sb.append("}\n\n");
        }
        return sb.toString();
    }

    @Test
    public void testPublicMethodMultipleTimes() {
        String headerText = Main.generatePublicClass("PublicClass2", 20);
        System.out.println(headerText);
    }

}