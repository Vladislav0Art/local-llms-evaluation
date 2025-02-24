package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class GeneratedShouldReturnGetIgnoreCase {

    // TODO: add your unit test code here
    private Attributes attributes;

    @BeforeEach
    void setUp() {
        attributes = new Attributes();
    }

    @Test
    public void shouldReturnGetIgnoreCase() {
        String actualResult = attributes.getIgnoreCase("key");
        assertNull(actualResult);
    }

}