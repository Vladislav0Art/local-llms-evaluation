package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

public class GeneratedCreateTextnode_NullString_ThrowsNPE {

    @Test
    public void createTextnode_NullString_ThrowsNPE() {
        assertThrows(NullPointerException.class, () -> new TextNode(null));
    }

}