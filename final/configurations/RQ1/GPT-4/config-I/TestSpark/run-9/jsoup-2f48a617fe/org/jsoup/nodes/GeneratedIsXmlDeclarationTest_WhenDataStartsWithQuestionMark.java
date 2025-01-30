package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedIsXmlDeclarationTest_WhenDataStartsWithQuestionMark {

    @Test
    public void isXmlDeclarationTest_WhenDataStartsWithQuestionMark() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"");
        assertTrue(comment.isXmlDeclaration());
    }

}