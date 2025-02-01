package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Set;
import java.util.stream.Collectors;

public class GeneratedToSetTest {

    @Test
    public void toSetTest() {
        String test = "test";
        Set<Character> expected = test.chars().mapToObj(e -> (char) e).collect(Collectors.toSet());
        Assert.assertEquals(expected, WordWrap.Builder.toSet(test));
    }

}