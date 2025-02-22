package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("");

        comment.setData("new data");

        assertEquals("new data", comment.getData());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("comment data");

        assertEquals("comment data", comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("");

        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("comment data");
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);

        when(out.prettyPrint()).thenReturn(false);

        comment.outerHtmlHead(accum, 0, out);

        assertNotNull(accum);
    }

    @Test
    public void outerHtmlHeadWithPrettyPrintTest() throws IOException {
        Comment comment = new Comment("comment data");
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);

        when(out.prettyPrint()).thenReturn(true);

        comment.outerHtmlHead(accum, 0, out);

        assertNotNull(accum);
    }

}