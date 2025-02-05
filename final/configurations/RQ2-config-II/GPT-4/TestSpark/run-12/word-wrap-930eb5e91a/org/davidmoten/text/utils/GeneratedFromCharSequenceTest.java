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

public class GeneratedFromCharSequenceTest {

    @Test
    public void fromCharSequenceTest() {
        CharSequence text = "This is a test";
        WordWrap.Builder builder = WordWrap.from(text);
        Assert.assertNotNull(builder);
    }

}