package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedChildrenSizeScenarioTest {

    @Test
    public void childrenSizeScenarioTest() {
        Element parentElement = new Element("div");
        Element childElement1 = new Element("p");
        Element childElement2 = new Element("span");
        parentElement.appendChild(childElement1);
        parentElement.appendChild(childElement2);
        assertEquals(2, parentElement.childrenSize());
    }

}