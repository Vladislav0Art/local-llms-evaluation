package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestUnknownTagNameIsSubmittableReturnsTrueTest {

    @Test
    public void testUnknownTagNameIsSubmittableReturnsTrueTest() {
        Tag tag = Tag.valueOf("abc");
        assertTrue(tag.isFormSubmittable());
    }

}