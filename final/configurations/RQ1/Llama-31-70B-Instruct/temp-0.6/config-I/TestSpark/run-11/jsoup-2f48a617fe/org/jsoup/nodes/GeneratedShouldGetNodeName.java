package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedShouldGetNodeName {

    private Comment comment;

    @Test
    public void shouldGetNodeName() {
        comment = new Comment("Test");
        assertEquals("#comment", comment.nodeName());
    }

}