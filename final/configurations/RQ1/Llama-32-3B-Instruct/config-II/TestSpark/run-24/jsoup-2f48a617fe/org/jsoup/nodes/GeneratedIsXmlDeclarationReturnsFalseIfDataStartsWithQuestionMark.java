package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedIsXmlDeclarationReturnsFalseIfDataStartsWithQuestionMark {

    @Test
    public void isXmlDeclarationReturnsFalseIfDataStartsWithQuestionMark() {
        Comment comment = new Comment("?xml version \"1.0\"");
        assertFalse(comment.isXmlDeclaration());
    }

}