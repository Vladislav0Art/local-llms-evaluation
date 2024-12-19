package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedToString {

    private String data;

    @Test
    public void toString() {
        String expected = "<comment data=\"New comment data\"></comment>";
        assertEquals(expected, comment.toString());
    }

}