package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetData_GivenData_SetsCorrectData {

    @Test
    public void setData_GivenData_SetsCorrectData() {
        String data = "New data.";
        Comment comment = new Comment("old data.");
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

}