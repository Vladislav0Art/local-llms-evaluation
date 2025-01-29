package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestShouldIndent {

    private Document document = new Document();

    @Test
    public void testShouldIndent() {
        assertTrue(document.shouldIndent(new Document.OutputSettings()));
        assertFalse(document.shouldIndent(new Document.OutputSettings(true)));
    }

}