package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedPutUserDataAndGetUserDataSingleKey {

    @Test
    public void putUserDataAndGetUserDataSingleKey() {
        Attributes attributes = new Attributes();
        attributes.putUserData("key", "value");
        assertNull(attributes.getUserData("key"));
    }

}