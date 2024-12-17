package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormSubmittable_AlwaysReturnsFalse {

    @Test
    public void isFormSubmittable_AlwaysReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.isFormSubmittable());
    }

}