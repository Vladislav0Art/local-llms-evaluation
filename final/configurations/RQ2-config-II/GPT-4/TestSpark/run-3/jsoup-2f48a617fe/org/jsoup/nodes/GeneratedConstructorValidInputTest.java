package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedConstructorValidInputTest {

    @Test
    public void constructorValidInputTest() {
        Comment comment = new Comment("Test data");
        assertNotNull(comment);
        assertEquals("Test data", comment.getData());
    }

}