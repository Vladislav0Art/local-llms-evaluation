package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.*;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        CharSequence text = "   hello  ";
        Assert.assertEquals(WordWrap.rightTrim(text), "   hello");
    }

}