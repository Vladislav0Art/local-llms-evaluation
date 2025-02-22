package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Comment comment = new Comment("data");
        assertEquals("<!---->data<!---->", comment.toString());
    }

}