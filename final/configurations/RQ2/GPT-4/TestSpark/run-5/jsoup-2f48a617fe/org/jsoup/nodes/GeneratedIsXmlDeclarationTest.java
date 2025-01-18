package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("Test data");
        assertFalse(comment.isXmlDeclaration());
    }

}