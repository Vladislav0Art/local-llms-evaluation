package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedToStringReturnsCorrectData {

    @Test
    public void toStringReturnsCorrectData() {
        String data = "test";
        Comment comment = new Comment(data);
        assertEquals(data, comment.toString());
    }

}