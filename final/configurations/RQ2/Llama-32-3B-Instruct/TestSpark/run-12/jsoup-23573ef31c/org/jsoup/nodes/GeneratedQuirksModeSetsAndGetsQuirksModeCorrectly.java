package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class GeneratedQuirksModeSetsAndGetsQuirksModeCorrectly {

    @Test
    public void quirksModeSetsAndGetsQuirksModeCorrectly() {
        QuirksMode mode = QuirksMode.Browser;
        Document doc = new Document();
        doc.quirksMode(mode);
        assertEquals(mode, doc.quirksMode());
    }

}