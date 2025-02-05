package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParentScenarioTest {

    @Test
    public void parentScenarioTest() {
        Element parentElement = new Element("div");
        Element childElement = new Element("p");
        parentElement.appendChild(childElement);
        assertEquals(parentElement, childElement.parent());
    }

}