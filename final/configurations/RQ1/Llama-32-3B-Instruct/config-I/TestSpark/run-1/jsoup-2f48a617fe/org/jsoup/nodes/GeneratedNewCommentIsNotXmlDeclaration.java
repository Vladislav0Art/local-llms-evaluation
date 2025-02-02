package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import javax.annotation.Nullable;

public class GeneratedNewCommentIsNotXmlDeclaration {

    @Test
    public void newCommentIsNotXmlDeclaration() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

}