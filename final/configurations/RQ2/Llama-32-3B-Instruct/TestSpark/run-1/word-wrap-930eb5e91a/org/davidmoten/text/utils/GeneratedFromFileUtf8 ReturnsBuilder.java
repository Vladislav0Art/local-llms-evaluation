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
public class GeneratedFromFileUtf8 ReturnsBuilder {

    @Test
    public void fromFileUtf8

    ReturnsBuilder() {
        // given
        File file = new File("test.file");
        Charset charset = StandardCharsets.UTF_8;

        // when
        WordWrap.Builder builder = WordWrap.from(file, charset);

        // then
        assertNotNull(builder);
    }

}