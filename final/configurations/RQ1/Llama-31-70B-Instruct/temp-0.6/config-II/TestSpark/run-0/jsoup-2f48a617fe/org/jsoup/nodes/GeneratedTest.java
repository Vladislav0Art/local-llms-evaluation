package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Hello World!");
        assertEquals("Hello World!", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Hello World!");
        comment.setData("Bye World!");
        assertEquals("Bye World!", comment.getData());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
        assertEquals("xml", xmlDeclaration.nodeName());
    }

    @Test
    public void asXmlDeclarationTest2() {
        Comment comment = new Comment("This is not an XML Declaration");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertEquals(null, xmlDeclaration);
    }

}