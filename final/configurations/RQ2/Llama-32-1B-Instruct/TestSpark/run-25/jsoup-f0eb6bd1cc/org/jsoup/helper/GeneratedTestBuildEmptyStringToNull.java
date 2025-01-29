package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestBuildEmptyStringToNull {

    public static String getJsoupUrl(String url) {
        try {
            return Jsoup.connect(url).get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testBuildEmptyStringToNull() {
        String url = "";
        try {
            URLBuilder builder = new URLBuilder(url);
            assertNotNull(builder.build());
        } catch (RuntimeException e) {
            System.out.println("URLBuilder has null value");
        }
    }

}