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

public class GeneratedFromClasspathUtf8Test {

    @Test
    public void fromClasspathUtf8Test() throws IOException {
        String resource = "resource";
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8(resource);
        Mockito.verify(builder).setText(resource);
    }

}