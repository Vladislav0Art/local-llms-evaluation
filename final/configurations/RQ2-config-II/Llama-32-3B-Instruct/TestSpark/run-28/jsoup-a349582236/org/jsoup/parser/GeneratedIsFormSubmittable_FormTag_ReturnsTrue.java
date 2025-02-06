package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormSubmittable_FormTag_ReturnsTrue {

    @Test
    public void isFormSubmittable_FormTag_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setName("input");
        assertTrue(tag.isFormSubmittable());
    }

}