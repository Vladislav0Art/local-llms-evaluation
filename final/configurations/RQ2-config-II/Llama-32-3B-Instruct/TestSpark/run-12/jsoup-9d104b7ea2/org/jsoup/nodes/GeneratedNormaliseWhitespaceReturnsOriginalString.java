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
public class GeneratedNormaliseWhitespaceReturnsOriginalString {

    @Mock
    private LeafNode leafNodeMock;

    public TextNode textNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void normaliseWhitespaceReturnsOriginalString() {
        String originalText = "test ";
        when(StringUtil.stripLeadingWhitespace(originalText)).thenReturn(originalText);
        assertEquals(originalText, StringUtil.normaliseWhitespace(originalText));
    }

}