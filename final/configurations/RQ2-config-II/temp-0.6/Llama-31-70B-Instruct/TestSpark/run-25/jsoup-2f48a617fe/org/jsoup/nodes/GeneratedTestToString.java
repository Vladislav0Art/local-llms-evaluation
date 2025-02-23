package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestToString {

    @Test
    public void testToString() throws IOException {
        Comment comment = new Comment("test");
        String actualValue = comment.toString();
        String expectedValue = "<!--test-->";
        assertEquals(expectedValue, actualValue);
    }

}