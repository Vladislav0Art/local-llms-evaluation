package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtml_GivenValidContext_ReturnsCorrectOuterHtml {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    private TextNode textNode;

    public void setUp() {
        textNode = new TextNode("Hello World");
    }

    @Test
    public void outerHtml_GivenValidContext_ReturnsCorrectOuterHtml() throws IOException {
        when(document.outputSettings()).thenReturn(new Document.OutputSettings(true));

        appendable = new StringBuilder();

        TextNode node = new TextNode("Hello World");

        String result = textNode.outerHtml(appendable, 0, document);

        assertEquals("<p>Hello World</p>", result);
    }

}