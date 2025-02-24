package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestEnsureChildNodes {

    private Element element;

    @BeforeEach
    public void setUp() {
        element = new Element("div");
    }

    @Test
    public void testEnsureChildNodes() {
        assertTrue(element.ensureChildNodes().isEmpty());
    }

}