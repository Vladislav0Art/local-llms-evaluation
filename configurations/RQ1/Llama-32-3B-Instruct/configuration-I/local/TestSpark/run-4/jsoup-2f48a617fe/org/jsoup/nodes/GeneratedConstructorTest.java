package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        Comment comment = new Comment("Hello World");
        assertEquals("Hello World", comment.getData());
    }

}