package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("data");
        assertEquals(false, comment.isXmlDeclaration());

        comment = new Comment("!data");
        assertEquals(true, comment.isXmlDeclaration());

        comment = new Comment("?data");
        assertEquals(true, comment.isXmlDeclaration());
    }

}