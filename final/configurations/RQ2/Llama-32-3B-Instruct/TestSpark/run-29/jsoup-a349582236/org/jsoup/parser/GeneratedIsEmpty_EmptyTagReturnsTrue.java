package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsEmpty_EmptyTagReturnsTrue {

    @Test
    public void isEmpty_EmptyTagReturnsTrue() {
        assertTrue(Tag.valueOf("").isEmpty());
    }

}