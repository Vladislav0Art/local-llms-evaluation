package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        String testData = "test data";
        Comment comment = new Comment(testData);
        comment.setData("new data");
        assertEquals(comment.getData(), "new data");
    }

}