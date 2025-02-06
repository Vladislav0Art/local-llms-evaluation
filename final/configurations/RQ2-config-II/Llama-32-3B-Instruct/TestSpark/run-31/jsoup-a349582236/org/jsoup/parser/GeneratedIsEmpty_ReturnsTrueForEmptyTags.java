package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.mockito.Mockito;

import java.lang.Cloneable;

public class GeneratedIsEmpty_ReturnsTrueForEmptyTags {

    @Test
    public void isEmpty_ReturnsTrueForEmptyTags() {
        Tag tag = new Tag();
        tag.setName("");
        assertTrue(tag.isEmpty());
    }

}