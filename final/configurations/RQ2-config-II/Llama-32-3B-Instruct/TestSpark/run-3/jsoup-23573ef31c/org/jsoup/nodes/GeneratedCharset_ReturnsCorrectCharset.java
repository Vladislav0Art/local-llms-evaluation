package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedCharset_ReturnsCorrectCharset {

    @Test
    public void charset_ReturnsCorrectCharset() {
        Charset charset = Charset.forName("UTF-8");
        Document document = new Document(charset.name());
        assertEquals(charset, document.charset());
    }

}