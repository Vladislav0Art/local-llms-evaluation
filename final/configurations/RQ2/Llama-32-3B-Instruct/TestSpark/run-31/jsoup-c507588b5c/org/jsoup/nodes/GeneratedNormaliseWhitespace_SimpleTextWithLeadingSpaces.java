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
public class GeneratedNormaliseWhitespace_SimpleTextWithLeadingSpaces {

    public String nodeName_EmptyTextNode() {
        when(TextNode.createNew).thenReturn(new TextNode(""));
        return TextNode.createNew.nodeName();
    }

    @Test
    public void normaliseWhitespace_SimpleTextWithLeadingSpaces() {
        String input = "  Hello World  ";
        return TextNode.normaliseWhitespace(input);
    }

    public String normaliseWhitespace_SimpleTextWithTrailingSpaces() {
        String input = "Hello World  ";
        return TextNode.normaliseWhitespace(input);
    }

}