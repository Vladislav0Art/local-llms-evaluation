package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedClone_Succeeds {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Element parentElement;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings outSettings;

    public TextNode getTextNode() {
        return new TextNode("");
    }

    @Test
    public void clone_Succeeds() {
        TextNode originalTextNode = new TextNode("Hello World!");
        when(parentNode.getWholeText()).thenReturn("");
        TextNode clonedTextNode = originalTextNode.clone();
        assertEquals(originalTextNode.value(), clonedTextNode.value());
    }

}