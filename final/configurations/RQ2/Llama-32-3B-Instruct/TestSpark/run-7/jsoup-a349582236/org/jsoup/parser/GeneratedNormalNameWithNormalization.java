package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;

public class GeneratedNormalNameWithNormalization {

    @Test
    public void normalNameWithNormalization() {
        Tag tag = new Tag();
        tag.setName("test");
        tag.normalName(); // Normalize the string
        String result = tag.normalName();
        assertNotNull(result);
        assertEquals("test", result);
    }

}