package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTestTagName {

    private String name;

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isFormListable() {
        return true; // assuming all tags are form listable
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestTag {

    @Test
    public void testTagName() {
        Tag tag = new Tag("test");
        assertEquals("test", tag.getName());
    }

}