package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedAttributesScenarioTest {

    @Test
    public void attributesScenarioTest() {
        Element element = new Element("p");
        assertEquals(0, element.attributes().size());
    }

}