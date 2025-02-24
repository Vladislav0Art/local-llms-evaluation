package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.annotation.Nullable;
import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Comment comment;

    @Test
    public void setDataTest() {
        when(comment.setData("test")).thenReturn(comment);
        assertEquals(comment, comment.setData("test"));
        assertEquals("test", comment.getData());
    }

    @Test
    public void nodeNameTest() {
        when(comment.nodeName()).thenReturn("#comment");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        when(comment.getData()).thenReturn("test");
        assertEquals("test", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);
        when(comment.outerHtmlHead(appendable, 0, outputSettings)).thenReturn(comment);
        assertEquals(comment, comment.outerHtmlHead(appendable, 0, outputSettings));
        verify(comment).outerHtmlHead(appendable, 0, outputSettings);
    }

}