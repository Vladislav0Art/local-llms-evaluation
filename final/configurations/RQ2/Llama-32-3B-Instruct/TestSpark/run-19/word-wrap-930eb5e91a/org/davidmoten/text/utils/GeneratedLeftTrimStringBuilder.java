package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedLeftTrimStringBuilder {

    @Mock
    private Reader reader;

    @InjectMocks
    private WordWrap wordWrap;

    @Test
    public void leftTrimStringBuilder() {
        StringBuilder2 word = new StringBuilder2();
        when(reader.read()).thenReturn(0);
        word.leftTrim(word);
        assertEquals("", word.toString());
    }
}

class StringBuilder2 extends StringBuilder {
    private boolean trimmed;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && trimmed;
    }

    void leftTrim(StringBuilder sb) {
        this.trimmed = true;
        sb.replace(0, 0, "");
    }

}