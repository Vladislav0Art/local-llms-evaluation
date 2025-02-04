package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedIsXmlDeclarationReturnsFalseIfDataLengthIsLessThanTwo {

    @Test
    public void isXmlDeclarationReturnsFalseIfDataLengthIsLessThanTwo() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

}