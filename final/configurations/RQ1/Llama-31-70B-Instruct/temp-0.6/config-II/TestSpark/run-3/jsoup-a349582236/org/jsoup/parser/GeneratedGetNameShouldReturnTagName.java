package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetNameShouldReturnTagName {

    @Test
    public void getNameShouldReturnTagName() {
        Tag tag = new Tag("p");
        String actualName = tag.getName();
        assertEquals("p", actualName);
    }

}