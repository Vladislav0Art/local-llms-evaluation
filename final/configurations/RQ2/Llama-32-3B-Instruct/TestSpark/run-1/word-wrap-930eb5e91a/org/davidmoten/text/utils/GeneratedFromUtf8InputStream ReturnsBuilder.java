package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromUtf8InputStream ReturnsBuilder {

    @Test
    public void fromUtf8InputStream

    ReturnsBuilder() {
        // given
        InputStream in = Mockito.mock(InputStream.class);

        // when
        WordWrap.Builder builder = WordWrap.fromUtf8(in);

        // then
        assertNotNull(builder);
    }

}