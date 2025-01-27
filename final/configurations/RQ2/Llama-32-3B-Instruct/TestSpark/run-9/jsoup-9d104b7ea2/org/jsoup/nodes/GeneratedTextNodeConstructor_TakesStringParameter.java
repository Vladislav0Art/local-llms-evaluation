package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedTextNodeConstructor_TakesStringParameter {

    @Test
    public void textNodeConstructor_TakesStringParameter() {
        TextNode textNode = new TextNode("text");
        assertNotNull(textNode);
    }
}

class Appendable {
    public void append(String str) {
    }
}

class Document {
    static class OutputSettings {
        public String defaultSettings() {
            return "default";
        }
    }

}