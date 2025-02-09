package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_InvalidTagName_ThrowsIllegalArgumentException {

    @Test
    public void normalName_InvalidTagName_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Tag.normalName("div"));
    }

}