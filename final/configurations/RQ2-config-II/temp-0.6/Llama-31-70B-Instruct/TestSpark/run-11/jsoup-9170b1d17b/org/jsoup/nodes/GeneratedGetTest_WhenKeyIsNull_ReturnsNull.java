package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetTest_WhenKeyIsNull_ReturnsNull {

    @Mock
    private Attributes attributes;

    @Test
    public void getTest_WhenKeyIsNull_ReturnsNull() {
        String actual = attributes.get(null);

        assertNull(actual);
    }

}