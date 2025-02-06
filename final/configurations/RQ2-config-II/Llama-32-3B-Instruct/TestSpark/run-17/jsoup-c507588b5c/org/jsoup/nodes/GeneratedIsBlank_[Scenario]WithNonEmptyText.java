package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlank_[Scenario]

WithNonEmptyText {

    @Test
    public void isBlank_[ Scenario]WithNonEmptyText() {
        TextNode textNode = new TextNode("text");
        assertFalse(textNode.isBlank());
    }

}