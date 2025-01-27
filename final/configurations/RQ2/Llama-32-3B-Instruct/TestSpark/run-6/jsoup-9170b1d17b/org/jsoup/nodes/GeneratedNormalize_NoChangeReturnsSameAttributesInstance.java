package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNormalize_NoChangeReturnsSameAttributesInstance {

    @Test
    public void normalize_NoChangeReturnsSameAttributesInstance() {
        Attributes attributes = new Attributes();
        attributes.normalize();
        assertEquals(0, attributes.size());
    }

}