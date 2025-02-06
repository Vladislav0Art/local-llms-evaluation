package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclarationNullCommentTest {

    @Test
    public void asXmlDeclarationNullCommentTest() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}