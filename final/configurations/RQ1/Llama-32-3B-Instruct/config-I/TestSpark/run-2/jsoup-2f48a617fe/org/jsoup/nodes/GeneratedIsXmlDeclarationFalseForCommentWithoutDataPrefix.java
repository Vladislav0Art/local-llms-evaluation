package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationFalseForCommentWithoutDataPrefix {

    @Test
    public void isXmlDeclarationFalseForCommentWithoutDataPrefix() {
        Comment comment = new Comment("");
        try {
            assertFalse(comment.isXmlDeclaration());
        } catch (IOException e) {
            assert (false);
        }
    }

}