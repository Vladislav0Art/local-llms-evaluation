package org.jsoup.nodes;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitText_SplitAtMiddleReturnsTextNode {

    @Mock
    private Node parentNode;

    @Mock
    private Element parentElement;

    @Mock
    private Appendable accum;

    @Test
    public void splitText_SplitAtMiddleReturnsTextNode() throws IOException {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);

        when(parentNode).thenReturn(new LeafNode());

        TextNode tailNode = textNode.splitText(5);
        assertNotNull(tailNode);
        assertEquals("World", tailNode.text());
    }

}