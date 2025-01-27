package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

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
    public void isKnownTag_ExistingTag() {
        String tagName = "script";
        Assert.assertTrue(Tag.isKnownTag(tagName));
    }

}