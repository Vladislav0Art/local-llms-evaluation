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

public class GeneratedCommentNodeName {

    @Test
    public void commentNodeName() {
        Node node = Mockito.mock(Comment.class);
        String expectedName = "#comment";
        Comment comment = new Comment(expectedName);
        assert (comment.nodeName().equals(expectedName));
    }

}