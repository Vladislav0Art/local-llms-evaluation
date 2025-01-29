package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedSetText_text {

    public String nodeName() {
        return "text";
    }

    public void setText(String text) {
        this.text = text;
    }

    @Test
    public void setText_text() {
        setText("Hello World");
        assertEquals("Hello World", getText());
    }

}