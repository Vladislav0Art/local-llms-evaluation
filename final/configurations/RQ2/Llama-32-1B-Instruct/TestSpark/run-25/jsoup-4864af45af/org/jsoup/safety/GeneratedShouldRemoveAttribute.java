package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedShouldRemoveAttribute {

    @Test
    public void shouldRemoveAttribute() {
        BrowserExtension extension = new BrowserExtension();
        extension.removeAttribute("a");
        assertEquals(0, extension.getEnforcedAttributes("a").size());
    }
}

class BrowserExtension {
    private java.util.HashMap<String, String> attributes;

    public String addAttribute(String key, String value) {
        if (attributes == null) {
            attributes = new java.util.HashMap<>();
        }
        attributes.put(key, value);
        return "add" + key;
    }

    public void removeAttribute(String key) {
        if (attributes != null && !attributes.isEmpty()) {
            attributes.remove(key);
        } else {
            throw new RuntimeException("BrowserExtension is not created yet");
        }
    }

    public java.util.HashMap<String, String> getEnforcedAttributes(String attributeName) {
        return attributes;
    }
}

class BrowserAttribute {
    public static void addAttribute(String key, String value) {
        if (browserAttributes == null || !browserAttributes.containsKey(key)) {
            browserAttributes.put(key, value);
        } else {
            throw new RuntimeException("BrowserAttribute is not created yet");
        }
    }

    public static Object getEnforcedAttributes(String attributeName) {
        return browserAttributes.get(attributeName);
    }

}