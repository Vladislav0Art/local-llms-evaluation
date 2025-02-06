package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.ParserSettings;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.InputSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.Document.parse;
import static org.jsoup.nodes.ParserSettings.defaultConstructor;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void [CommentConstructor]

    Test() {
        String data = "test";
        LeafNode comment = new Comment(data);
        assertNotNull(comment);
    }

    @Test
    public void [CommentNodeName]

    Test() {
        String data = "test";
        LeafNode comment = new Comment(data);
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void [CommentDataGet]

    Test() {
        String data = "test";
        LeafNode comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void [CommentDataSet]

    Test() {
        String data = "new test";
        LeafNode comment = new Comment("old test");
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void [OuterHtmlHead]

    Test() throws IOException {
        Document document = parse(new InputSource("<div><comment>test</comment></div>"));
        Element element = document.body().firstChild();
        assertNotNull(element);
        LeafNode comment = (LeafNode) element;
        Appendable appendable = new java.util.ArrayList<>();
        comment.outerHtmlHead(appendable, 0, out);
        assertEquals("<div><p>test</p></div>", appendable.toString());
    }

    @Test
    public void [OuterHtmlTail]

    Test() {
        Document document = parse(new InputSource("<div><comment>test</comment></div>"));
        Element element = document.body().firstChild();
        assertNotNull(element);
        LeafNode comment = (LeafNode) element;
        Appendable appendable = new java.util.ArrayList<>();
        comment.outerHtmlTail(appendable, 0, out);
        assertEquals("", appendable.toString());
    }

    @Test
    public void [ToString]

    Test() {
        String data = "test";
        LeafNode comment = new Comment(data);
        assertNotNull(comment.toString());
    }

    @Test
    public void [Clone]

    Test() throws IOException {
        Document document = parse(new InputSource("<div><comment>test</comment></div>"));
        Element element = document.body().firstChild();
        assertNotNull(element);
        LeafNode comment = (LeafNode) element;
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
    }

    @Test
    public void [IsXmlDeclaration]

    Test() {
        String data = "test";
        LeafNode comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void [AsXmlDeclaration]

    Test() {
        String data = "test";
        LeafNode comment = new Comment(data);
        assertNotNull(comment.asXmlDeclaration());
    }

}