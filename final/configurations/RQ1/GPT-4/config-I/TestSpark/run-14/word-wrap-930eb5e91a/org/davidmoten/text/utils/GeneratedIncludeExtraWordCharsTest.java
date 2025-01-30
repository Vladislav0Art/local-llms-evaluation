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

public class GeneratedIncludeExtraWordCharsTest {

    @Test
    public void includeExtraWordCharsTest() {
        String includeWordChars = "-";
        WordWrap.Builder builder = WordWrap.from("This is a normal text").includeExtraWordChars(includeWordChars);
        Assert.assertTrue(builder.extraWordChars.contains('-'));
    }

}