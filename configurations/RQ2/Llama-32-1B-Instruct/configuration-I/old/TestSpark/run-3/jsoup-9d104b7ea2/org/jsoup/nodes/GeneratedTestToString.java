package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        assertEquals("Hello World", this.toString());
    }

    public String toString() {
        return "MockTextNode{data='Hello World', appender=null}";
    }
}

class TestMockTextNode extends MockTextNode {
    private TextNode appender;

    @Override
    public void append(String text) {
        if (this.appender != null && !this.appender.isEmpty()) {
            this.appender.append(text);
        }
    }

}