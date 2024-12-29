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
public class GeneratedLeftTrimBuilder2 ReturnsString {

    @Test
    public void leftTrimBuilder2

    ReturnsString() {
        // given
        StringBuilder2 word = Mockito.mock(StringBuilder2.class);
        String originalText = "   hello world  ";

        // when
        String result = WordWrap.leftTrim(word).toString();

        // then
        assertEquals(originalText, result);
    }

}