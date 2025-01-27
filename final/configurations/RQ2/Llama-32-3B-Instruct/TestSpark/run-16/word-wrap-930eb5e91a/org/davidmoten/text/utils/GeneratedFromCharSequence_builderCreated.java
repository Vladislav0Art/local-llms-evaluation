package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;

public class GeneratedFromCharSequence_builderCreated {

    @Test
    public void fromCharSequence_builderCreated() {
        WordWrap.Builder builder = WordWrap.from("Hello World");
        assertNotNull(builder);
    }

}