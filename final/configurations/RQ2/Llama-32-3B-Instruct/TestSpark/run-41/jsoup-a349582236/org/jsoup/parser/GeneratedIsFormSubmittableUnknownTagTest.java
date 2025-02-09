package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.helper.ParseSettings;

public class GeneratedIsFormSubmittableUnknownTagTest {

    @Test
    public void isFormSubmittableUnknownTagTest() {
        assertFalse(Tag.valueOf("unknown").isFormSubmittable());
    }

}