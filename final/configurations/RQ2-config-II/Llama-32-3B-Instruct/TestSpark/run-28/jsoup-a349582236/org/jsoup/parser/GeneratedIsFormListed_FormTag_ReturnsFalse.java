package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormListed_FormTag_ReturnsFalse {

    @Test
    public void isFormListed_FormTag_ReturnsFalse() {
        Tag tag = new Tag();
        tag.setName("form");
        assertFalse(tag.isFormListed());
    }

}