package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedConstructor_test {

    @Test
    public void constructor_test() {
        String data = "some data";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}