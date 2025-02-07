package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class Generated[MethodUnderTest][Scenario]

TestTextNode_splitText {

    @Test
    public void [MethodUnderTest][Scenario]TestTextNode_splitText() {
        TextNode node = new TextNode("Hello, World!");
        assertTrue(node.splitText(0).text().isEmpty());
    }

}