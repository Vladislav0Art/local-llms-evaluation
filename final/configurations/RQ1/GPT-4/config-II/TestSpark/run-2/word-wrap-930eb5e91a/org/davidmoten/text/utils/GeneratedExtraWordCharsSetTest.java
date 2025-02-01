package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeneratedExtraWordCharsSetTest {

    @Test
    public void extraWordCharsSetTest() {
        Builder builder = WordWrap.from("hello text");
        Set<Character> wordChars = new HashSet<>();
        wordChars.add('a');
        builder.extraWordChars(wordChars);
    }

}