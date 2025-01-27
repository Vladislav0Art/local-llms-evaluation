package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedQuirksModeSetsCorrectQuirksMode {

    @Test
    public void quirksModeSetsCorrectQuirksMode() {
        QuirksMode quirksMode = QuirksMode.Automatic;
        Document document = new Document("http://example.com");
        Document result = document.quirksMode(quirksMode);
        assertNotNull(result);
        assertEquals(quirksMode, result.quirksMode());
    }

}