package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;

public class GeneratedText_GivenText_ReturnsUnencodedText {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public void text(String newText) {
        this.text = newText;
    }

    public String nodeName() {
        return "#text";
    }

    public String text() {
        return this.text;
    }

    public boolean isBlank() {
        return this.text.trim().isEmpty();
    }

    public TextNode splitText(int offset) throws IllegalArgumentException {
        if (offset < 0 || offset > this.text.length()) {
            throw new IllegalArgumentException("Offset out of range");
        }
        String tail = this.text.substring(offset);
        return new TextNode(tail);
    }
}

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert .*;
        import java.io.IOException;
import org.jsoup.helper.Validate;

public class TextNodeTest {

    @Test
    public void text_GivenText_ReturnsUnencodedText() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello, World!", textNode.text());
    }

}