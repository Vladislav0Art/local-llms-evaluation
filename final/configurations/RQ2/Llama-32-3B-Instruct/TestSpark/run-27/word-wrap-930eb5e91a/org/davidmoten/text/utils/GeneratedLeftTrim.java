package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedLeftTrim {

    @Mock
    private Reader reader;

    @Mock
    private Writer writer;

    @Mock
    private LineConsumer lineConsumer;

    @Mock
    private String newLine;

    @Mock
    private Number maxWidth;

    @Mock
    private Function<CharSequence, Number> stringWidth;

    @Mock
    private Set<Character> extraWordChars;

    @Mock
    private boolean insertHyphens;

    @Mock
    private boolean breakWords;

    @Test
    public void leftTrim() {
        StringBuilder2 word = new StringBuilder2();
        WordWrap.leftTrim(word, "   Hello World!  ");
        assertThat(word.toString(), is("   Hello World!"));
    }
}

class LineConsumer {
    private StringBuilder line = new StringBuilder();

    public void accept(CharSequence s) {
        line.append(s);
    }

    public String getLine() {
        return line.toString();
    }
}

class ByteArrayInputStream extends InputStream {

    private byte[] data;

    public ByteArrayInputStream(byte[] data) {
        this.data = data;
    }

    @Override
    public int read() throws IOException {
        if (data == null || data.length == 0) {
            throw new IOException("End of input");
        }
        return data[0];
    }
}

class StringBuilder2 extends StringBuilder {
    private String toString() {
        return value();
    }

    public void trim(int start, int end) {
        value() = substring(start, end);
    }

}