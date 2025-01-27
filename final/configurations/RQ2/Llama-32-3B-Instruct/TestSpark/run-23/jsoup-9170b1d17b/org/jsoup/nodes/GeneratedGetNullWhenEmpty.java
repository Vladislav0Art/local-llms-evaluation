package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetNullWhenEmpty {

    @Mock
    private Attribute attributeMock;

    @Test
    public void getNullWhenEmpty() {
        Attributes attributes = new Attributes();
        assertEquals("", attributes.get(""));
    }

}