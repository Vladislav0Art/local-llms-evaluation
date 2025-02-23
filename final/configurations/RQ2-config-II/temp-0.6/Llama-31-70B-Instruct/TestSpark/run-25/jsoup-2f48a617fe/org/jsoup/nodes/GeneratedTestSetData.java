package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestSetData {

    @Test
    public void testSetData() {
        Comment comment = new Comment("test");
        comment.setData("test2");
        String actualValue = comment.getData();
        String expectedValue = "test2";
        assertEquals(expectedValue, actualValue);
    }

}