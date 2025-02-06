package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void newNodeStringDataTest() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void newNodeSetDataTest() {
        Comment comment = new Comment("");
        String data = "new data";
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void outerHtmlHeadTestWithEmptyData() throws IOException {
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, depth, out);
        // No data to render
    }

    @Test
    public void outerHtmlHeadTestWithData() throws IOException {
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, depth, out);
        // Some data to render
    }

    @Test
    public void outerHtmlTailTestWithEmptyData() {
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, depth, out);
        // No data to render
    }

    @Test
    public void outerHtmlTailTestWithData() {
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("data");
        comment.outerHtmlTail(accum, depth, out);
        // Some data to render
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("");
        Comment clonedComment = comment.clone();
        assertNotEquals(comment, clonedComment);
        assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("");
        boolean result = comment.isXmlDeclaration();
        assertTrue(result);
    }

    @Test
    public void asXmlDeclarationTestWithEmptyData() {
        XmlDeclaration xmlDeclaration = Mockito.mock(XmlDeclaration.class);
        Comment comment = new Comment("");
        Comment asXmlDeclaration = comment.asXmlDeclaration();
        assertNotEquals(null, asXmlDeclaration);
    }

    @Test
    public void asXmlDeclarationTestWithData() {
        String data = "data";
        XmlDeclaration xmlDeclaration = Mockito.mock(XmlDeclaration.class);
        Comment comment = new Comment(data);
        Comment asXmlDeclaration = comment.asXmlDeclaration();
        // Some data to render
    }

}