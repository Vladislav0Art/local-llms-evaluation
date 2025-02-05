package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedCloneScenarioTest {

    @Test
    public void cloneScenarioTest() {
        Element el = new Element("testName");
        Element elClone = el.clone();

        assertTrue(el != elClone && el.getClass() == elClone.getClass() && el.equals(elClone));
    }

}