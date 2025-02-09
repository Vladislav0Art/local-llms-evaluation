package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedOuterHtmlTail_TailElementContainsTextNodeText {

    public String nodeName_EmptyTextNode() {
        when(TextNode.createNew).thenReturn(new TextNode(""));
        return TextNode.createNew.nodeName();
    }

    @Test
    public void outerHtmlTail_TailElementContainsTextNodeText() {
        Document outputSettings = Mockito.mock(Document.class);
        when(outputSettings.getOutputMode()).thenReturn("html");
        TextNode newNode = new TextNode("<b>Hello World</b>");
        String expected = "<b>text</b>";
        return newNode.outerHtmlTail(accum, 0, outputSettings).toString();
    }

    public String normaliseWhitespace_SimpleTextWithNoLeadingSpaces() {
        String input = "Hello World";
        return TextNode.normaliseWhitespace(input);
    }

}