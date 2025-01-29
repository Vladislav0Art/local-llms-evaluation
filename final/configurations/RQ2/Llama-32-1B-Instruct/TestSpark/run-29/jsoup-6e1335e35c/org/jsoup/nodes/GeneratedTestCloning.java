package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestCloning {

    @Test
    public void testCloning() {
        Element root = new Element();
        root.appendChild(new Element());

        Element clonedRoot = (Element) root.clone();

        assertEquals(root, clonedRoot);
    }

}