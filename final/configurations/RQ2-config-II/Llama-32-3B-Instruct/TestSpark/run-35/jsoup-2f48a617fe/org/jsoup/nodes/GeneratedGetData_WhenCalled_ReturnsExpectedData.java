package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetData_WhenCalled_ReturnsExpectedData {

    @Test
    public void getData_WhenCalled_ReturnsExpectedData() {
        Comment comment = new Comment("data");
        Mockito.verify(comment).getData();
        assertEquals("data", comment.getData());
    }

}