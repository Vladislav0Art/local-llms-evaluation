package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedToSetTest {

    @Test
    public void toSetTest() {
        String input = "test";
        Assert.assertEquals(WordWrap.toSet(input), new HashSet<>(Arrays.asList('t', 'e', 's')));
    }

}