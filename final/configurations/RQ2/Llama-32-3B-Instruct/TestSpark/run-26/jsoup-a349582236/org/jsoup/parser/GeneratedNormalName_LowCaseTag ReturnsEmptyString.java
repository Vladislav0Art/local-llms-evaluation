package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_LowCaseTag ReturnsEmptyString {

    @Test
    public void normalName_LowCaseTag

    ReturnsEmptyString() {
        Tag tag = new Tag("test");
        String name = tag.normalName();
        assertEquals("", name);
    }

}