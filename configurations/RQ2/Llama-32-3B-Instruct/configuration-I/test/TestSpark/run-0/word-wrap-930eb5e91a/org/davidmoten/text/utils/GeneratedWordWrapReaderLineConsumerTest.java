package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedWordWrapReaderLineConsumerTest {

    @Test
    public void wordWrapReaderLineConsumerTest() throws IOException {
        LineConsumer out = Mockito.mock(LineConsumer.class);
        Number maximumAmountOfCharactersPerLine = 10;
        Function<CharSequence, Number> stringWidth = (s) -> 5;
        Set<Character> extraWordChars = new HashSet<>();
        boolean insertHyphens = true;
        boolean breakWords = false;
        WordWrap.wordWrap(new InputStreamReader(new ByteArrayInputStream("text".getBytes(StandardCharsets.UTF_8))), out, maximumAmountOfCharactersPerLine.toString(), stringWidth, extraWordChars, insertHyphens, breakWords);
    }

}