package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedCharset_string_test {

    @Test
    public void charset_string_test() {
        String charsetName = "UTF-8";
        Connection connection = Jsoup.connect(charsetName);
        Document document = new Document();
        document.charset(charsetName, connection);
        org.java.io.charset.Charset charset = org.java.io.charset.Charset.forName(charsetName);
        assertEquals(charset, document.charset());
    }

}