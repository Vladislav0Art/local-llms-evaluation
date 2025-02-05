package org.davidmoten.text.utils;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsWhitespaceTestNonWhitespace {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void isWhitespaceTestNonWhitespace() {
        CharSequence nonWhitespace = "Test";
        boolean result = WordWrap.isWhitespace(nonWhitespace);
        assertTrue(!result);
    }

}