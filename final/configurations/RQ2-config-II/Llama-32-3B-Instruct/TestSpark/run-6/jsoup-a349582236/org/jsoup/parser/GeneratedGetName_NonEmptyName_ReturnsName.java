package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4.class)
public class GeneratedGetName_NonEmptyName_ReturnsName {

    @Test
    public void getName_NonEmptyName_ReturnsName() {
        String name = "div";
        assertEquals("div", Tag.valueOf(name).getName());
    }

}