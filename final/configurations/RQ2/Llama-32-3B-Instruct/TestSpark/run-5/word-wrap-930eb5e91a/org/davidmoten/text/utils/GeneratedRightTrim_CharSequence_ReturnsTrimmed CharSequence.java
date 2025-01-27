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
public class GeneratedRightTrim_CharSequence_ReturnsTrimmed CharSequence {

    @Mock
    private Reader reader;

    public static class Builder {
        // implementation
    }

    @Test
    public void rightTrim_CharSequence_ReturnsTrimmed

    CharSequence() {
        Preconditions.checkNotNull(WordWrap.rightTrim("   test   "), "Expected a non-null value");
        Preconditions.checkNotNull(WordWrap.rightTrim("test"), "Expected a non-null value");
        Preconditions.checkNotNull(WordWrap.rightTrim(""), "Expected a non-null value");
    }

}