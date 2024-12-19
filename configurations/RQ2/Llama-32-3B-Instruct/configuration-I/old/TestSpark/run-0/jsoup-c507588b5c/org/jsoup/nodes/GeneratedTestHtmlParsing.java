package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

public class GeneratedTestHtmlParsing {

    @Test
    public void testHtmlParsing() throws IOException {
        String html = "<html><body>Hello World</body></html>";
        Jsoup soup = Jsoup.parse(html);
        String accum = "";

        for (org.jsoup.nodes.Element element : soup.body().elements()) {
            accum += element.toString();
        }

        assertEquals("<html><body>Hello World</body></html>", accum);

        if (!accum.contains("Hello World")) {
            fail("Expected accumulation to contain \"Hello World\", but it didn't");
        }
    }

}