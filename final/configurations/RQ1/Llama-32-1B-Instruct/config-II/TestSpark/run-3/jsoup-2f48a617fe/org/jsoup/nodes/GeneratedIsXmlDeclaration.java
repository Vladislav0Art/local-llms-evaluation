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

public class GeneratedIsXmlDeclaration {

    @Test
    public void isXmlDeclaration() {
        Node node1 = Mockito.mock(Comment.class);
        String expectedData1 = "/* This is a test */";
        Comment comment1 = new Comment(expectedData1);

        NodeBuilder builder1 = EntityBuilder.newBuilder();
        Comment xmlDeclComment1 = ((Comment) comment1).asXmlDeclaration().setBuilder(builder1);
        assert (xmlDeclComment1.getData().contains("!"));
    }

}