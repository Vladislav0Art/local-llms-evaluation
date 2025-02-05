package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedIdScenarioTest {

    @Test
    public void idScenarioTest() {
        Element element = new Element("p");
        element.attr("id", "elementId");
        assertEquals("elementId", element.id());
    }

}