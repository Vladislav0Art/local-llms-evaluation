package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Comment comment = new Comment("data");
        assertEquals("[comment]", comment.toString());
    }

}