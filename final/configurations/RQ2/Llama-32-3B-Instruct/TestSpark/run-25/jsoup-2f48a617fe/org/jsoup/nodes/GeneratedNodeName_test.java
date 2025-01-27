package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeName_test {

    @Test
    public void nodeName_test() {
        Comment comment = new Comment("");
        assertEquals("comment", comment.nodeName());
    }

}