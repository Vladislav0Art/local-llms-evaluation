package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedPutUserDataTest {

    @Test
    public void putUserDataTest() {
        Attributes attrs = new Attributes();
        attrs.putUserData("key", "value");
        Object value = attrs.getUserData("key");
        assertEquals("value", value);
    }

}