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

public class GeneratedFromInputStreamCharsetTest {

    @Test
    public void fromInputStreamCharsetTest() throws IOException {
        String resource = "resource";
        ByteArrayInputStream in = new ByteArrayInputStream(resource.getBytes(StandardCharsets.UTF_8));
        Reader reader = new InputStreamReader(in);
        Charset charset = StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.from(reader, charset);
        Mockito.verify(builder).setText(new String(Mockito.any(byte[].class), charset));
    }

}