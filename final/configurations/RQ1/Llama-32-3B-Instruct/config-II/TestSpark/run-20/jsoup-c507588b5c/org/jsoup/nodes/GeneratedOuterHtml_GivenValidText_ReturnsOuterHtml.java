package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtml_GivenValidText_ReturnsOuterHtml {

    @Mock
    private Node parentNode;

    @Mock
    private Appendable accum;

    @Test
    public void outerHtml_GivenValidText_ReturnsOuterHtml() throws IOException {
        String text = "Hello World";
        when(parentNode.addChildren(anyInt(), any(TextNode.class))).thenReturn(null);
        TextNode newNode = new TextNode(text);
        StringBuilder result = new StringBuilder();
        newNode.outerHtmlHead(result, 0, null);
        assertEquals("<p>Hello World</p>", result.toString());
    }

}