package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Comment comment;

    @Test
    public void setDataTest() {
        comment.setData("Data");
        assertEquals("Data", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint(true);
        out.outline(true);
        comment.setData("Data");

        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!--Data-->", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint(true);
        out.outline(true);
        comment.setData("Data");

        comment.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() {
        comment.setData("Data");
        assertEquals("<!--Data-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment cloneComment = comment.clone();
        assertEquals(comment, cloneComment);
    }

    @Test
    public void isXmlDeclarationTest() {
        comment.setData("Data");
        assertEquals(false, comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        comment.setData("Data");
        assertEquals(null, comment.asXmlDeclaration());
    }

}