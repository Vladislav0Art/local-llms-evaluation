package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;

public class GeneratedNodeName_ReturnsNodeName {

    @Test
    public void nodeName_ReturnsNodeName() {
        Comment comment = new Comment("Hello World!");
        assertEquals("comment", comment.nodeName());
    }

}