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

public class GeneratedCommentGetData {

    @Test
    public void commentGetData() {
        Node node = Mockito.mock(Comment.class);
        Node expectedData = "/* This is a test */
        ";
        Comment comment = new Comment(expectedData);
        String actualData = ((NodeVisitor<String>) node).accept(comment, "");
        assert (actualData.contains("/*"));
    }

}