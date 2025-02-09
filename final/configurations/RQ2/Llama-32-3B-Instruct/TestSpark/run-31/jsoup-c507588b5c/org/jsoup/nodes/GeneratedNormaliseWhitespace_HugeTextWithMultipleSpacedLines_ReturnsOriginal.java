package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedNormaliseWhitespace_HugeTextWithMultipleSpacedLines_ReturnsOriginal {

    @Mock
    private Appendable accum;

    @Test
    public void normaliseWhitespace_HugeTextWithMultipleSpacedLines_ReturnsOriginal() {
        String input = "Hello\r\nWorld";
        String expected = "Hello\r\nWorld";
        assertEquals(input, TextNode.normaliseWhitespace(input));
    }

}