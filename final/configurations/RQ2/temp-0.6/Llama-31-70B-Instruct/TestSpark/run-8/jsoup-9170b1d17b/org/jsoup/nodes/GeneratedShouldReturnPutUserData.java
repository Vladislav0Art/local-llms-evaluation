package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class GeneratedShouldReturnPutUserData {

    // TODO: add your unit test code here
    private Attributes attributes;

    @BeforeEach
    void setUp() {
        attributes = new Attributes();
    }

    @Test
    public void shouldReturnPutUserData() {
        Attributes actualResult = attributes.putUserData("key", "value");
        assertNotNull(actualResult);
    }

}