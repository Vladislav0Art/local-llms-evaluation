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

public class GeneratedIsXmlDeclarationData {

    @Test
    public void isXmlDeclarationData() {
        String expectedData = "/* This is a test */";
        NodeBuilder builder = EntityBuilder.newBuilder();
        Comment xmlDeclComment = ((Comment) new Comment(expectedData)).asXmlDeclaration().setBuilder(builder);
        assert (xmlDeclComment.getData().contains("!"));
    }

}