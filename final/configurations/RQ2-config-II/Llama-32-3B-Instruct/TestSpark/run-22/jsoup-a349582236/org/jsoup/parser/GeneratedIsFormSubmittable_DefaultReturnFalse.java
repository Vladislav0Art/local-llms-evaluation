package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormSubmittable_DefaultReturnFalse {

    @Test
    public void isFormSubmittable_DefaultReturnFalse() {
        Tag tag = new Tag();
        assertFalse(tag.isFormSubmittable());
    }

}