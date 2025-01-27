package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsFormListed_TagWithNameAttrFormAttributesReturnsTrue {

    @Test
    public void isFormListed_TagWithNameAttrFormAttributesReturnsTrue() {
        assertTrue(Tag.isFormListed("<form><tag>"));
    }

}