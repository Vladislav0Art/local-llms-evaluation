package org.jsoup.nodes;

public class GeneratedTestConnectionNull {

    @Test
    public void testConnectionNull() {
        Document document = new Document();
        assertThrows(NullPointerException.class, () -> document.connection(null));
    }
}

}