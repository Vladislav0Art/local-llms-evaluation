package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        String data = "Test data";
        Comment comment = new Comment("");
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

}