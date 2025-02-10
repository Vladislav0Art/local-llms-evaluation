package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratedGetUserData_NullKey_ThrowsNullPointerException {

    @Test
    public void getUserData_NullKey_ThrowsNullPointerException() {
        NullPointerException expected = null;
        try {
            new Attributes().getUserData(null);
        } catch (NullPointerException e) {
            assertEquals(expected, e);
        }
    }

}