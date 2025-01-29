package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestGetUserDataByKey {

    @Test
    public void testGetUserDataByKey() {
        Attributes attributes = new Attributes();
        Object userData = "user data";
        when(attributes.getUserData("key")).thenReturn(userData);
        assertEquals(userData, attributes.getUserData("key"));
    }

}