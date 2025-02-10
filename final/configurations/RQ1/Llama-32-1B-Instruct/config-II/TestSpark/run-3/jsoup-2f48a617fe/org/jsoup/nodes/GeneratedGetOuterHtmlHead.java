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

public class GeneratedGetOuterHtmlHead {

    @Test
    public void getOuterHtmlHead() {
        String expectedXmlString = "<!--/* This is a test */-->";
        Document document = EntityBuilder.newDocument();
        Element element = document.createElement("html");
        document.add(element);

        Comment comment = new Comment(expectedXmlString);
        Node outerHtmlElement = comment.outerHtmlHead(document, 0, null).accept(null, "", "");

        String actualXmlString = ((NodeVisitor<String>) outerHtmlElement).accept("", "");
        assert (actualXmlString.contains(expectedXmlString));
    }

}