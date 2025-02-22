package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Parser parserMock;

    @Mock
    private ParseSettings parseSettingsMock;

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Test");
        assertEquals("Test", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Test");
        comment.setData("NewTest");
        assertEquals("NewTest", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Test");
        Appendable appendableMock = mock(Appendable.class);
        comment.outerHtmlHead(appendableMock, 0, null);
        verify(appendableMock).append("<!--Test-->");
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("Test");
        Appendable appendableMock = mock(Appendable.class);
        comment.outerHtmlTail(appendableMock, 0, null);
        verify(appendableMock).append("");
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Test");
        assertEquals("<!--Test-->", comment.toString());
    }

}