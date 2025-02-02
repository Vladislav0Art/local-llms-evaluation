package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

public class GeneratedTestCommentNodeName {

    @Test
    public void testCommentNodeName() {
        // Arrange
        String data = "#comment";

        // Act
        Comment comment = new Comment(data);
        String nodeName = comment.nodeName();

        // Assert
        assertEquals("#comment", nodeName);
    }

}