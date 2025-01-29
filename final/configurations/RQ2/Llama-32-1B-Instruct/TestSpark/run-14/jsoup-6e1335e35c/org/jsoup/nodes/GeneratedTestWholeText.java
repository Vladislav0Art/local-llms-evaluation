package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestWholeText {

    private Document document = new Document();

    @Test
    public void testWholeText() {
        assertEquals("", document.wholeText());
        assertEquals("<script>alert('Hello')</script>", document.wholeOwnText());
    }

}