package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void setDataAndGetDataTest() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());

        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("data");
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        when(out.prettyPrint()).thenReturn(true);
        when(out.outline()).thenReturn(true);

        Appendable accum = new StringBuilder();
        comment.outerHtmlHead(accum, 1, out);

        assertEquals("  <!--data-->", accum.toString());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("data");
        assertEquals(false, comment.isXmlDeclaration());

        comment = new Comment("!data");
        assertEquals(true, comment.isXmlDeclaration());

        comment = new Comment("?data");
        assertEquals(true, comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("data");
        assertEquals(null, comment.asXmlDeclaration());

        comment = new Comment("!data");
        assertEquals(null, comment.asXmlDeclaration());

        comment = new Comment("?data");
        assertEquals(null, comment.asXmlDeclaration());
    }

}