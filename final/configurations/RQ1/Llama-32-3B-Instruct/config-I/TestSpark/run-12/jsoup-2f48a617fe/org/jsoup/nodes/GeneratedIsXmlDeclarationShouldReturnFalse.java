package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsXmlDeclarationShouldReturnFalse {

    @Test
    public void isXmlDeclarationShouldReturnFalse() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

}