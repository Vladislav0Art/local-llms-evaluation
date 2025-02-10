package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedFromUtf8_ThrowsFileNotFoundException {

    private void setupMockito() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void fromUtf8_ThrowsFileNotFoundException() {
        assertThrows(FileNotFoundException.class, () -> WordWrap.fromUtf8(new FileInputStream("non-existent-file")));
    }

}