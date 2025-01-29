package org.jsoup.nodes;

public class GeneratedTestCharset {

    private Document document;

    @Test
    public void testCharset() {
        // Test charset method of Document class
        String expected = "utf-8";
        assertEquals(expected, document.charset());
    }

}