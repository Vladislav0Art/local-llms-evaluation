package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("data");
        String expectedNodeName = "comment";
        String actualNodeName = comment.nodeName();
        assertEquals(expectedNodeName, actualNodeName);
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("data");
        String expectedData = "data";
        String actualData = comment.getData();
        assertEquals(expectedData, actualData);
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("data");
        String expectedData = "new data";
        comment.setData(expectedData);
        String actualData = comment.getData();
        assertEquals(expectedData, actualData);
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("data");
        Appendable mockAppendable = Mockito.mock(Appendable.class);
        comment.outerHtmlHead(mockAppendable, 1, null);
        verify(mockAppendable, times(1)).append("<!---->");
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("data");
        Appendable mockAppendable = Mockito.mock(Appendable.class);
        comment.outerHtmlTail(mockAppendable, 1, null);
        verifyNoMoreInteractions(mockAppendable);
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("data");
        String expectedString = "#comment";
        String actualString = comment.toString();
        assertEquals(expectedString, actualString);
    }

}