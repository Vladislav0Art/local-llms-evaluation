package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class GeneratedIsBlankReturnsTrueWhenNull {

    @Test
    public void isBlankReturnsTrueWhenNull() {
        assertTrue(LeafNode.isBlank(""));
    }

}