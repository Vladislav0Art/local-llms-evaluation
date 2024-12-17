package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;

public class GeneratedToStringReturnsCorrectString {

    @Test
    public void toStringReturnsCorrectString() {
        // Stub the DocumentOutputSettings for testing purposes
        String[] expected = {"This is a test comment.", "expected <attribute>value</attribute>"};

        Comment comment = new Comment("");
        String actual = comment.toString();
        assertEquals(expected[0], actual);
    }

}