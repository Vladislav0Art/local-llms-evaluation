package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void newNodeCommentDataIsCorrect() {
        String data = "This is a comment";
        Comment node = new Comment(data);
        assertEquals(data, node.getData());
    }

    @Test
    public void newNodeNameNodeNameIsCorrect() {
        String data = "This is a comment";
        Comment node = new Comment(data);
        assertEquals("comment", node.nodeName());
    }

    @Test
    public void cloneMethodDoesNotReturnNull() throws Exception {
        Parser parser = new Parser();
        Document document = parser.parse("<div><!-- This is a comment -->\n<div>Inner div</div></div>");
        Element element = document.selectFirst("div").firstChild();
        Comment node = (Comment) element;
        Comment clone = node.clone();
        assertNotNull(clone);
    }

    @Test
    public void outerHtmlHeadMethodDoesNotThrowException() throws Exception {
        Parser parser = new Parser();
        Document document = parser.parse("<div><!-- This is a comment -->\n<div>Inner div</div></div>");
        Element element = document.selectFirst("div").firstChild();
        Comment node = (Comment) element;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Node accum = new Appendable() {
            @Override
            public void append(char ch) throws IOException {
            }
        };
        node.outerHtmlHead(out, 0, null);
        assertEquals(50, out.size());
    }

    @Test
    public void outerHtmlTailMethodDoesNotThrowException() throws Exception {
        Parser parser = new Parser();
        Document document = parser.parse("<div><!-- This is a comment -->\n<div>Inner div</div></div>");
        Element element = document.selectFirst("div").firstChild();
        Comment node = (Comment) element;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Node accum = new Appendable() {
            @Override
            public void append(char ch) throws IOException {
            }
        };
        node.outerHtmlTail(out, 0, null);
        assertEquals(19, out.size());
    }

    @Test
    public void toStringMethodReturnsCorrectString() {
        Comment node = new Comment("This is a comment");
        String str = node.toString();
        assertTrue(str.contains("<!--"));
        assertTrue(str.endsWith("-->"));
    }

    @Test
    public void asXmlDeclarationMethodReturnsNullWhenNotDeclaration() {
        Parser parser = new Parser();
        Document document = parser.parse("<div><!-- This is a comment -->\n<div>Inner div</div></div>");
        Element element = document.selectFirst("div").firstChild();
        Comment node = (Comment) element;
        assertEquals(null, node.asXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationMethodReturnsCorrectXmlDeclaration() {
        Parser parser = new Parser();
        Document document = parser.parse("<div><?xml version=\"1.0\"?><!-- This is a comment -->\n<div>Inner div</div></div>");
        Element element = document.selectFirst("div").firstChild();
        Comment node = (Comment) element;
        XmlDeclaration xmlDeclaration = node.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
    }

}