package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedStripLeadingWhitespace_StripsOnlyLeadingWhitespace {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    public static final String document_OUTPUT_SETTINGS = "outputSettings";

    @Test
    public void stripLeadingWhitespace_StripsOnlyLeadingWhitespace() {
        String text = "   Hello World";
        assertEquals("Hello World", TextNode.stripLeadingWhitespace(text));
    }

}