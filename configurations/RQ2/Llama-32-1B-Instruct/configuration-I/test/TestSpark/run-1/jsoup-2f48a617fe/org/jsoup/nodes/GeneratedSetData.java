package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedSetData {

    private String data;

    @Test
    public void setData() {
        comment.setData("New comment data");
        assertFalse(comment.isXmlDeclaration());
        assertTrue(comment.asXmlDeclaration().isXmlDeclaration());
    }

}