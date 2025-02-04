package org.jsoup.nodes;

public class GeneratedTestParserNull {

    @Test
    public void testParserNull() {
        Document document = new Document();
        assertThrows(NullPointerException.class, () -> document.parser(null));
    }
}

}