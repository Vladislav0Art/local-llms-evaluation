package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRightTrim {

    @Mock
    private Reader reader;

    @Mock
    private LineConsumer lineConsumer;

    @Mock
    private File file;

    @Test
    public void rightTrim() {
        assertEquals("", WordWrap.rightTrim("\t  "));
    }

    private static class MockInputStream implements InputStream {
        private int cursor = 0;

        @Override
        public int read() throws IOException {
            return cursor++;
        }

        @Override
        public long skip(long toSkip) throws IOException, InterruptedException {
            throw new UnsupportedOperationException();
        }
    }

    private static class LineConsumer {
        boolean accepted = false;

        void accept(CharSequence line) {
            accepted = true;
        }
    }

    private static class StringBuilder2 extends StringBuilder {
        // dummy implementation
    }

}