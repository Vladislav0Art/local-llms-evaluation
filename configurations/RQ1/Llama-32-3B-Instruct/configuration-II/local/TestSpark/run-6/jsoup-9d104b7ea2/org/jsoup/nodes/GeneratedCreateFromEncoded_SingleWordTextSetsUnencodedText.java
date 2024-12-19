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
public class GeneratedCreateFromEncoded_SingleWordTextSetsUnencodedText {

    @Mock
    private Node parentNode;

    @Mock
    private Element parentElement;

    @Mock
    private Appendable accum;

    @Test
    public void createFromEncoded_SingleWordTextSetsUnencodedText() {
        String encodedText = "&lt;Hello&gt;";
        when(accum).append(anyString());
        when(parentNode).thenReturn(new LeafNode());

        TextNode textNode = TextNode.createFromEncoded(encodedText);

        assertNotNull(textNode.text());
        assertEquals("Hello", textNode.text().toString());
    }

}