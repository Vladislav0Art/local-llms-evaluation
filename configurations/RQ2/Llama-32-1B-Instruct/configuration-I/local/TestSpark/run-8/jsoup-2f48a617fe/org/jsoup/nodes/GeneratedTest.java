package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    private static String data = "Example text";

    /**
     * Test that comment creation is atomic.
     */

    @Test
    public void testCommentCreationAtomic() {
        doc.appendChild(doc.createElement("comment"));
        Element comment = (Element) doc.evaluate("//comment()[1]", doc, null, java.util.NamespaceDeclaration.).firstResult();
        assertEquals(data, comment.data());
    }

    @Test
    public void testCommentDataSetAtomic() {
        doc.appendChild(doc.createElement("comment"));
        Element comment = (Element) doc.evaluate("//comment()[1]", doc, null, java.util.NamespaceDeclaration.).firstResult();
        comment.setData(data);
        assertEquals(data, comment.data());
    }

    @Test
    public void testCommentToStringAtomic() {
        doc.appendChild(doc.createElement("comment"));
        Element comment = (Element) doc.evaluate("//comment()[1]", doc, null, java.util.NamespaceDeclaration.).firstResult();
        String output = comment.toString();
        assertEquals(data, output);
    }

    @Test
    public void testCommentEqualsAtomic() {
        Element comment1 = (Element) doc.evaluate("//comment()[1]", doc, null, java.util.NamespaceDeclaration.).firstResult();
        Element comment2 = (Element) doc.evaluate("//comment()[1]", doc, null, java.util.NamespaceDeclaration.).firstResult();
        assertEquals(data, comment1.data());
        assertEquals(data, comment2.data());
    }

    @Test
    public void testCommentNotEqualsAtomic() {
        Element comment1 = (Element) doc.evaluate("//comment()[1]", doc, null, java.util.NamespaceDeclaration.).firstResult();
        Element comment2 = (Element) doc.evaluate("//comment()[2]", doc, null, java.util.NamespaceDeclaration.).firstResult();
        assertEquals(data, comment1.data());
        assertEquals(data, comment2.data());
    }

    @Test
    public void testCommentIsXmlDeclarationAtomic() {
        Element comment = (Element) doc.evaluate("//comment()[1]", doc, null, java.util.NamespaceDeclaration.).firstResult();
        String output = comment.outerHtml();
        assertEquals(data, output);
    }

    @Test
    public void testCommentToStringAtomic2() {
        Element comment = (Element) doc.evaluate("//comment()[1]", doc, null, java.util.NamespaceDeclaration.).firstResult();
        String output = comment.outerHtml();
        assertEquals(data, output);
    }

    @Test
    public void testCommentEqualsAtomic2() {
        Element comment1 = (Element) doc.evaluate("//comment()[1]", doc, null, java.util.NamespaceDeclaration.).firstResult();
        Element comment2 = (Element) doc.evaluate("//comment()[1]", doc, null, java.util.NamespaceDeclaration.).firstResult();
        assertEquals(data, comment1.data());
        assertEquals(data, comment2.data());
    }

}