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
public class GeneratedWordWrap {

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
    public void wordWrap() throws IOException {
        when(reader.read()).thenReturn(1);
        when(writer.write(any())).thenReturn(0);
        WordWrap.wordWrap(reader, writer, newLine, maxWidth, stringWidth, extraWordChars, insertHyphens, breakWords);
        Mockito.verify(writer).write(isA(String.class));
    }

}