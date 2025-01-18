package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class GeneratedFromClasspathTest {

    @Test
    public void fromClasspathTest() {
        String resource = "resource.txt";
        Assert.assertNotNull(WordWrap.fromClasspath(resource, java.nio.charset.StandardCharsets.UTF_8));
    }

}