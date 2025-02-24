package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    // TODO: add your unit test code here
    private Attributes attributes;

    @BeforeEach
    void setUp() {
        attributes = new Attributes();
    }

    @Test
    public void shouldReturnIndexOfKey() {
        int actualResult = attributes.indexOfKey("key");
        assertEquals(0, actualResult);
    }

    @Test
    public void shouldReturnCheckNotNull() {
        String actualResult = Attributes.checkNotNull(attributes);
        assertEquals("", actualResult);
    }

    @Test
    public void shouldReturnGet() {
        String actualResult = attributes.get("key");
        assertNull(actualResult);
    }

    @Test
    public void shouldReturnGetIgnoreCase() {
        String actualResult = attributes.getIgnoreCase("key");
        assertNull(actualResult);
    }

    @Test
    public void shouldReturnGetUserData() {
        String actualResult = attributes.getUserData("key");
        assertNull(actualResult);
    }

    @Test
    public void shouldReturnAdd() {
        Attributes actualResult = attributes.add("key", "value");
        assertNotNull(actualResult);
    }

    @Test
    public void shouldReturnPut() {
        Attributes actualResult = attributes.put("key", "value");
        assertNotNull(actualResult);
    }

    @Test
    public void shouldReturnPutUserData() {
        Attributes actualResult = attributes.putUserData("key", "value");
        assertNotNull(actualResult);
    }

}