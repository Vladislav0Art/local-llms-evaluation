package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.mockito.Mockito;

import java.lang.Cloneable;

public class GeneratedGetName_ReturnsName {

    @Test
    public void getName_ReturnsName() {
        Tag tag = new Tag();
        String name = "test";
        tag.setName(name);
        assertEquals(name, tag.getName());
    }

}