package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeVisitor;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.ParserSettings;
import org.jsoup.util.EntityBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedClone {

    @Test
    public void clone() {
        Node node1 = Mockito.mock(Comment.class);
        Node node2 = Mockito.mock(Comment.class);
        Node expectedClone = Mockito.mock(Comment.class);

        Comment comment = new Comment("/* This is a test */");
        comment.setNode(node1);
        ((Comment) comment).clone();
        assert (comment.toString().equals("<!--/* This is a test */-->");
    }

}