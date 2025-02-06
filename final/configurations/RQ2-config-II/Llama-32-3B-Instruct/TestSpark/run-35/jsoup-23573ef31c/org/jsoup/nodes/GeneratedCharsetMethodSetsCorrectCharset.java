package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCharsetMethodSetsCorrectCharset {

    @Test
    public void charsetMethodSetsCorrectCharset() {
        Charset charset = Charset.forName("UTF-8");
        Document document = new Document();
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

}