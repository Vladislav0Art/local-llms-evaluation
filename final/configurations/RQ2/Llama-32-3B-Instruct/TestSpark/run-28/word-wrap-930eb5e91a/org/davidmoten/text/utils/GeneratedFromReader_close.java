package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedFromReader_close {

    @Mock
    private BufferedReader reader;

    @Mock
    private LineConsumer lineConsumer;

    private WordWrap wordWrap = new WordWrap();

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.davidmoten.text.utils.WordWrapTest");
    }

    @Test
    public void fromReader_close() {
        // Given

        // When
        wordWrap.close(reader);

        // Then
        verifyClose(reader);
    }

    private boolean verifyClose(BufferedReader reader) {
        // Implementation of the logic to check if reader is closed
        return true;
    }
}

class Builder {
}

}