package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedIsBlankReturnsFalseForNonBlankTextNode {

    @Test
    public void isBlankReturnsFalseForNonBlankTextNode() {
        TextNode textNode = new TextNode("text");
        assertFalse(textNode.isBlank());
    }

}