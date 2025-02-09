package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedPreserveWhitespace_AttributesWithoutSpaceReturnTrue {

    @Test
    public void preserveWhitespace_AttributesWithoutSpaceReturnTrue() {
        Tag tag = new Tag("input");
        assertTrue(tag.preserveWhitespace());
    }

}