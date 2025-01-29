package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestClassNames {

    @Test
    public void testClassNames() {
        String text = "<p class='test-class'>Hello World!</p>";
        Element element = parser.parseString(text);
        Set<String> classNames = new java.util.HashSet<>();
        classNames.add("test-class");
        assertTrue(classNames.containsAll(element.getClassNameSet()));
    }

}