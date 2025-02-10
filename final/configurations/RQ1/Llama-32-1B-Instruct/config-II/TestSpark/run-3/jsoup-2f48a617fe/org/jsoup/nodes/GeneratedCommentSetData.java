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

public class GeneratedCommentSetData {

    @Test
    public void commentSetData() {
        Node node = Mockito.mock(Comment.class);
        String expectedData = "/* This is a test */";
        Comment comment = new Comment(expectedData);
        node.setValue(expectedData);
        ((Comment) comment).setNode(node);
        assert (comment.getData().equals(expectedData));
    }

}