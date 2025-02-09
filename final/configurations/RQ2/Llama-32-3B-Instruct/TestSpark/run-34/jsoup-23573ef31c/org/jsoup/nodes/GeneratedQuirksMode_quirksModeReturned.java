package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

@RunWith(JUnit4.class)
public class GeneratedQuirksMode_quirksModeReturned {

    @Test
    public void quirksMode_quirksModeReturned() {
        QuirksMode quirksMode = QuirksMode.COMPATIBLE;
        Document document = Document.createShell(quirksMode.toString());
        assertEquals(quirksMode, document.quirksMode());
    }

}