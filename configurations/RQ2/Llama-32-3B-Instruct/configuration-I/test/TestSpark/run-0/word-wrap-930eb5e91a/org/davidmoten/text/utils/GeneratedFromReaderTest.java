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

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() throws IOException {
        String resource = "resource";
        ByteArrayInputStream in = new ByteArrayInputStream(resource.getBytes(StandardCharsets.UTF_8));
        Reader reader = new InputStreamReader(in);
        boolean close = true;
        WordWrap.Builder builder = WordWrap.from(reader, close);
        Mockito.verify(builder).setText(resource);
    }

}