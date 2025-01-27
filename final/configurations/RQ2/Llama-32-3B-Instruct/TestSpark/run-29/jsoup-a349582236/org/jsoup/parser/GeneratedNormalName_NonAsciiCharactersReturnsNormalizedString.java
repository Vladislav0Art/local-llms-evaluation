package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_NonAsciiCharactersReturnsNormalizedString {

    @Test
    public void normalName_NonAsciiCharactersReturnsNormalizedString() {
        String name = new Tag("áéíóú").getName();
        assertEquals("aEiOu", name);
    }

}