package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedStripLeadingWhitespace_RemovesWhitespace {

    @Test
    public void stripLeadingWhitespace_RemovesWhitespace() {
        String text = "   Text";
        when("stripLeadingWhitespace").thenReturn(text);
        assertEquals(text.substring(1), StringUtil.stripLeadingWhitespace(text));
    }

}