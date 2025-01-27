package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_EmptyName_ReturnsEmptyString {

    @Test
    public void normalName_EmptyName_ReturnsEmptyString() {
        Tag tag = new Tag("");
        String name = tag.normalName();
        assertTrue(name.isEmpty());
    }

}