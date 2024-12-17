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

public class GeneratedNewNodeTextIsBlankWhenEmpty[]

Test {

    @Test
    public void newNodeTextIsBlankWhenEmpty[] Test() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}