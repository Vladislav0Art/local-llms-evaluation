package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedClose_ThrowsNullPointerException {

    private void setupMockito() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void close_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> WordWrap.close(reader));
    }

}