package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTest {

    @Test
    public void testHtmlAttribute() {
        Element element = new Element();
        element.setAttribute("href", "https://www.example.com");
        assertEquals("https://www.example.com", element.attrValue("href"));
    }

    @Test
    public void testAttrValueNotSet() {
        Element element = new Element();
        assertNull(element.attrValue("non-existentAttribute"));
    }

    @Test
    public void testRootElement() {
        Element root = new Element();
        assertEquals(root, root.root());
    }

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

    @Test
    public void testForEach() {
        Element element = new Element();
        List<Element> elements = Arrays.asList(element);

        for (Element e : elements) {
            assertTrue(e instanceof Element); // ensure each item is an Element
        }
    }

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

    @Test
    public void testCloning() {
        Element root = new Element();
        root.appendChild(new Element());

        Element clonedRoot = (Element) root.clone();

        assertEquals(root, clonedRoot);
    }

}