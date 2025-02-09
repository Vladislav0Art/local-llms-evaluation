package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.helper.Attributes;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedSiblingElementsTest {

    @Test
    public void siblingElementsTest() {
        Element parent = new Element("div");
        Element child1 = parent.appendElement("p");
        Element child2 = parent.appendElement("span");
        assertEquals(1, child1.siblingElements().size());
        assertEquals(1, child2.siblingElements().size());
    }

}