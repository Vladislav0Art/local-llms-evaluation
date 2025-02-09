package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_AcceptsNullInputReturnsBlank {

    @Test
    public void normalName_AcceptsNullInputReturnsBlank() {
        assertEquals("", Normalizer.normalName(null));
    }

}