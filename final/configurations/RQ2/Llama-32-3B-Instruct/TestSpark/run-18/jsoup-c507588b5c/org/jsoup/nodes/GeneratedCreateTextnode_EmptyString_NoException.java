package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

public class GeneratedCreateTextnode_EmptyString_NoException {

    @Test
    public void createTextnode_EmptyString_NoException() {
        try {
            new TextNode("");
        } catch (NullPointerException e) {
            fail("Expected no exception");
        }
    }

}