package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4.class)
public class GeneratedNormalName_NonEmptyName_ReturnsNormalName {

    @Test
    public void normalName_NonEmptyName_ReturnsNormalName() {
        String name = "div";
        assertEquals("div", Tag.valueOf(name).normalName());
    }

}