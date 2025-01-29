package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestPublicMethods {

    @Test
    public void testPublicMethods() {
        String text = "Hello, World!";
        System.out.println("Original Text: " + text);

        String wholeText = text.split("\\s+")[0];
        System.out.println("Whole Text: " + wholeText);
        Set<String> classNames = getAllElements().stream()
                .map(Element::getClassName)
                .collect(Collectors.toSet());
        System.out.println("Class Names: " + classNames);

        // Test set methods
        Set<String> classNames1 = getElementsByTag("tag").stream()
                .map(Element::getClassName)
                .collect(Collectors.toSet());
        System.out.println("Class Names (first): " + classNames1);
        Set<String> classNames2 = getAllElements().stream()
                .map(Element::getClassName)
                .collect(Collectors.toSet());
        System.out.println("Class Names (second): " + classNames2);

        // Test getElementsMatchingOwnText method
        String text2 = "Hello, World!";
        String[] values = {"tag", "class"};
        assertNotAll(Arrays.asList(text2.split("\\s+")).stream()
                .map(String::trim)
                .filter(value -> Arrays.asList(values).contains(value))
                .count() == 2);

        // Test methods with multiple parameters
        String[] params = {"a", "b"};
        for (String param : params) {
            getElementsByTag(param);
        }

        // Test clones
        Element parent = new Element("parent");
        clone(parent);
        assertAllSame(parent, parent.clone());

        // Test shallow cloning
        String text = "Hello, World!";
        String clonedText = (String) shallowClone(text);
        assertNotSame(text, clonedText);

        // Test deep cloning
        Object original = new Object();
        Object clonedOriginal = shallowClone(original);
        assertNotSame(original, clonedOriginal);
    }

}