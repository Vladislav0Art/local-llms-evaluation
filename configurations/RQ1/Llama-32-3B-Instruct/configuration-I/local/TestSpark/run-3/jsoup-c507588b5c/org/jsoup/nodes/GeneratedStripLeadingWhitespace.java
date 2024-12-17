package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedStripLeadingWhitespace {

    @Test
    public void stripLeadingWhitespace() {
        String text = "   ";
        assertEquals("", StringUtil.stripLeadingWhitespace(text));
    }
}

}