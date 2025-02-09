package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedQuirksModeSetterTest {

    @Test
    public void quirksModeSetterTest() throws IOException {
        QuirksMode mode = QuirksMode.COE; // Default value
        Document document = new Document();
        document.quirksMode(mode);
        assertEquals(mode, document.quirksMode());
    }

}