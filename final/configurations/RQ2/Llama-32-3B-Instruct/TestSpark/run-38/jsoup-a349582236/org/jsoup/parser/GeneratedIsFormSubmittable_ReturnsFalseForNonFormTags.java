package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormSubmittable_ReturnsFalseForNonFormTags {

    @Test
    public void isFormSubmittable_ReturnsFalseForNonFormTags() {
        assertFalse(Tag.class.isAssignableFrom(EmptyTag.class));
        EmptyTag emptyTag = (EmptyTag) Tag.valueOf("");
        assertFalse(emptyTag.isFormSubmittable());
        assertFalse(Tag.valueOf("img").isFormSubmittable());
    }

}