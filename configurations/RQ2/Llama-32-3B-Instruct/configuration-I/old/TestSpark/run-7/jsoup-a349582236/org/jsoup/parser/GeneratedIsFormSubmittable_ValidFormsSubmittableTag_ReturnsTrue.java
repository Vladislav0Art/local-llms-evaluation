package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedIsFormSubmittable_ValidFormsSubmittableTag_ReturnsTrue {

    @Test
    public void isFormSubmittable_ValidFormsSubmittableTag_ReturnsTrue() {
        Tag tag = new Tag("textarea");
        assertTrue(tag.isFormSubmittable());
    }

}