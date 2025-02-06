package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedStripLeadingWhitespaceReturnsEmptyStringForEmptyText {

    @Test
    public void stripLeadingWhitespaceReturnsEmptyStringForEmptyText() {
        assertEquals("", StringUtil.stripLeadingWhitespace(""));
    }

}