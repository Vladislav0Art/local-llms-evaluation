package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCloneReturnsClone {

    @Mock
    private LeafNode leafNodeMock;

    public TextNode textNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void cloneReturnsClone() {
        TextNode textNode = textNode("test");
        when(leafNodeMock.text()).thenReturn(textNode.text());
        TextNode cloned = textNode.clone();
        assertEquals(cloned, cloned.clone());
    }

}