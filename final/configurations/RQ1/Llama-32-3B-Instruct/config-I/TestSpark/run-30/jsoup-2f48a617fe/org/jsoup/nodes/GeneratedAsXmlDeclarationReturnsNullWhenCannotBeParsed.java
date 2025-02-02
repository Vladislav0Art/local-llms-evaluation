package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedAsXmlDeclarationReturnsNullWhenCannotBeParsed {

    @Test
    public void asXmlDeclarationReturnsNullWhenCannotBeParsed() throws IOException {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}