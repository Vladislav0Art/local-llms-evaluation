package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testGetAttribute() {
        String element = "a";
        String attribute = "class";

        // Test case 1: get attribute of an attributeless element
        boolean isSafe = Element.isSafeAttribute(element, attribute);
        System.out.println("isSafe: " + isSafe);

        // Test case 2: get attribute of a non-existent attribute
        isSafe = Element.isSafeAttribute(element, "b");
        System.out.println("isSafe: " + isSafe);
    }

    @Test
    public void testGetParent() {
        String element = "span";

        // Test case 1: get parent element of an element with no parent
        ParentElement parent = Element.getParent(element);
        if (parent != null) {
            System.out.println("Parent: " + parent.getName());
        } else {
            System.out.println("No parent");
        }

        // Test case 2: get parent element of an element without a parent
        parent = Element.getParent(null);
        if (parent == null) {
            System.out.println("No parent");
        } else {
            System.out.println("Parent: " + parent.getName());
        }
    }

    @Test
    public void testGetDescendant() {
        String element = "div";

        // Test case 1: get descendants of an element with no children
        DescendantElement descendant = Element.getDescendants(element);
        if (descendant != null) {
            System.out.println("Descendants: " + descendant.getName());
        } else {
            System.out.println("No descendants");
        }

        // Test case 2: get descendants of an element with children
        descendent = Element.getDescendants(null, true);
        if (descendant == null) {
            System.out.println("No descendants");
        } else {
            System.out.println("Descendants: " + descendant.getName());
        }
    }

    @Test
    public void testGetPre() {
        String element = "span";

        // Test case 1: get pre element of an element with no parent
        PreElement pre = Element.getPre(element);
        if (pre != null) {
            System.out.println("Pre: " + pre.getName());
        } else {
            System.out.println("No pre");
        }

        // Test case 2: get pre element of an element without a parent
        pre = Element.getPre(null, true);
        if (pre == null) {
            System.out.println("No pre");
        } else {
            System.out.println("Pre: " + pre.getName());
        }
    }

    @Test
    public void testGetSib() {
        String element = "span";

        // Test case 1: get sibling elements of an element with no parent
        SiblingElement sibling = Element.getSibs(element);
        if (sibling != null) {
            System.out.println("Sibling: " + sibling.getName());
        } else {
            System.out.println("No siblings");
        }

        // Test case 2: get sibling elements of an element without a parent
        sibling = Element.getSibs(null, true);
        if (sibling == null) {
            System.out.println("No siblings");
        } else {
            System.out.println("Sibling: " + sibling.getName());
        }
    }

}