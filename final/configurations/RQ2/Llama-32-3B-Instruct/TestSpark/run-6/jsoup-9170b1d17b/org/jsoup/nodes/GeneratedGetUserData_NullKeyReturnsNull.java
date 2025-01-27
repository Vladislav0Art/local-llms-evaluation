package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetUserData_NullKeyReturnsNull {

    @Test
    public void getUserData_NullKeyReturnsNull() {
        Attributes attributes = new Attributes();
        assertNull(attributes.getUserData(null));
    }

}