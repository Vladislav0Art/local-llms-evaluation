package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCheckNotNullTest {

    @Test
    public void checkNotNullTest() {
        Attributes attributes = new Attributes();

        String actualValue = attributes.checkNotNull(null);

        assertEquals("", actualValue);
    }

}