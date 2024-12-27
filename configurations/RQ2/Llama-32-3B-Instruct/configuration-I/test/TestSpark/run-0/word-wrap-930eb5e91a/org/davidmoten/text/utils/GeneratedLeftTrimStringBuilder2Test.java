package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedLeftTrimStringBuilder2Test {

    @Test
    public void leftTrimStringBuilder2Test() {
        StringBuilder word = new StringBuilder("word ");
        WordWrap.leftTrim(word);
        Mockito.verify(word, Mockito.times(1)).append(' ');
    }

}