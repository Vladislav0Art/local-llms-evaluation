package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormSubmittable {

    @Test
    public void isFormSubmittable() {
        Tag formTag = new Tag();
        formTag.setName("form");
        assertTrue(formTag.isFormSubmittable());
    }

}