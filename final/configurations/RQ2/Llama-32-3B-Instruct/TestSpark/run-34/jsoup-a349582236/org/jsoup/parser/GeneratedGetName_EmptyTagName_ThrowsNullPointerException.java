package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_EmptyTagName_ThrowsNullPointerException {

    @Test
    public void getName_EmptyTagName_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Tag.getName(""));
    }

}