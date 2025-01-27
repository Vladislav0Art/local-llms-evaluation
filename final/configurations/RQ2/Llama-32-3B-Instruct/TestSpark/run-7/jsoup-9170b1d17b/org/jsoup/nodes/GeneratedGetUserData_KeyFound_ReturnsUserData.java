package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

public class GeneratedGetUserData_KeyFound_ReturnsUserData {

    @Test
    public void getUserData_KeyFound_ReturnsUserData() {
        Attributes attrs = new Attributes();
        attrs.putUserData("test", "value");
        assertEquals("value", attrs.getUserData("test"));
    }

}