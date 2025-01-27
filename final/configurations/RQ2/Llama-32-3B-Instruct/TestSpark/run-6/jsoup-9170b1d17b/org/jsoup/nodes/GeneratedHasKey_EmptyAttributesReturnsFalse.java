package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedHasKey_EmptyAttributesReturnsFalse {

    @Test
    public void hasKey_EmptyAttributesReturnsFalse() {
        Attributes attributes = new Attributes();
        assertFalse(attributes.hasKey(""));
    }

}