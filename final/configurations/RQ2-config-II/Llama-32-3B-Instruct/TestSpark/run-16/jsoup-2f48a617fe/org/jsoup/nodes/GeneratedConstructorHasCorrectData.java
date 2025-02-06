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

public class GeneratedConstructorHasCorrectData {

    @Test
    public void constructorHasCorrectData() {
        // Arrange
        String data = "test comment";

        // Act
        Comment comment = new Comment(data);

        // Assert
        assertEquals(data, comment.getData());
    }

}