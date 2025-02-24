package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("test");
        assertEquals("test", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test");
        comment.setData("updated");
        assertEquals("updated", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Appendable appendable = Mockito.mock(Appendable.class);
        Document.OutputSettings outputSettings = Mockito.mock(Document.OutputSettings.class);
        Comment comment = new Comment("test");
        comment.outerHtmlHead(appendable, 1, outputSettings);
        Mockito.verify(appendable).append("<!--test-->");
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Appendable appendable = Mockito.mock(Appendable.class);
        Document.OutputSettings outputSettings = Mockito.mock(Document.OutputSettings.class);
        Comment comment = new Comment("test");
        comment.outerHtmlTail(appendable, 1, outputSettings);
        Mockito.verify(appendable).append("");
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("test");
        assertEquals("Comment[test]", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test");
        Comment clonedComment = comment.clone();
        assertEquals("Comment[test]", clonedComment.toString());
    }

}