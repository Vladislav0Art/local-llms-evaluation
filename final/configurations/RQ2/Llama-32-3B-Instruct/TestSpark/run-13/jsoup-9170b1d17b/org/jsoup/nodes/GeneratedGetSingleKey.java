package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedGetSingleKey {

    @Test
    public void getSingleKey() {
        Attributes attributes = new Attributes();
        assertEquals("key", attributes.get("key"));
    }

}