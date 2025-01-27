package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class GeneratedTestClone {

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
    public void testClone() {
        String name = "test";
        Tag original = new Tag(name);
        Tag clone = new Tag(name);

        assertNotNull(clone);
        assertSame(original, clone);
    }

}