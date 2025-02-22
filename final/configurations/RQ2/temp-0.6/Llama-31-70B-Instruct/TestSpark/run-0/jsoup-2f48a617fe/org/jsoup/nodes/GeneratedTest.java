package org.jsoup.nodes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.jsoup.nodes.Comment;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Hello World!");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Hello World!");
        assertEquals("Hello World!", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Hello World!");
        comment.setData("Hi There!");
        assertEquals("Hi There!", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("Hello World!");
        StringBuilder builder = new StringBuilder();
        comment.outerHtmlHead(builder, 0, new Document.OutputSettings());
        assertEquals("<!--Hello World!-->", builder.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("Hello World!");
        StringBuilder builder = new StringBuilder();
        comment.outerHtmlTail(builder, 0, new Document.OutputSettings());
        assertEquals("", builder.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Hello World!");
        assertEquals("<!--Hello World!-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Hello World!").clone();
        assertEquals("Hello World!", comment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        assertEquals(true, comment.isXmlDeclaration());
    }

}