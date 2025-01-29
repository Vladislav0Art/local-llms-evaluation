package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedToString_test {

    @Test
    public void toString_test() {
        TextNode node = new TextNode("Hello World");
        assertEquals("<text>Hello World</text>", node.toString());
    }

}