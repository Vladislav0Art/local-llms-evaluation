package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedGetWholeTextReturnsEmptyStringWhenBlank {

    @Test
    public void getWholeTextReturnsEmptyStringWhenBlank() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.getWholeText());
    }

}