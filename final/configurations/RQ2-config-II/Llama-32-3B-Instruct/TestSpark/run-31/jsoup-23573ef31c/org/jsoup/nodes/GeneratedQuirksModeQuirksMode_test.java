package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedQuirksModeQuirksMode_test {

    @Test
    public void quirksModeQuirksMode_test() {
        QuirksMode quirksMode = QuirksMode.LOWEST;
        Document document = Document.createShell("http://example.com");
        document.quirksMode(quirksMode);
        assertEquals(quirksMode, document.quirksMode());
    }

}