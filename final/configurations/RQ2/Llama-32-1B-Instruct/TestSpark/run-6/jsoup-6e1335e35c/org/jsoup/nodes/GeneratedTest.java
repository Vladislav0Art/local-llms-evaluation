package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

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

    @Test
    public void testPerformanceSensitiveMethods() {
        int iterations = 100000;
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            getElementsByTag("tag");
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) / 1e9 + " seconds");

        // Test methods with multiple parameters
        String[] params = {"a", "b"};
        for (String param : params) {
            getElementsByTag(param);
        }
    }

    @Test
    public void testClones() {
        Element parent = new Element("parent");
        clone(parent);
        assertAllSame(parent, parent.clone());

        // Test shallow cloning
        String text = "Hello, World!";
        Object clonedText = shallowClone(text);
        assertNotSame(text, clonedText);

        // Test deep cloning
        Object original = new Object();
        Object clonedOriginal = shallowClone(original);
        assertNotSame(original, clonedOriginal);
    }

    @Test
    public void testShallowClones() {
        Element parent = new Element("parent");
        clone(parent);
        Assert.assertTrue(getAllElements().stream()
                .map(Element::toString)
                .collect(Collectors.toSet())
                .containsAll(Arrays.asList(parent.toString())));
    }

    @Test
    public void testDeepClones() {
        Element parent = new Element("parent");
        clone(parent);
        Assert.assertFalse(getAllElements().stream()
                        .map(Element::toString)
                        .collect(Collectors.toSet()))
                .containsAll(Arrays.asList(parent.toString())));
    }

}