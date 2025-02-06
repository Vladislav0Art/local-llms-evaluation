package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsXmlDeclarationReturnsFalse {

    @Test
    public void isXmlDeclarationReturnsFalse() {
        Comment comment = new Comment("test");
        assertFalse(comment.isXmlDeclaration());
    }

}