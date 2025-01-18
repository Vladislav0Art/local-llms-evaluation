package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Test data");
        assertEquals("#comment", comment.nodeName());
    }

}