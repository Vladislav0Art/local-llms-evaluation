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

public class GeneratedFromCharSequenceTest {

    @Test
    public void fromCharSequenceTest() {
        Builder builder = WordWrap.from("a string sequence");
        Assert.assertNotNull(builder);
    }

}