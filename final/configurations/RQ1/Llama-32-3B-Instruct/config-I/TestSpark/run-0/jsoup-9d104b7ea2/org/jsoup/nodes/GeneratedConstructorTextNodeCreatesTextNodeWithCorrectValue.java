package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConstructorTextNodeCreatesTextNodeWithCorrectValue {

    @Test
    public void constructorTextNodeCreatesTextNodeWithCorrectValue() {
        // given
        String text = "test";

        // when
        TextNode textNode = new TextNode(text);

        // then
        Mockito.verify(textNode).value(text);
    }

}