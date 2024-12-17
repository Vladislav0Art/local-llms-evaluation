package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;

import java.io.ByteArrayBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

public class GeneratedSplitTextOffsetGreaterThanLengthThrowException[]

Test {

    @Test
    public void splitTextOffsetGreaterThanLengthThrowException[] Test() {
        try {
            new TextNode("hello").splitText(10);
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            assertEquals("Split offset must not be greater than current text length", e.getMessage());
        }
    }

}