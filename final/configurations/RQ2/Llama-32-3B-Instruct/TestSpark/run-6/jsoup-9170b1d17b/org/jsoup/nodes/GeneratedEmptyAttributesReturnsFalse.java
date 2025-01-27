package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedEmptyAttributesReturnsFalse {

    @Test
    public void emptyAttributesReturnsFalse() {
        Attributes attributes = new Attributes();
        assertFalse(attributes.hasKey(""));
    }

}