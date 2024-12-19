package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitText_GivenOffsetOutofRange_ReturnsNull {

    @Test
    public void splitText_GivenOffsetOutofRange_ReturnsNull() {
        String rawText = "Hello World!";
        TextNode textNode = new TextNode(rawText);
        int offset = 10;
        assertNull(textNode.splitText(offset));
    }
}

class MockableTextNode extends TextNode {

    private final String text;

    public MockableTextNode(String text) {
        super(text);
        this.text = text;
    }

    @Override
    public String coreValue() {
        return text;
    }
}

}