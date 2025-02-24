package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIndexOfKeyTest_WhenKeyIsNull_ReturnsMinusOne {

    @Mock
    private Attributes attributes;

    @Test
    public void indexOfKeyTest_WhenKeyIsNull_ReturnsMinusOne() {
        int actual = attributes.indexOfKey(null);

        assertEquals(-1, actual);
    }

}