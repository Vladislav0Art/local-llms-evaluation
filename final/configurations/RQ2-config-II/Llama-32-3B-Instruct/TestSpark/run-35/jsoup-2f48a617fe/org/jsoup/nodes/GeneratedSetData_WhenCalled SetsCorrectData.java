package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSetData_WhenCalled SetsCorrectData {

    @Test
    public void setData_WhenCalled

    SetsCorrectData() {
        Comment comment = new Comment("");
        comment.setData("data");
        assertEquals("data", comment.getData());
    }

}