package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.charset.Charset;

public class GeneratedFrom_CharSequence_ReturnsBuilder {

    @Test
    public void from_CharSequence_ReturnsBuilder() {
        WordWrap.Builder builder = WordWrap.from(new String("Hello World"));
        assertNotNull(builder);
    }

}