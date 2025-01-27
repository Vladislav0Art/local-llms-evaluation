package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;

public class GeneratedCloneDefault {

    @Test
    public void cloneDefault() {
        Tag original = new Tag();
        Tag copy = (Tag) original.clone();
        assertNotEquals(original, copy);
    }

}