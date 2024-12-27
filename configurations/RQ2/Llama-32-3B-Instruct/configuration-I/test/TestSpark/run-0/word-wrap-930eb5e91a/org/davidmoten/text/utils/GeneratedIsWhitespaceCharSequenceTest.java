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

public class GeneratedIsWhitespaceCharSequenceTest {

    @Test
    public void isWhitespaceCharSequenceTest() {
        CharSequence s = "";
        boolean result = WordWrap.isWhitespace(s);
        Mockito.verify(result, Mockito.times(1)).booleanValue();
    }

}