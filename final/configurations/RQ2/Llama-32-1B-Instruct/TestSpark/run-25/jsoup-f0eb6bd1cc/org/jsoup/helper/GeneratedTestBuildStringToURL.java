package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestBuildStringToURL {

    public static String getJsoupUrl(String url) {
        try {
            return Jsoup.connect(url).get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testBuildStringToURL() {
        String url = "https://www.example.com";
        URLBuilder builder = new URLBuilder(url);
        System.out.println(builder.build());
    }

}