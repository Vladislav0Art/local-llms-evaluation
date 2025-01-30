package org.davidmoten.text.utils;

import com.github.davidmoten.guavamini.Preconditions;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class GeneratedExtraWordCharsTest {

    @Test
    public void extraWordCharsTest() {
        Set<Character> extraWordChars = new HashSet<>();
        extraWordChars.add('-');
        WordWrap.Builder builder = WordWrap.from("This is a normal text").extraWordChars(extraWordChars);
        Assert.assertEquals(extraWordChars, builder.extraWordChars);
    }

}