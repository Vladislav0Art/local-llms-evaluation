package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestTraverse {

    @Test
    public void testTraverse() {
        Element root = new Element();
        Element child1 = new Element();
        Element child2 = new Element();

        root.appendChild(child1);
        root.appendChild(child2);

        Element result = root.traverse(NodeVisitor::print);
        assertEquals("child1\nchild2", result.text());
    }

}