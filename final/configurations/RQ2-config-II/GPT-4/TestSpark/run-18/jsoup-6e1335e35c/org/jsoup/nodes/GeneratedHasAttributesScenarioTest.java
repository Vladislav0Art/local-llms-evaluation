package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedHasAttributesScenarioTest {

    @Test
    public void hasAttributesScenarioTest() {
        Element element = new Element("p");
        assertFalse(element.hasAttributes());
    }

}