package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals("TextNode", node.toString());
    }
}

class MockAppendable implements Appendable {
    @Override
    public String toString() {
        return "";
    }
}

class MockDocument {
    private Document.OutputSettings out;

    public Document.OutputSettings getOutputSettings() {
        return out;
    }

    public void setOutputSettings(Document.OutputSettings outputSettings) {
        out = outputSettings;
    }

    public String toString() {
        return "";
    }

}