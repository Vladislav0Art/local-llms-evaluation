package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsKnownTag {

    @Test
    public void isKnownTag() {
        Tag tag = new Tag();
        tag.setName("p");
        assertTrue(tag.isKnownTag());
    }

}