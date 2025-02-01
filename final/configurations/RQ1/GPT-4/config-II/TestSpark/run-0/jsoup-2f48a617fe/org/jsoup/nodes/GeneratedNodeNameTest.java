package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("");
        assertEquals("#comment", comment.nodeName());
    }

}