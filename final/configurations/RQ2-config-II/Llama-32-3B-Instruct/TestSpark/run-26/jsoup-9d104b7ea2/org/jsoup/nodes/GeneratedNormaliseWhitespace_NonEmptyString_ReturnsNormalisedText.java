package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedNormaliseWhitespace_NonEmptyString_ReturnsNormalisedText {

    @Test
    public void normaliseWhitespace_NonEmptyString_ReturnsNormalisedText() {
        assertEquals(" test ", StringUtil.normaliseWhitespace(" test "));
    }

}