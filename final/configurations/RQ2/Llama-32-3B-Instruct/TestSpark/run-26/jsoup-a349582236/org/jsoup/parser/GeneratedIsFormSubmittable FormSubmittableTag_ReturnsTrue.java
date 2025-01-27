package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormSubmittable FormSubmittableTag_ReturnsTrue {

    @Test
    public void isFormSubmittable

    FormSubmittableTag_ReturnsTrue() {
        Tag tag = new Tag("input");
        assertTrue(tag.isFormSubmittable());
    }

}