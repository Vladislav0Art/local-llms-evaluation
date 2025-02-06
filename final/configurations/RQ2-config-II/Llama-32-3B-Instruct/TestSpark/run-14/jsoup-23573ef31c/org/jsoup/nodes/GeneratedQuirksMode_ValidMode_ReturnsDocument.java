package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.select.Elements;

public class GeneratedQuirksMode_ValidMode_ReturnsDocument {

    @Test
    public void quirksMode_ValidMode_ReturnsDocument() {
        MockQuirksMode mockQuirksMode = new MockQuirksMode();
        Document document = Document.createShell("");
        document.quirksMode(mockQuirksMode);
        assertNotNull(document.charset());
        assertEquals(mockQuirksMode, document.quirksMode());
    }

}