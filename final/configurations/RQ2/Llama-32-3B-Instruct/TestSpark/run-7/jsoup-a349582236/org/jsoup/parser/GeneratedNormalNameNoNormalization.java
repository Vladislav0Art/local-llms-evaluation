package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;

public class GeneratedNormalNameNoNormalization {

    @Test
    public void normalNameNoNormalization() {
        Tag tag = new Tag();
        tag.setName("test");
        String result = tag.normalName();
        assertNotNull(result);
        assertFalse(result.equals(tag.getName()));
    }

}