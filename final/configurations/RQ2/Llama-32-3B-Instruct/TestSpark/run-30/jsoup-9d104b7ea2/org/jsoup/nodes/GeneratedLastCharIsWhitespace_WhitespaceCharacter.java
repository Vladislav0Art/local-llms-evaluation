package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert_NULL;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.Validate.isValid;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedLastCharIsWhitespace_WhitespaceCharacter {

    @Test
    public void lastCharIsWhitespace_WhitespaceCharacter() {
        StringBuilder builder = Mockito.mock(StringBuilder.class);
        when(builder.toString()).thenReturn("Hello ");
        assertTrue(TextNode.lastCharIsWhitespace(builder));
    }

}