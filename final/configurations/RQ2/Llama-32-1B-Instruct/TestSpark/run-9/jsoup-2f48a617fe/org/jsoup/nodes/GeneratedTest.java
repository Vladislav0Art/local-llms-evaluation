package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;

public class GeneratedTest {

    @Test
    public void [Comment]

    NodeName() {
        Comment comment = new Comment("test");
        assertEquals(Comment.class, comment.nodeName());
    }

    @Test
    public void [Comment]

    Data() {
        String data = "test";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void [Comment]

    setData() {
        String data = "test";
        Comment comment = new Comment(data);
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void [outerHtmlHead]

    EmptyString() {
        Comment comment = new Comment("");
        comment.outerHtmlHead(null, 0, ParseSettings.getNoSettings());
        assertEquals("", comment.outerHtmlHead(null, 0, ParseSettings.getNoSettings()));
    }

    @Test
    public void [outerHtmlTail]

    EmptyString() {
        Comment comment = new Comment("");
        comment.outerHtmlTail(null, 0, ParseSettings.getNoSettings());
        assertEquals("", comment.outerHtmlTail(null, 0, ParseSettings.getNoSettings()));
    }

    @Test
    public void [outerHtmlHead]

    XmlDeclaration() {
        Comment comment = new Comment("test");
        comment.outerHtmlHead(new ParseSettings(), 1, Document.OutputSettings.html());
        String xml = comment.asXmlDeclaration();
        assertEquals("test", xml);
    }

    @Test
    public void [outerHtmlTail]

    XmlDeclaration() {
        Comment comment = new Comment("test");
        comment.outerHtmlTail(null, 0, ParseSettings.getNoSettings());
        String xml = comment.asXmlDeclaration();
        assertEquals("", xml);
    }

}