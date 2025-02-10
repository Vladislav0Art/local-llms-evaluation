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

public class GeneratedGetOuterHtmlTail {

    @Test
    public void getOuterHtmlTail() {
        Node node1 = Mockito.mock(Comment.class);
        String expectedEmptyString = "";
        Comment comment1 = new Comment(expectedEmptyString);

        NodeBuilder builder1 = EntityBuilder.newBuilder();
        comment1.outerHtmlTail(builder1).accept(null, "", "");

        String actualEmptyString = ((NodeVisitor<String>) node1).accept("", "");
        assert (actualEmptyString.isEmpty());
    }

}