package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormSubmittable_EmptyTag_ReturnsFalse {

    @Test
    public void isFormSubmittable_EmptyTag_ReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.isFormSubmittable());
    }

}