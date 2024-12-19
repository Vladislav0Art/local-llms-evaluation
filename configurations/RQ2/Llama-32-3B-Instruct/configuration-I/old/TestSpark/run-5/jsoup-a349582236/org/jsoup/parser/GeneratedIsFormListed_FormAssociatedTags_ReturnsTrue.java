package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormListed_FormAssociatedTags_ReturnsTrue {

    @Test
    public void isFormListed_FormAssociatedTags_ReturnsTrue() {
        Tag tag = new Tag("input");
        assertTrue(tag.isFormListed());
    }

}