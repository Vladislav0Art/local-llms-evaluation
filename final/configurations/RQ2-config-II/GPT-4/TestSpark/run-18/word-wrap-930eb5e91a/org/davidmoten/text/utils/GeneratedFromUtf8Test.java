package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.StringReader;
import java.io.StringWriter;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.nio.charset.Charset;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() {
        InputStream in = new ByteArrayInputStream("test".getBytes());
        Builder result = WordWrap.fromUtf8(in);
        assertEquals("Data mismatch.", "test", result.getData());
    }

}