package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Optional;

public class GeneratedIsXmlDeclarationIsFalse {

    @Test
    public void isXmlDeclarationIsFalse() {
        Comment comment = new Comment("data");
        assertFalse(comment.isXmlDeclaration());
    }

}