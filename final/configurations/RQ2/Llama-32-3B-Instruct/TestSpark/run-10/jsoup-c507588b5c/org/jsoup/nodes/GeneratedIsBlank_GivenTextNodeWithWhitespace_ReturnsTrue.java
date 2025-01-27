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
public class GeneratedIsBlank_GivenTextNodeWithWhitespace_ReturnsTrue {

    @Mock
    private String text;

    @Mock
    private Appendable accum;

    @Test
    public void isBlank_GivenTextNodeWithWhitespace_ReturnsTrue() {
        String whitespaceText = "   ";
        assertTrue(TextNode.isBlank(whitespaceText));
    }

}