package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class GeneratedSetDataUpdatesDataProperly {

    @Test
    public void setDataUpdatesDataProperly() {
        String originalData = "Some comment content";
        String newData = "New comment content";
        Comment comment = new Comment(originalData);
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

}