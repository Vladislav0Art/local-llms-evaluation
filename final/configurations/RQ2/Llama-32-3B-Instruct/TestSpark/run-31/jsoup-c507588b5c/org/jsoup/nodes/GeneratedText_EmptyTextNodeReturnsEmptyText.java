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
public class GeneratedText_EmptyTextNodeReturnsEmptyText {

    public String nodeName_EmptyTextNode() {
        when(TextNode.createNew).thenReturn(new TextNode(""));
        return TextNode.createNew.nodeName();
    }

    @Test
    public void text_EmptyTextNodeReturnsEmptyText() {
        TextNode newNode = new TextNode("");
        assertEquals("", newNode.text());
    }

    public String splitText_SplittingAtOffset() {
        when(accum.toString()).thenReturn("Hello World");
        when(TextNode.createNew).thenReturn(new TextNode("Hello "));
        return TextNode.createNew.splitText(0);
    }

}