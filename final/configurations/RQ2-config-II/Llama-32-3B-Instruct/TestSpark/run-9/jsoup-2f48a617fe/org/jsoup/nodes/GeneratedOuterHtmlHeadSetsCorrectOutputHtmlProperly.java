package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHeadSetsCorrectOutputHtmlProperly {

    @Test
    public void OuterHtmlHeadSetsCorrectOutputHtmlProperly() throws IOException {
        Parser parser = new Parser(ParseSettings.parseAll());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document document = parser.parse("<comment>Hello World</comment>");
        LeafNode node = document.head().children().get(0);
        Comment comment = (Comment) node;
        comment.outerHtmlHead(out, 0, null);
        String expectedOutput = "<!-- comment -->\nHello World\n";
        assertTrue(out.toString().contains(expectedOutput));
    }

}