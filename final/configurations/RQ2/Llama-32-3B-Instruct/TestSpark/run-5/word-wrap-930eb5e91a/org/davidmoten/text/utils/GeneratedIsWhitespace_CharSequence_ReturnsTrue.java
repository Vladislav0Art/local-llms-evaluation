package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsWhitespace_CharSequence_ReturnsTrue {

    @Mock
    private Reader reader;

    public static class Builder {
        // implementation
    }

    @Test
    public void isWhitespace_CharSequence_ReturnsTrue() {
        Preconditions.checkNotNull(WordWrap.isWhitespace(" "), "Expected a non-null value");
        Preconditions.checkNotNull(WordWrap.isWhitespace("\t"), "Expected a non-null value");
        Preconditions.checkNotNull(WordWrap.isWhitespace("\n"), "Expected a non-null value");
    }

}