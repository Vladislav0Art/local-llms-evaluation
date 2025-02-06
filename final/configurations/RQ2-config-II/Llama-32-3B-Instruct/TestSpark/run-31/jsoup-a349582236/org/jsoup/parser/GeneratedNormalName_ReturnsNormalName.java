package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.mockito.Mockito;

import java.lang.Cloneable;

public class GeneratedNormalName_ReturnsNormalName {

    @Test
    public void normalName_ReturnsNormalName() {
        Tag tag = new Tag();
        String normalName = "test";
        tag.setNormalName(normalName);
        assertEquals(normalName, tag.normalName());
    }

}