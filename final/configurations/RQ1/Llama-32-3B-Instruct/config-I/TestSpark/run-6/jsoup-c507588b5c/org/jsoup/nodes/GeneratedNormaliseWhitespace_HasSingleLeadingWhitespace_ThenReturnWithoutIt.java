package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedNormaliseWhitespace_HasSingleLeadingWhitespace_ThenReturnWithoutIt {

    @Test
    public void normaliseWhitespace_HasSingleLeadingWhitespace_ThenReturnWithoutIt() {
        String result = StringUtil.normaliseWhitespace(" ");
        assertEquals(" ", result);
    }

}