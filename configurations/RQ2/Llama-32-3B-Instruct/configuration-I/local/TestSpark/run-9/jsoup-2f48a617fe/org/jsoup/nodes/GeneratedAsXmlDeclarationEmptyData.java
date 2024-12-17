package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclarationEmptyData {

    @Test
    public void asXmlDeclarationEmptyData() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}