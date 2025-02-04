package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedToStringTestsCorrectStringRepresentation {

    @Test
    public void toStringTestsCorrectStringRepresentation() throws IOException {
        Comment comment = new Comment("This is a test");
        String expectedOutput = "<!--This is a test-->";
        assertEquals(expectedOutput, comment.toString());
    }

}