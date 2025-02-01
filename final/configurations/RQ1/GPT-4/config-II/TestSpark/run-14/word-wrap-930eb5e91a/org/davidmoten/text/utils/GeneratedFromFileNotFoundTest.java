package org.davidmoten.text.utils;

import com.github.davidmoten.guavamini.annotations.VisibleForTesting;
import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class GeneratedFromFileNotFoundTest {

    @Test
    public void fromFileNotFoundTest() {
        File file = new File("nonExistingFile.txt");
        WordWrap.from(file, StandardCharsets.UTF_8);
    }

}