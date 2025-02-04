package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlank_GivenNonBlankTextNode_ReturnsFalse {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    private TextNode textNode;

    public void setUp() {
        textNode = new TextNode("Hello World");
    }

    @Test
    public void isBlank_GivenNonBlankTextNode_ReturnsFalse() {
        assertFalse(textNode.isBlank());
    }

}