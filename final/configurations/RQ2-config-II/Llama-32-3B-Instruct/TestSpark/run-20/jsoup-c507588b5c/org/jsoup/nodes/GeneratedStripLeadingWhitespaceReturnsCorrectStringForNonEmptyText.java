package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedStripLeadingWhitespaceReturnsCorrectStringForNonEmptyText {

    @Test
    public void stripLeadingWhitespaceReturnsCorrectStringForNonEmptyText() {
        assertEquals("text", StringUtil.stripLeadingWhitespace("  text "));
    }

}