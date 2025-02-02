package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

public class GeneratedTestCommentSetData {

    @Test
    public void testCommentSetData() {
        // Arrange
        String data = "#comment";
        Comment comment = new Comment(data);

        // Act
        comment.setData("test");

        // Assert
        assertEquals("test", comment.getData());
    }

}