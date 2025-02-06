package org.jsoup.nodes;

public class GeneratedTestUpdateMetaCharsetElementFalse {

    @Test
    public void testUpdateMetaCharsetElementFalse() {
        boolean update = false;
        Document document = new Document("");
        document.updateMetaCharsetElement(update);
        assertFalse(document.updateMetaCharsetElement());
    }

}