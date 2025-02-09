package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.LinkedHashSet;
import java.util.Set;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedClassNamesTest {

    @Test
    public void classNamesTest() {
        Element element = createElement();
        Set<String> classes = new LinkedHashSet<>();
        classes.add("test");
        classes.add("test2");
        element.classNames(classes);
        assertEquals(classes, element.classNames());
    }

    private Element createElement() {
        return new Element(Tag.valueOf("p"), "");
    }

}