package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedSetDataUpdatesCorrectData {

    @Test
    public void setDataUpdatesCorrectData() {
        // Arrange
        String data = "test comment";
        Comment comment = new Comment(data);

        // Act
        String updatedData = comment.setData("new comment");
        assertEquals(updatedData, comment.getData());
    }

}