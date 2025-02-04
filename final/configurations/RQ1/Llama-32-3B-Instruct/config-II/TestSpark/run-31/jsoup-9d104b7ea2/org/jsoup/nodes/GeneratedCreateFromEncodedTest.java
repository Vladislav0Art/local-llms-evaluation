package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Arrays;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void CreateFromEncodedTest() {
        String encodedText = "Hello &lt;World&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        assertEquals("Hello World", textNode.text());
    }
}

class Document {
    public Appendable appendable;
    public OutputSettings outputSettings;

    public Document() {
    }
}

class Appendable {
    private StringBuilder builder = new StringBuilder();

    public void append(String value) {
        builder.append(value);
    }

    @Override
    public String toString() {
        return builder.toString();
    }
}

}