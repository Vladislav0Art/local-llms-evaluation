package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GeneratedIsXmlDeclarationTest_False {

    @Test
    public void isXmlDeclarationTest_False() {
        Comment comment = new Comment("Not a XML Declaration");
        assertFalse(comment.isXmlDeclaration());
    }

}