package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedAsXmlDeclaration {

    private String data;

    @Test
    public void asXmlDeclaration() {
        Comment comment2 = new Comment("Comment data");
        String expected = "<comment xml=\"\" data=\"New comment data\"></comment>";
        assertEquals(expected, comment2.asXmlDeclaration().toString());
    }

}