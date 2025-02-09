package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormListed_ReturnsFalseForNonFormTags {

    @Test
    public void isFormListed_ReturnsFalseForNonFormTags() {
        assertFalse(Tag.class.isAssignableFrom(EmptyTag.class));
        EmptyTag emptyTag = (EmptyTag) Tag.valueOf("");
        assertFalse(emptyTag.isFormListed());
        assertFalse(Tag.valueOf("img").isFormListed());
    }

}