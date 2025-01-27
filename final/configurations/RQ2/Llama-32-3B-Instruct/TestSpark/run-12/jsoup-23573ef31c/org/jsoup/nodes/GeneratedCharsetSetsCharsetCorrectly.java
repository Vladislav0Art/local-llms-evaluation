package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class GeneratedCharsetSetsCharsetCorrectly {

    @Test
    public void charsetSetsCharsetCorrectly() {
        Charset charset = Charset.forName("UTF-8");
        Document doc = new Document();
        doc.charset(charset);
        assertEquals(charset, doc.charset());
    }

}