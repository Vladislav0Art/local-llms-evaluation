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
public class GeneratedText_getsNormalisedWhitespace {

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
    public void text_getsNormalisedWhitespace() {
        TextNode textNode = createTextNode("   ");
        String text = textNode.text();
        assertEquals(StringUtil.normaliseWhitespace("   "), text);
    }

}