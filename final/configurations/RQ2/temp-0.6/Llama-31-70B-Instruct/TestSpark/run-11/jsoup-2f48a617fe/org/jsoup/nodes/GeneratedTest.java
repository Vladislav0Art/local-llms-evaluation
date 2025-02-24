package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void DataTest() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void SetDataTest() {
        Comment comment = new Comment("data");
        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

    @Test
    public void NodeNameTest() {
        Comment comment = new Comment("data");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void OuterHtmlHeadTest() throws IOException {
        Comment comment = new Comment("data");
        Appendable appendable = Mockito.mock(Appendable.class);
        when(appendable.append("<!--data-->")).thenReturn(appendable);
        comment.outerHtmlHead(appendable, 1, Mockito.mock(Document.OutputSettings.class));
        Mockito.verify(appendable).append("<!--data-->");
    }

    @Test
    public void OuterHtmlTailTest() throws IOException {
        Comment comment = new Comment("data");
        Appendable appendable = Mockito.mock(Appendable.class);
        when(appendable.append("<!--data-->")).thenReturn(appendable);
        comment.outerHtmlTail(appendable, 1, Mockito.mock(Document.OutputSettings.class));
        Mockito.verify(appendable).append("<!--data-->");
    }

    @Test
    public void ToStringTest() {
        Comment comment = new Comment("data");
        assertEquals("Comment[data]", comment.toString());
    }

}