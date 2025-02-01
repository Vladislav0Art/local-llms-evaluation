package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Set;
import java.util.stream.Collectors;

public class GeneratedFromCharSequenceTest {

    @Test
    public void fromCharSequenceTest() {
        WordWrap.from("Foo bar");
    }

}