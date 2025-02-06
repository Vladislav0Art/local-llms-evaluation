package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_InvalidName ThrowsIllegalArgumentException {

    @Test
    public void getName_InvalidName

    ThrowsIllegalArgumentException() {
        Validate.assertThat(() -> new Tag("div"), Throws.instanceOf(IllegalArgumentException.class));
    }

}