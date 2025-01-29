package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestData {

    private Document document = new Document();

    @Test
    public void testData() {
        assertEquals("", document.data());
        assertEquals("test", document.data("test"));
    }

}