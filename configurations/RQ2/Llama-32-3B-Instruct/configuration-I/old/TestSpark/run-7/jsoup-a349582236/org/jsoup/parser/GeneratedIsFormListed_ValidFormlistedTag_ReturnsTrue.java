package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedIsFormListed_ValidFormlistedTag_ReturnsTrue {

    @Test
    public void isFormListed_ValidFormlistedTag_ReturnsTrue() {
        Tag tag = new Tag("input");
        assertTrue(tag.isFormListed());
    }

}