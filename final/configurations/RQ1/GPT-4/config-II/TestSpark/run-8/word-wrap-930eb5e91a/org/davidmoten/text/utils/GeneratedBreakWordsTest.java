package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Set;
import java.util.stream.Collectors;

public class GeneratedBreakWordsTest {

    @Test
    public void breakWordsTest() {
        WordWrap.Builder builder = WordWrap.from("test");
        builder.breakWords(true);
    }

}