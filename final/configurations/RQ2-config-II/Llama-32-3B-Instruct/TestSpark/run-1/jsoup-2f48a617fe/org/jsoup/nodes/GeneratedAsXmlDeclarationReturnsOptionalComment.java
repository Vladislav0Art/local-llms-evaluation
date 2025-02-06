package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Optional;

public class GeneratedAsXmlDeclarationReturnsOptionalComment {

    @Test
    public void asXmlDeclarationReturnsOptionalComment() {
        Comment comment = new Comment("data");
        Optional<Comment> optionalComment = comment.asXmlDeclaration();
        assertTrue(optionalComment.isPresent());
        assertEquals(comment, optionalComment.get());
    }

}