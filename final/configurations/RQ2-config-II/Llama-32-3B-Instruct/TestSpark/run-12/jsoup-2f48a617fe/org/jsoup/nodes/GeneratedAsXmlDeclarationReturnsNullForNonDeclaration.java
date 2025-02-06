package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclarationReturnsNullForNonDeclaration {

    @Test
    public void asXmlDeclarationReturnsNullForNonDeclaration() {
        Comment comment = new Comment("Some data");
        assertNull(comment.asXmlDeclaration());
    }

}