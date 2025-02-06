package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class GeneratedCharsetSetterNotNullFound {

    @Test
    public void charsetSetterNotNullFound() {
        Connection connection = Jsoup.connect("http://example.com");
        Document document = Document.createShell(connection.getUri());
        Charset charset = Charset.forName("UTF-8");
        document.charset(charset);
        assertNotNull(document.charset());
    }

}