package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormListed_ReturnsFalseByDefault {

    @Test
    public void isFormListed_ReturnsFalseByDefault() {
        Tag tag = new Tag();
        assertFalse(tag.isFormListed());
    }

}