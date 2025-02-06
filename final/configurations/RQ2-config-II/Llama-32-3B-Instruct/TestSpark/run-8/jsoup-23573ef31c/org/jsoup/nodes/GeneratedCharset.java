package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCharset {

    @Test
    public void charset() {
        Charset charset = Charset.forName("UTF-8");
        Document document = Jsoup.parse("<html><body>Hello World!</body></html>", "utf-8");
        assertEquals(charset, document.charset());
    }

}