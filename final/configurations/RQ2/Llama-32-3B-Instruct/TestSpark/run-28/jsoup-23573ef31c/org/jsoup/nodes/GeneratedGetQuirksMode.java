package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedGetQuirksMode {

    @Test
    public void getQuirksMode() {
        Document document = new Document("https://www.example.com");
        QuirksMode quirksMode = document.quirksMode();
        assertTrue(quirksMode == null || quirksMode.equals(QuirksMode.BrowserDefault));
    }

}