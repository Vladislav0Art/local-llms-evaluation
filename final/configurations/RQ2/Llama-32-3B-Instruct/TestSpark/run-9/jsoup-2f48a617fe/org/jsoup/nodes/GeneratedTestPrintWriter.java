package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestPrintWriter {

    @Test
    public void testPrintWriter() throws Exception {
        String html = "<html><body>Hello, World!</body></html>";
        Document document = Jsoup.parse(html);

        java.io.PrintWriter writer = new java.io.PrintWriter(System.out);
        writer.print(document.toString());
        writer.close();
    }

}