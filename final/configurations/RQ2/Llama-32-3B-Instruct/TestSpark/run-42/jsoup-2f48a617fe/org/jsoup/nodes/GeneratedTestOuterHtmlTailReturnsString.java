package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestOuterHtmlTailReturnsString {

    @Test
    public void testOuterHtmlTailReturnsString() throws IOException {
        // Arrange
        Comment comment = new Comment("data");
        Accum accum = new Accum();
        Out out = new Out();

        // Act and Assert
        String result = comment.outerHtmlTail(accum, out);
        assertNotNull(result);
    }

}