package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class GeneratedToStringReturnsCorrectString {

    @Test
    public void toStringReturnsCorrectString() {
        Comment comment = new Comment("Some comment");
        String expectedString = "<!-- Some comment -->";
        assertEquals(expectedString, comment.toString());
    }

}