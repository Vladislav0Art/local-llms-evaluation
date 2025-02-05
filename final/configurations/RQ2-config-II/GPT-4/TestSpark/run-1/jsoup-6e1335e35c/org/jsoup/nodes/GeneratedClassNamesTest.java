package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class GeneratedClassNamesTest {

    @Test
    public void classNamesTest() {
        Element element = new Element("tag");
        Set<String> classNames = new HashSet<>();
        classNames.add("class1");
        classNames.add("class2");
        element.classNames(classNames);
        assertTrue(element.hasClass("class1"));
        assertTrue(element.hasClass("class2"));
    }

}