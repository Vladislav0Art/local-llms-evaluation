package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedPutTest_WhenKeyIsNull_ThrowsIllegalArgumentException {

    @Mock
    private Attributes attributes;

    @Test
    public void putTest_WhenKeyIsNull_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> attributes.put(null, "value"));
    }

}