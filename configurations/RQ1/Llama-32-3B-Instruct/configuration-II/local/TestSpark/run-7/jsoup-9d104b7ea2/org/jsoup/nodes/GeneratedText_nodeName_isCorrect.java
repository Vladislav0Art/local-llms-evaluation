package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedText_nodeName_isCorrect {

    @Test
    public void text_nodeName_isCorrect() {
        // [MethodUnderTest][Scenario]Test
        TextNode textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

}