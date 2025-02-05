package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedChildScenarioTest {

    @Test
    public void childScenarioTest() {
        Element parentElement = new Element("div");
        Element childElement = new Element("p");
        parentElement.appendChild(childElement);
        assertEquals(childElement, parentElement.child(0));
    }

}