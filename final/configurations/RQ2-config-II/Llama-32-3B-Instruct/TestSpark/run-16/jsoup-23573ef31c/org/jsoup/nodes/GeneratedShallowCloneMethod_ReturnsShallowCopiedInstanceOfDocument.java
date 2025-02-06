package org.jsoup.nodes;

public class GeneratedShallowCloneMethod_ReturnsShallowCopiedInstanceOfDocument {

    @Test
    public void shallowCloneMethod_ReturnsShallowCopiedInstanceOfDocument() {
        String html = "<html><body>Hello World!</body></html>";
        Document originalDoc = Jsoup.parse(html);
        Document clonedDoc = originalDoc.clone();
        assertNotNull(clonedDoc);
        assertTrue(clonedDoc instanceof Document);
        assertEquals(originalDoc, clonedDoc.shallowClone());
    }

}