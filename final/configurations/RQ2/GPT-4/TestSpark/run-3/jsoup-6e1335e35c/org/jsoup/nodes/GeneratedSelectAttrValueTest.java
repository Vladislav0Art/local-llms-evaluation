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

public class GeneratedSelectAttrValueTest {

    @Test
    public void selectAttrValueTest() {
        Element element = new Element("div");
        Element child = new Element("p");
        child.attr("class", "test");
        element.appendChild(child);
        Elements result = element.select("p.class");
        assertFalse(result.isEmpty());
    }

}