package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestFilter {

    @Test
    public void testFilter() {
        Element root = new Element();
        root.appendChild(new Element());
        root.appendChild(new Element());

        List<Element> elements = Arrays.asList(root);
        Elements filteredElements = new ArrayList<>();
        elements.stream()
                .filter(element -> element instanceof Element)
                .forEach(filteredElements::add);

        assertTrue(filteredElements.size() == 2); // ensure only two elements are included
    }

}