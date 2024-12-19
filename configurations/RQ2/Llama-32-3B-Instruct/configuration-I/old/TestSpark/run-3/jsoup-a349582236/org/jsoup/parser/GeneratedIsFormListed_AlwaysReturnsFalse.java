package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormListed_AlwaysReturnsFalse {

    @Test
    public void isFormListed_AlwaysReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.isFormListed());
    }

}