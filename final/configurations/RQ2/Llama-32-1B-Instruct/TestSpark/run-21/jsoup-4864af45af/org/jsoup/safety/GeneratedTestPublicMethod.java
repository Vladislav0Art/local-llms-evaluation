package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestPublicMethod {

    @Test
    public void testPublicMethod() {
        String jsoupHtml = "<html><body>This is a sample HTML page</body></html>";
        Document doc = Jsoup.parse(jsoupHtml);
        System.out.println(doc.text());
    }

    public String add(int a, int b) {
        return Integer.toString(a + b);
    }

}