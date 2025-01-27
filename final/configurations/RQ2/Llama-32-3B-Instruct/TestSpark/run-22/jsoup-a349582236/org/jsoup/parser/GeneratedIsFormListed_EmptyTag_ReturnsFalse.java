package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormListed_EmptyTag_ReturnsFalse {

    @Test
    public void isFormListed_EmptyTag_ReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.isFormListed());
    }

}