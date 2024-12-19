package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclaration ReturnsFalseOtherwise {

    @Test
    public void isXmlDeclaration

    ReturnsFalseOtherwise() {
        Comment comment = new Comment("Some data");
        assertFalse(comment.isXmlDeclaration());
    }

}