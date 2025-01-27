package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedText_GivenTextNode_ReturnsEmptyString {

    @Mock
    private String text;

    @Mock
    private Appendable accum;

    @Test
    public void text_GivenTextNode_ReturnsEmptyString() {
        TextNode textNode = new TextNode("");
        assertNull(textNode.text());
    }

}