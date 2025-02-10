package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedWordWrap_WithDefaultParams_ReturnsNumber {

    private void setupMockito() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void wordWrap_WithDefaultParams_ReturnsNumber() throws IOException {
        int maxWidth = 10;
        int width = WordWrap.wordWrap(reader, writer, "\n", 0, null, new HashSet<>(), false, true);
        assertEquals(maxWidth, width);
    }

}