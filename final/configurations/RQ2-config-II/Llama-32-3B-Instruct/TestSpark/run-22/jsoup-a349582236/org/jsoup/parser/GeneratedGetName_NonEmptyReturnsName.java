package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_NonEmptyReturnsName {

    @Test
    public void getName_NonEmptyReturnsName() {
        Tag tag = new Tag();
        tag.setName("tagName");
        assertEquals("tagName", tag.getName());
    }

}