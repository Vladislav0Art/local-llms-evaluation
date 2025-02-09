package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedToString_ReturnsCorrectString {

    @Test
    public void toString_ReturnsCorrectString() {
        Comment comment = new Comment("data");
        String expected = "<!-- data -->";
        assertEquals(expected, comment.toString());
    }

}