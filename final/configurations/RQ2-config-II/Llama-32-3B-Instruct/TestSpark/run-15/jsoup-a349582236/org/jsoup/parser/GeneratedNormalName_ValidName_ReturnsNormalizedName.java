package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_ValidName_ReturnsNormalizedName {

    @Test
    public void normalName_ValidName_ReturnsNormalizedName() {
        String name = "div";
        Tag tag = new Tag(name);
        assertEquals(Normalizer.normalName(name), tag.normalName());
    }

}