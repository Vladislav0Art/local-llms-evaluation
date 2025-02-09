package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestNormalName_InvalidTagName_ThrowsIllegalArgumentException {

    @Test
    public void testNormalName_InvalidTagName_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Tag.normalName("div"));
    }

}