package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_MultiCharacterStringReturnSameString {

    @Test
    public void normalName_MultiCharacterStringReturnSameString() {
        assertEquals("hello", Normalizer.normalName("hello"));
    }

}