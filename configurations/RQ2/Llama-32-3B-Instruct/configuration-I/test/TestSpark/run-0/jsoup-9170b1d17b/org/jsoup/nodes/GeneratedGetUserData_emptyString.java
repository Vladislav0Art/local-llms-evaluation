package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedGetUserData_emptyString {

    @Test
    public void getUserData_emptyString() {
        Attributes attributes = new Attributes();
        Object result = attributes.getUserData("");
        assertNull(result);
    }

}