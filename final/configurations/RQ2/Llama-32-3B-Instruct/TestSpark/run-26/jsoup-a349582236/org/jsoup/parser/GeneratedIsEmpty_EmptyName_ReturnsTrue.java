package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsEmpty_EmptyName_ReturnsTrue {

    @Test
    public void isEmpty_EmptyName_ReturnsTrue() {
        Tag tag = new Tag("");
        assertTrue(tag.isEmpty());
    }

}