package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void CommentConstructorTest() {
        String testData = "test data";
        Comment comment = new Comment(testData);
        assertEquals(comment.getData(), testData);
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("test data");
        assertEquals(comment.nodeName(), "#comment");
    }

    @Test
    public void getDataTest() {
        String testData = "test data";
        Comment comment = new Comment(testData);
        assertEquals(comment.getData(), testData);
    }

    @Test
    public void setDataTest() {
        String testData = "test data";
        Comment comment = new Comment(testData);
        comment.setData("new data");
        assertEquals(comment.getData(), "new data");
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("test data");
        Appendable accum = Mockito.mock(Appendable.class);
        when(accum.append(Mockito.anyString())).thenReturn(accum);
        comment.outerHtmlHead(accum, 0, new Document.OutputSettings());
        Mockito.verify(accum).append("<!--test data-->");
    }

}