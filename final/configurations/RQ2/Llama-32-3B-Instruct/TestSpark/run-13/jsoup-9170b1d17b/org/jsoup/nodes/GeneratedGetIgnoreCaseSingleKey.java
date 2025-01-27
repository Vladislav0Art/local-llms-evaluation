package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedGetIgnoreCaseSingleKey {

    @Test
    public void getIgnoreCaseSingleKey() {
        Attributes attributes = new Attributes();
        assertEquals("KEY", attributes.getIgnoreCase("key"));
    }

}