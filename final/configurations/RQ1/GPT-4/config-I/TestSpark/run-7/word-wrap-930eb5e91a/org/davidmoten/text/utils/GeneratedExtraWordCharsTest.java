package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Set;

public class GeneratedExtraWordCharsTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void extraWordCharsTest() {
        Set<Character> chars = Collections.singleton('a');
        Builder builder = WordWrap.from("Some input string").extraWordChars(chars);
        Assert.assertNotNull(builder);
    }

}