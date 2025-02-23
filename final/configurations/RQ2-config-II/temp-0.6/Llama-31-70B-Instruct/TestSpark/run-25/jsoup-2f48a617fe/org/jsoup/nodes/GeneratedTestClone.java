package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        Comment comment = new Comment("test");
        Comment actualValue = comment.clone();
        Comment expectedValue = comment;
        assertEquals(expectedValue, actualValue);
    }

}