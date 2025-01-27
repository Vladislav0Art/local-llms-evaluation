package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class GeneratedTestEqualsAndHashCodeNameAndTag {

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
    public void testEqualsAndHashCodeNameAndTag() {
        String name1 = "test";
        String name2 = "clone";
        Tag original = new Tag(name1);
        Tag tag = new Tag(name2);

        assertEquals(original.hashCode(), tag.hashCode());

        assertFalse(original.equals(tag));
    }

}