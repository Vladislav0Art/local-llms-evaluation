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

public class GeneratedWrapToListTest {

    @Test
    public void wrapToListTest() {
        List<String> result = WordWrap.from("some words to split").wrapToList();
        Assert.assertEquals(4, result.size());
    }

}