package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedQuirksModeTest {

    @Test
    public void quirksModeTest() {
        Document doc = new Document("");
        assertSame(doc, doc.quirksMode(QuirksMode.noQuirks));
        assertSame(QuirksMode.noQuirks, doc.quirksMode());
    }

}