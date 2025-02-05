package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedBaseUriScenarioTest {

    @Test
    public void baseUriScenarioTest() {
        Element element = new Element("p");
        assertEquals("", element.baseUri());
    }

}