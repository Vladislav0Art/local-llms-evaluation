package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class GeneratedShouldReturnAdd {

    // TODO: add your unit test code here
    private Attributes attributes;

    @BeforeEach
    void setUp() {
        attributes = new Attributes();
    }

    @Test
    public void shouldReturnAdd() {
        Attributes actualResult = attributes.add("key", "value");
        assertNotNull(actualResult);
    }

}