package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment commentNode = new Comment("This is a comment");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        outputSettings.prettyPrint(true);

        StringBuilder stringBuilder = new StringBuilder();
        commentNode.outerHtmlHead(stringBuilder, 0, outputSettings);

        String expectedHtml = "<!--This is a comment-->";
        assertEquals(expectedHtml, stringBuilder.toString());
    }

}