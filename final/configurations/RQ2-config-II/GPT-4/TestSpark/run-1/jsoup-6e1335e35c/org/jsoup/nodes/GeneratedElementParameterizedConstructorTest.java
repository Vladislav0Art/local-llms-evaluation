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

public class GeneratedElementParameterizedConstructorTest {

    @Test
    public void ElementParameterizedConstructorTest() {
        Element element = new Element(Tag.valueOf("p"), "https://www.example.com", null);
        assertNotNull(element);
    }

}