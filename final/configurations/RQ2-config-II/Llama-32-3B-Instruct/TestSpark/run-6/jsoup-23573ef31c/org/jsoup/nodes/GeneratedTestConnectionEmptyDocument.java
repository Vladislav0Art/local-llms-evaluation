package org.jsoup.nodes;

public class GeneratedTestConnectionEmptyDocument {

    @Test
    public void testConnectionEmptyDocument() {
        Document document = new Document("");
        assertNull(document.connection());
    }

}