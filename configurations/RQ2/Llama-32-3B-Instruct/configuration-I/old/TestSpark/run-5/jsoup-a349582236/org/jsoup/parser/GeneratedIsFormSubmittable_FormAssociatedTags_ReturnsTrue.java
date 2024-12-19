package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormSubmittable_FormAssociatedTags_ReturnsTrue {

    @Test
    public void isFormSubmittable_FormAssociatedTags_ReturnsTrue() {
        Tag tag = new Tag("input");
        assertTrue(tag.isFormSubmittable());
    }

}