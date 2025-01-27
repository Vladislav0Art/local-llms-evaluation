package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedSetQuirksMode {

    @Test
    public void setQuirksMode() {
        Document document = new Document("https://www.example.com");
        QuirksMode quirksMode = QuirksMode.Critical;
        document.quirksMode(quirksMode);
        assertEquals(quirksMode, document.quirksMode());
    }

}