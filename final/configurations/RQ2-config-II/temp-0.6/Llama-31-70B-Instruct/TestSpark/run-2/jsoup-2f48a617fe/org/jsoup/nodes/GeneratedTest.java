package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Old data");
        assertEquals("Old data", comment.getData());

        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Some data");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("Some data");
        StringBuilder sb = new StringBuilder();

        try {
            comment.outerHtmlHead(sb, 0, null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals("<!--Some data-->", sb.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("Some data");
        StringBuilder sb = new StringBuilder();

        try {
            comment.outerHtmlTail(sb, 0, null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals("", sb.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Some data");
        assertEquals("<!--Some data-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Some data");
        Comment cloned = (Comment) comment.clone();
        assertEquals(comment, cloned);
    }

}