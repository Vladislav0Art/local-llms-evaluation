package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestOuterHtmlHeadReturnsString {

    @Test
    public void testOuterHtmlHeadReturnsString() throws IOException {
        // Arrange
        Comment comment = new Comment("data");
        Accum accum = new Accum();
        Out out = new Out();

        // Act and Assert
        String result = comment.outerHtmlHead(accum, out);
        assertNotNull(result);
    }

}