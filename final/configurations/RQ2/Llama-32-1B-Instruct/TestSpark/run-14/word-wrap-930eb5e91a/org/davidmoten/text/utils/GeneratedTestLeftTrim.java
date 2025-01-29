package org.davidmoten.text.utils;

import com.github.davidmoten.guavamini.Preconditions;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestLeftTrim {

    @Mock
    private BufferedReader in;

    @Mock
    private Reader reader;

    @Mock
    private Writer out;

    @Mock
    private LineConsumer lineConsumer;

    @Mock
    private Number stringWidth;

    @Mock
    private Set<Character> extraWordChars;

    @Mock
    private boolean insertHyphens;

    @Mock
    private boolean breakWords;

    @Test
    public void testLeftTrim() {
        Preconditions.checkNotNull(new WordWrap());

        when(in.read()).thenReturn(10);
        wordWrap(fromReader(new Reader[]{new BufferedReader[]{}, new BufferedReader[]{}}, false), out, "Hello", 20, stringWidth::new, extraWordChars, insertHyphens, breakWords);

        verify(lineConsumer).trimLeft("Hello");
    }

}