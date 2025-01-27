package org.davidmoten.text.utils;

import com.github.davidmoten.guavamini.Preconditions;
import com.github.davidmoten.guavamini.annotations.VisibleForTesting;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Set;

public class GeneratedFromReader_returnBuilder {

    @Mock
    private Reader reader;

    @Mock
    private LineConsumer lineConsumer;

    @Mock
    private Writer writer;

    @VisibleForTesting
    private static Builder builder = new Builder();

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.davidmoten.text.utils.WordWrapTest");
    }

    @Test
    public void fromReader_returnBuilder() {
        Preconditions.checkTrue(WordWrap.from(reader).isPresent());
    }

}