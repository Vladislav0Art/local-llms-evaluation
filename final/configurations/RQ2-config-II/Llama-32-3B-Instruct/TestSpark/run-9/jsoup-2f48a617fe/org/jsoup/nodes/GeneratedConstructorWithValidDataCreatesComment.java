package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedConstructorWithValidDataCreatesComment {

    @Test
    public void ConstructorWithValidDataCreatesComment() {
        String data = "Hello World";
        Comment comment = new Comment(data);
        assertNotNull(comment);
        assertEquals(data, comment.getData());
    }

}