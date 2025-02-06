package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedGetName_NonEmptyName_ReturnsCorrectName {

    @Test
    public void getName_NonEmptyName_ReturnsCorrectName() {
        Tag tag = new Tag();
        tag.setName("test");
        assertEquals("test", tag.getName());
    }

}