package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRemoveAttrTest {

    @Test
    public void removeAttrTest() {
        Element testElement = new Element("test");
        testElement.attr("newAttr", "value");
        testElement.removeAttr("newAttr");
        assertFalse(testElement.hasAttributes());
    }

}