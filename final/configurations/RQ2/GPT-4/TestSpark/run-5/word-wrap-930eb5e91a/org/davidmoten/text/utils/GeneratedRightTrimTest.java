package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        String text = "Hello, World!  ";
        Assert.assertEquals("Hello, World!", WordWrap.rightTrim(text).toString());
    }

}