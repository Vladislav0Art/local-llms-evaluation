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

public class GeneratedFromClasspathTest {

    @Test
    public void fromClasspathTest() throws IOException {
        String resource = "resource";
        Charset charset = StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.fromClasspath(resource, charset);
        Mockito.verify(builder).setText(resource);
    }

}