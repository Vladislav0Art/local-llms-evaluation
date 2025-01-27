package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GeneratedIsSelfClosing_DoesNotThrowException {

    @Test
    public void isSelfClosing_DoesNotThrowException() {
        Tag tag = new Tag();
        assertFalse(tag.isSelfClosing());
    }

}