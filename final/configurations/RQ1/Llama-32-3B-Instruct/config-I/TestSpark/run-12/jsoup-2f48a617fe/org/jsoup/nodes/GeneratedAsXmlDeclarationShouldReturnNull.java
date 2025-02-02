package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclarationShouldReturnNull {

    @Test
    public void asXmlDeclarationShouldReturnNull() {
        Comment comment = new Comment("some data");
        assertNull(comment.asXmlDeclaration());
    }

}