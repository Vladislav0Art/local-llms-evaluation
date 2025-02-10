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

public class GeneratedToString {

    @Test
    public void toString() {
        String expectedXmlString = "<!--/* This is a test */-->";
        Comment comment = new Comment(expectedXmlString);

        NodeBuilder builder = EntityBuilder.newBuilder();
        String actualXmlString = ((NodeVisitor<String>) comment.toString()).accept(null, "", "");

        assert (actualXmlString.contains(expectedXmlString));
    }

}