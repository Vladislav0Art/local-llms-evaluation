package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.DocumentFragmentFactory.create;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitText_splitsOffsetBeyondEnd {

    @Mock
    private LeafNode parentNode;

    public TextNode createTextNode() {
        return new TextNode("");
    }

    @Before
    public void setup() {
        Mockito.when(parentNode.addNode(Mockito.anyInt(), Mockito.any(TextNode.class))).thenReturn(this);
    }

    @Test
    public void splitText_splitsOffsetBeyondEnd() {
        String originalText = "ab";
        int offset = 2;
        TextNode textNode = createTextNode(originalText);
        TextNode tailNode = textNode.splitText(offset);

        assertNull(tailNode.text());
    }

}