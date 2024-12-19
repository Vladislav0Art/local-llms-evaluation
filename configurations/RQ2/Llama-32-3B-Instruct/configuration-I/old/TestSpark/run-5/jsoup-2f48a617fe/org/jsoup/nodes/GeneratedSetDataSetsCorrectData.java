package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedSetDataSetsCorrectData {

    @Test
    public void setDataSetsCorrectData() {
        Comment comment = new Comment("Hello World");
        String newData = "This is a new comment";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

}