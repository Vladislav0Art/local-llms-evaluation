package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestRoot {

    @Test
    public void testRoot() {
        Element element = new Element();
        assertEquals(element, element.root());
    }
}

public class Element {

    private String attributes = "";
    private String className = "";

    public void addAttribute(String key, String value) {
        attributes += key + "=" + value + ";";
    }

    public void setAttribute(String key, String value) {
        attributes = attributes.replaceFirst(key + "=", value);
        this.key = key;
        this.value = value;
    }

    public void removeAttr(String attributeKey) {
        attributes = attributes.replace(attributeKey + "=", "");
    }

    public boolean hasClass(String className) {
        return this.className.contains(className);
    }

    public void addClass(String className) {
        if (!this.className.contains(className)) {
            this.className += " " + className;
        }
    }

    public void removeClass(String className) {
        if (this.className.contains(className)) {
            this.className = this.className.replace(" " + className, "");
        }
    }

    public String getAttribute(String attributeKey) {
        return attributes.split("=")[1];
    }

    public Element clone() {
        // Implementation of element.clone()
        return null;
    }

    public String val() {
        // Implementation of element.val()
        return "";
    }

    public void text(String text) {
        this.value = text;
    }

}