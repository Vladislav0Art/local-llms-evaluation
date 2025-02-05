package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedNodeNameScenarioTest {

    @Test
    public void nodeNameScenarioTest() {
        Element element = new Element("p");
        assertEquals("p", element.nodeName());
    }

}