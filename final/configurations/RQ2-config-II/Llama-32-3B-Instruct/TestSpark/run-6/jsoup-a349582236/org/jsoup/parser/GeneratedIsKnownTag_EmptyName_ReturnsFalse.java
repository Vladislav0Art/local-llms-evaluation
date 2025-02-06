package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4.class)
public class GeneratedIsKnownTag_EmptyName_ReturnsFalse {

    @Test
    public void isKnownTag_EmptyName_ReturnsFalse() {
        String name = "";
        assertFalse(Tag.isKnownTag(name));
    }

}