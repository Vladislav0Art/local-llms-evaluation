package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedLastCharIsWhitespace_ReturnsTrueWhenLastCharacterIsWhitespace {

    @Test
    public void lastCharIsWhitespace_ReturnsTrueWhenLastCharacterIsWhitespace() {
        StringBuilder sb = new StringBuilder(" \t\n\r");
        assertTrue(StringUtil.lastCharIsWhitespace(sb));
    }

}