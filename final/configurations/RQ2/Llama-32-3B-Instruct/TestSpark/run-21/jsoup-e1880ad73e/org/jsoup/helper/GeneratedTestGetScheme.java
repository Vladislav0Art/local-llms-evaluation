package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

import org.mockito.Mockito;

public class GeneratedTestGetScheme {

    @Test
    public void testGetScheme() {
        Connection connection = Mockito.mock(Connection.class);
        Mockito.when(connection.getScheme()).thenReturn("https");
        String scheme = connection.getScheme();
        assertNotEquals(null, scheme);
    }

}