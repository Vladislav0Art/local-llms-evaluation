package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4.class)
public class GeneratedIsFormListed_FormTag_ReturnsFalse {

    @Test
    public void isFormListed_FormTag_ReturnsFalse() {
        Tag tag = Tag.valueOf("form");
        assertFalse(tag.isFormListed());
    }

}