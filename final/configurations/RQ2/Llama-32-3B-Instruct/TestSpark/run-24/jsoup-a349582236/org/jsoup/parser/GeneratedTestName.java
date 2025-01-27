package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class GeneratedTestName {

    private String name;

    public Tag(String name) {
        this.name = name;
    }

    public String toString() {
        return "Tag{" + "name='" + name + '\'' + '}';
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TagTest {

    @Test
    public void testName() {
        String name = "test";
        Tag tag = new Tag(name);
        assertEquals(name, tag.toString());
    }

}