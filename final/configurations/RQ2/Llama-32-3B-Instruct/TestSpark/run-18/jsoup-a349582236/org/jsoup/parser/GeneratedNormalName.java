package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName {

    @Test
    public void normalName() {
        Tag tag = new Tag();
        tag.setName("test");
        assertEquals("test", tag.normalName());
    }

}