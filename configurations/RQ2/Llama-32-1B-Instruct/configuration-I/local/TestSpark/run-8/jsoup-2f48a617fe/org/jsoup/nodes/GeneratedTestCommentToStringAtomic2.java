package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestCommentToStringAtomic2 {

    private static String data = "Example text";

    /**
     * Test that comment creation is atomic.
     */

    @Test
    public void testCommentToStringAtomic2() {
        Element comment = (Element) doc.evaluate("//comment()[1]", doc, null, java.util.NamespaceDeclaration.).firstResult();
        String output = comment.outerHtml();
        assertEquals(data, output);
    }

}