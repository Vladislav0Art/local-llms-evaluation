package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_NonEmptyReturnsNormalizedName {

    @Test
    public void normalName_NonEmptyReturnsNormalizedName() {
        Tag tag = new Tag();
        tag.setName("tagName");
        assertEquals(Normalizer.normalize(tag.getName()), tag.normalName());
    }

}