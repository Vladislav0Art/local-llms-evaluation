package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedLeftTrimBuilder2 {

    @Mock
    public Reader readerMock;

    @Mock
    public Writer writerMock;

    @Test
    public void leftTrimBuilder2() {
        // Arrange
        StringBuilder sb = new StringBuilder();

        // Act and Assert
        WordWrap.leftTrim(sb);
        assertEquals("Hello", sb.toString());
    }
}

class File extends java.io.File {
}

class LineConsumer {
    public void consume(CharSequence line) {
    }
}

class Reader implements java.io.Reader {
}

class Writer implements java.io.Writer {
}

class Builder {
    private CharSequence text;

    public Builder from(Reader reader) {
        // implementation
        return this;
    }

    public String toString() {
        // implementation
        return "";
    }

}