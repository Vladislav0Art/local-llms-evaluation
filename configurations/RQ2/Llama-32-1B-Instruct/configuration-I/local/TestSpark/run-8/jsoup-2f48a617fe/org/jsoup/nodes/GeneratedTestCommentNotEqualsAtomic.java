package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestCommentNotEqualsAtomic {

    private static String data = "Example text";

    /**
     * Test that comment creation is atomic.
     */

    @Test
    public void testCommentNotEqualsAtomic() {
        Element comment1 = (Element) doc.evaluate("//comment()[1]", doc, null, java.util.NamespaceDeclaration.).firstResult();
        Element comment2 = (Element) doc.evaluate("//comment()[2]", doc, null, java.util.NamespaceDeclaration.).firstResult();
        assertEquals(data, comment1.data());
        assertEquals(data, comment2.data());
    }

}