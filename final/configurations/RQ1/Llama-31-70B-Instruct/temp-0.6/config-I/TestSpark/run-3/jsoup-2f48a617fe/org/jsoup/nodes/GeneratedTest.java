package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("");
        comment.setData("test");

        assertEquals("test", comment.getData());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("test");

        assertEquals("test", comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("test");

        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("test");

        assertEquals("<!--test-->", comment.toString());
    }

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("test");
        String expected = "<!--test-->";
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, null);

        assertEquals(expected, accum.toString());
    }

}