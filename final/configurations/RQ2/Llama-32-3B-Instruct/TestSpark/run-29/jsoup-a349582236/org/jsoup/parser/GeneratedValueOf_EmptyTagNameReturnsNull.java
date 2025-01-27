package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_EmptyTagNameReturnsNull {

    @Test
    public void valueOf_EmptyTagNameReturnsNull() {
        Tag tag = Tag.valueOf("");
        assertNull(tag);
    }

}