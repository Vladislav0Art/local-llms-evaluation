package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedClone {

    @Test
    public void clone() {
        Tag tag = org.jsoup.parser.Tag.valueOf("");
        Tag clonedTag = (Tag) tag.clone();
        assertNotNull(clonedTag);
        assertFalse(tag.equals(clonedTag));
    }

}