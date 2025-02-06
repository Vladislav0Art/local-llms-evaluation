package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_SimpleTag_ReturnsTagInstance {

    @Test
    public void valueOf_SimpleTag_ReturnsTagInstance() {
        Tag tag = Tag.valueOf("p");
        assertNotNull(tag);
    }

}