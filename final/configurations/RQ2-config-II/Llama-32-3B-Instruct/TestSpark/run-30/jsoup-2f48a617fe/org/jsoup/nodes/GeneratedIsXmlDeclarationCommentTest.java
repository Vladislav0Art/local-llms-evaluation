package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsXmlDeclarationCommentTest {

    @Test
    public void isXmlDeclarationCommentTest() {
        Comment comment = new Comment("data");
        assertTrue(comment.isXmlDeclaration());
    }

}