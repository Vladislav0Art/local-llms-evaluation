package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedLeftTrim_WithEmptyStringBuilder2ReturnsEmptyStringBuilder {

    private void setupMockito() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void leftTrim_WithEmptyStringBuilder2ReturnsEmptyStringBuilder() {
        StringBuilder sb = new StringBuilder();
        assertEquals(sb, WordWrap.leftTrim(new StringBuilder2()));
    }

}