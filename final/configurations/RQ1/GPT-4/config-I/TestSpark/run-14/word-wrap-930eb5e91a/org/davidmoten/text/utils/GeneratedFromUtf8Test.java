package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Function;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("This is a normal text".getBytes(StandardCharsets.UTF_8));
        String wrappedText = WordWrap.fromUtf8(byteArrayInputStream).wrap();
        Assert.assertFalse(wrappedText.isEmpty());
    }

}