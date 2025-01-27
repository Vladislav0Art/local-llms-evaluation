package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedClone_NullText_ReturnsNull {

    @Test
    public void clone_NullText_ReturnsNull() {
        assertNull(new TextNode(null).clone());
    }

}