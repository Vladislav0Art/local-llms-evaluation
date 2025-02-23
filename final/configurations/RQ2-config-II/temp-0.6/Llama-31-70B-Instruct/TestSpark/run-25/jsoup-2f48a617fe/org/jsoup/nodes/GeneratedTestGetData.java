package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestGetData {

    @Test
    public void testGetData() {
        Comment comment = new Comment("test");
        String actualValue = comment.getData();
        String expectedValue = "test";
        assertEquals(expectedValue, actualValue);
    }

}