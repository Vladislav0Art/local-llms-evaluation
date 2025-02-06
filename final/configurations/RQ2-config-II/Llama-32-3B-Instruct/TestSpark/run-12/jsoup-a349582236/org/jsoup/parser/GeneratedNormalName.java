package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNormalName {

    @Test
    public void normalName() {
        Tag tag = new Tag();
        String result = tag.normalName();
        assertTrue(Validate.notEmpty(result));
    }

}