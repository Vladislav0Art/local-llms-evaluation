package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSetData_setsData {

    @Test
    public void setData_setsData() {
        String originalData = "some data";
        Comment comment = new Comment(originalData);
        String newData = "new data";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

}