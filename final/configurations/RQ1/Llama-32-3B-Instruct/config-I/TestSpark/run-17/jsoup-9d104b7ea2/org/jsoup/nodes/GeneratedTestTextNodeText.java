package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestTextNodeText {

    @Mock
    private Element parentNode;

    @Mock
    private Node nextSibling;

    @Mock
    private Document document;

    private TextNode textNode;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(parentNode.getChildren()).thenReturn(document);
        textNode = new TextNode("Hello World");
    }

    /**
     * [TextNode][Constructor]Test
     */

    @Test
    public void testTextNodeText() {
        when(parentNode.getChildren()).thenReturn(document);
        assertEquals(" Hello ", StringUtil.normaliseWhitespace(textNode.text()));
    }

}