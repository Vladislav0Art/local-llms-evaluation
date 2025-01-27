package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormListed {

    @Test
    public void isFormListed() {
        Tag formTag = new Tag();
        formTag.setName("input");
        assertTrue(formTag.isFormListed());
    }

}