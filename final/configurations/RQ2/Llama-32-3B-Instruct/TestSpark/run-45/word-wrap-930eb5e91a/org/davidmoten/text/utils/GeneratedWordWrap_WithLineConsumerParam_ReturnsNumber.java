package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedWordWrap_WithLineConsumerParam_ReturnsNumber {

    private void setupMockito() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void wordWrap_WithLineConsumerParam_ReturnsNumber() throws IOException {
        int maxWidth = 10;
        int width = WordWrap.wordWrap(reader, writer, "\n", maxWidth, null, new HashSet<>(), false, true);
        assertEquals(maxWidth, width);
    }

}