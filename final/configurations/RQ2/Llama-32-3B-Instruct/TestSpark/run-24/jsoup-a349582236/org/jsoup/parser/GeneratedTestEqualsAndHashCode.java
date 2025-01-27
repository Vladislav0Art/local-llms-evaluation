package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class GeneratedTestEqualsAndHashCode {

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
    public void testEqualsAndHashCode() {
        String name1 = "test";
        String name2 = "test";
        Tag original = new Tag(name1);
        Tag clone = new Tag(name2);

        assertEquals(original.hashCode(), clone.hashCode());

        assertFalse(original.equals(clone));
    }
}

}