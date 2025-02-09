package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSelectTest {

    @Test
    public void selectTest() {
        Element selectElement = new Element("select");
        Elements resultElements = selectElement.select("div");
        assertNotNull(resultElements);
    }

}