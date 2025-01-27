package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedPutBooleanValueSingleKey {

    @Test
    public void putBooleanValueSingleKey() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        assertTrue(attributes.get("key").equals(Boolean.TRUE.toString()));
    }

}