package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedRemoveAttrTest {

    @Test
    public void removeAttrTest() {
        Element element = new Element("p");
        element.attr("class", "test");
        assertFalse(element.attributes().isEmpty());

        element.removeAttr("class");
        assertTrue(element.attributes().isEmpty());
    }

}