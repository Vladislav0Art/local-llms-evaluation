package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedNormalNameScenarioTest {

    @Test
    public void normalNameScenarioTest() {
        Element element = new Element("P");
        assertEquals("p", element.normalName());
    }

}