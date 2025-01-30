package org.jsoup.parser;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Tag tag = Tag.valueOf("div");
        int hashCode = tag.hashCode();
        assertEquals(99162322, hashCode);
    }

}