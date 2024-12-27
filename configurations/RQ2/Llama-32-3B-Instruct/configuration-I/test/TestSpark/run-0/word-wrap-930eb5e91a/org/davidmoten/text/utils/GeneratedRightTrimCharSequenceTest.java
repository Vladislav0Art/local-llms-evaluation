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

public class GeneratedRightTrimCharSequenceTest {

    @Test
    public void rightTrimCharSequenceTest() {
        CharSequence s = " text";
        CharSequence result = WordWrap.rightTrim(s);
        Mockito.verify(result).equals(" text");
    }

}