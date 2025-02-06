package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclarationReturnsNull {

    @Test
    public void asXmlDeclarationReturnsNull() {
        Comment comment = new Comment("test");
        assertNull(comment.asXmlDeclaration());
    }

}