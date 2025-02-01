package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Set;
import java.util.stream.Collectors;

public class GeneratedFromClasspathUtf8Test {

    @Test
    public void fromClasspathUtf8Test() {
        WordWrap.fromClasspath("/test.txt", StandardCharsets.UTF_8);
    }

}