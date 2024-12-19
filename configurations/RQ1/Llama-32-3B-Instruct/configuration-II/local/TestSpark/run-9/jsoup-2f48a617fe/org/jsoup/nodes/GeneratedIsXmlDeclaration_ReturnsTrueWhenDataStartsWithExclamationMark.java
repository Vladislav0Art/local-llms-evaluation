package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclaration_ReturnsTrueWhenDataStartsWithExclamationMark {

    @Test
    public void isXmlDeclaration_ReturnsTrueWhenDataStartsWithExclamationMark() {
        Comment comment = new Comment("!-- Some XML Declaration -->");
        assertTrue(comment.isXmlDeclaration());
    }

}