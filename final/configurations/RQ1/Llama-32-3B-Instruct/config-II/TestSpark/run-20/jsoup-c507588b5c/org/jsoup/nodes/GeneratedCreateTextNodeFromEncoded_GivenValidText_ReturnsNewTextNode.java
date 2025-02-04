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
public class GeneratedCreateTextNodeFromEncoded_GivenValidText_ReturnsNewTextNode {

    @Mock
    private Node parentNode;

    @Mock
    private Appendable accum;

    @Test
    public void createTextNodeFromEncoded_GivenValidText_ReturnsNewTextNode() {
        String encodedText = "&lt;Hello&gt; World&lt;/Hello&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello World", textNode.value());
    }

}