package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GeneratedAsXmlDeclarationTest_Null {

    @Test
    public void asXmlDeclarationTest_Null() {
        Comment comment = new Comment("!Not a XML Declaration");
        assertEquals(null, comment.asXmlDeclaration());
    }

}