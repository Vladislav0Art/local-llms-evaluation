package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedSetData SetsCorrectDataInComment {

    @Test
    public void setData

    SetsCorrectDataInComment() {
        String originalData = "some comment";
        Comment comment = new Comment(originalData);
        String newData = "new data";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

}