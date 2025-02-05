package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class GeneratedFromNullFileTest {

    @Test
    public void fromNullFileTest() throws FileNotFoundException {
        File file = null;
        WordWrap.from(file, StandardCharsets.UTF_8);
    }

}