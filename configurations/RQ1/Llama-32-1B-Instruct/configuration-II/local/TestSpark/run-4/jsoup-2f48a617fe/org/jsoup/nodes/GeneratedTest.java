package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void commentNodeName() {
        Comment comment = new Comment("#comment");
        assertEquals("[MethodUnderTest][Scenario]Test", comment.nodeName());
    }

    @Test
    public void getData() {
        Comment comment = new Comment("This is a comment");
        assertEquals("This is a comment", comment.getData());
    }

    @Test
    public void setData() {
        Comment comment = new Comment("");
        comment.setData("");
        assertEquals("[MethodUnderTest][Scenario]Test", comment.nodeName());
    }

    @Test
    public void outerHtmlHead() {
        // intentionally throw an exception
    }

    @Test
    public void outerHtmlTail() {
        // intentionally do nothing
    }

    @Test
    public void toString() {
        Comment comment = new Comment("This is a comment");
        assertEquals("[MethodUnderTest][Scenario]Test", comment.toString());
    }

    @Test
    public void isXmlDeclaration() {
        // intentionally throw an exception
    }

    @Test
    public void asXmlDeclaration() {
        String data = "#comment";
        XmlDeclaration xmlDecl = new Comment().asXmlDeclaration();
        assertNull(xmlDecl);
    }

}