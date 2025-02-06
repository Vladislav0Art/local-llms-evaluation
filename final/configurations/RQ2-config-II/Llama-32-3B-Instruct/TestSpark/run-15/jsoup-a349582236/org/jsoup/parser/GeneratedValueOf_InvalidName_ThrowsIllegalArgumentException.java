package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_InvalidName_ThrowsIllegalArgumentException {

    @Test
    public void valueOf_InvalidName_ThrowsIllegalArgumentException() {
        Validate.assertThat(() -> Tag.valueOf("img", null), Throws.instanceOf(IllegalArgumentException.class));
    }

}