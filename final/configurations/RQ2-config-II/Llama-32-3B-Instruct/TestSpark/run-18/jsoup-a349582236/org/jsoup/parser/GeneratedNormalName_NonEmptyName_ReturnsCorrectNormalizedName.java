package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedNormalName_NonEmptyName_ReturnsCorrectNormalizedName {

    @Test
    public void normalName_NonEmptyName_ReturnsCorrectNormalizedName() {
        Tag tag = new Tag();
        tag.setName("test");
        assertEquals(Validate.uniq, tag.normalName());
    }

}