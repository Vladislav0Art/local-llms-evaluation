package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4.class)
public class GeneratedGetName_EmptyName_ReturnsEmptyString {

    @Test
    public void getName_EmptyName_ReturnsEmptyString() {
        String name = "";
        assertEquals("", Tag.valueOf(name).getName());
    }

}