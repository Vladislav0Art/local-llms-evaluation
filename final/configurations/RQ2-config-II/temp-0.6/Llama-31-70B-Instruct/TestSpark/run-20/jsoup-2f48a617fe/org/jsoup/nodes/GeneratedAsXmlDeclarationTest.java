package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("data");
        assertEquals(null, comment.asXmlDeclaration());

        comment = new Comment("!data");
        assertEquals(null, comment.asXmlDeclaration());

        comment = new Comment("?data");
        assertEquals(null, comment.asXmlDeclaration());
    }

}