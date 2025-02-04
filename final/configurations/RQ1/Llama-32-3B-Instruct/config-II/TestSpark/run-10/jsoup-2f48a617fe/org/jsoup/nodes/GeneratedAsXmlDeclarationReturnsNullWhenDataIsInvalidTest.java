package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclarationReturnsNullWhenDataIsInvalidTest {

    @Test
    public void asXmlDeclarationReturnsNullWhenDataIsInvalidTest() {
        Comment comment = new Comment("Invalid data");
        assertNull(comment.asXmlDeclaration());
    }

}