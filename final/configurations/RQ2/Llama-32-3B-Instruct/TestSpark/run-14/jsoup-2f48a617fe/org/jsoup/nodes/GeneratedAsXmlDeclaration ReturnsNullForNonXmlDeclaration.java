package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedAsXmlDeclaration ReturnsNullForNonXmlDeclaration {

    @Test
    public void asXmlDeclaration

    ReturnsNullForNonXmlDeclaration() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}