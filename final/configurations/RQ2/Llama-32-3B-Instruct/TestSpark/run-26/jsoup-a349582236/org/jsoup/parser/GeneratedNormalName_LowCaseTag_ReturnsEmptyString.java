package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_LowCaseTag_ReturnsEmptyString {

    @Test
    public void normalName_LowCaseTag_ReturnsEmptyString() {
        Tag tag = new Tag("test");
        String name = tag.normalName();
        assertTrue(name.isEmpty());
    }

}