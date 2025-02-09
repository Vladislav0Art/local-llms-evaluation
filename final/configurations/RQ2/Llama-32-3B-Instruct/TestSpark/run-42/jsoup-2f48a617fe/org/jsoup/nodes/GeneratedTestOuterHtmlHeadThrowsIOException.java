package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestOuterHtmlHeadThrowsIOException {

    @Test
    public void testOuterHtmlHeadThrowsIOException() {
        // Arrange
        Comment comment = new Comment("data");
        Accum accum = new Accum();
        Out out = new Out();

        // Act and Assert
        try {
            comment.outerHtmlHead(accum, out);
            fail("Expected IOException to be thrown");
        } catch (IOException e) {
            // Expected
        }
    }

}