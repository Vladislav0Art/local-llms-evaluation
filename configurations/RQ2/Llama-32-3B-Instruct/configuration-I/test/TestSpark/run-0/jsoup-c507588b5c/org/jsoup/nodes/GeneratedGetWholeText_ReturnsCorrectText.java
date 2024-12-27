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
public class GeneratedGetWholeText_ReturnsCorrectText {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    public static final String document_OUTPUT_SETTINGS = "outputSettings";

    @Test
    public void getWholeText_ReturnsCorrectText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}