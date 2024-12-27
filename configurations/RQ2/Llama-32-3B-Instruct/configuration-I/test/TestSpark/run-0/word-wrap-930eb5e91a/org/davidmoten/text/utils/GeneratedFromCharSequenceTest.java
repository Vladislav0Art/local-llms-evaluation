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

public class GeneratedFromCharSequenceTest {

    @Test
    public void fromCharSequenceTest() {
        CharSequence text = "text";
        WordWrap.Builder builder = WordWrap.from(text);
        Mockito.verify(builder).setText(text.toString());
    }

}