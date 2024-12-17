package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNormaliseWhitespace {

    @Test
    public void normaliseWhitespace() {
        String text = "   ";
        assertEquals(" ", StringUtil.normaliseWhitespace(text));
    }

}