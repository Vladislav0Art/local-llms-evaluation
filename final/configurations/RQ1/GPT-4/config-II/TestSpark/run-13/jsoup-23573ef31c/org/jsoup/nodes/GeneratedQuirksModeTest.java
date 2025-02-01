package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.select.Selector;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedQuirksModeTest {

    @Test
    public void quirksModeTest() {
        Document doc = new Document("");
        doc.quirksMode(Document.QuirksMode.quirks);
        assertEquals(Document.QuirksMode.quirks, doc.quirksMode());
    }

}