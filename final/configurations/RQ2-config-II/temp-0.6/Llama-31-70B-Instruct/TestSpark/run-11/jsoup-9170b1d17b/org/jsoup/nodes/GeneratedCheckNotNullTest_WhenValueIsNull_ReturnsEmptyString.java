package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckNotNullTest_WhenValueIsNull_ReturnsEmptyString {

    @Mock
    private Attributes attributes;

    @Test
    public void checkNotNullTest_WhenValueIsNull_ReturnsEmptyString() {
        String actual = Attributes.checkNotNull(null);

        assertEquals("", actual);
    }

}