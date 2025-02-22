package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Comment comment;

    @Test
    public void setDataTest() {
        when(comment.setData("newData")).thenReturn(comment);
        assertEquals("newData", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() {
        comment = new Comment("data");
        assertEquals("<!--data-->", comment.outerHtml());
    }

    @Test
    public void isXmlDeclarationTest() {
        comment = new Comment("data");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        comment = new Comment("data");
        assertNull(comment.asXmlDeclaration());
    }

}