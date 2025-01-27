package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormListed_NormalFormTag_ReturnsTrue {

    @Test
    public void isFormListed_NormalFormTag_ReturnsTrue() {
        String tagName = "form";
        Tag tag = Tag.valueOf(tagName);
        assertTrue(tag.isFormListed());
    }

}