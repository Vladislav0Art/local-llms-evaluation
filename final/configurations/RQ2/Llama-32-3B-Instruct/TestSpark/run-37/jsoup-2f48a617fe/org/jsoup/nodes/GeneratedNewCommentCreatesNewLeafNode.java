package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNewCommentCreatesNewLeafNode {

    @Test
    public void newCommentCreatesNewLeafNode() {
        Comment comment = new Comment("data");
        assertFalse(comment instanceof LeafNode);
    }

}