package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCloneShouldReturnSameTextNode {

    @Mock
    private Node parentNode;

    public void setup() {
        when(parentNode.addNode(1, new TextNode("")));
    }

    @Test
    public void cloneShouldReturnSameTextNode() {
        TextNode textNode = new TextNode("   ");
        TextNode cloned = textNode.clone();
        assertEquals(textNode, cloned);
    }

}