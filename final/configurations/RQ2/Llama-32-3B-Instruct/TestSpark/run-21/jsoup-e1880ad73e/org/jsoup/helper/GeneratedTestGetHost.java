package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

import org.mockito.Mockito;

public class GeneratedTestGetHost {

    @Test
    public void testGetHost() {
        Connection connection = Mockito.mock(Connection.class);
        Mockito.when(connection.getHost()).thenReturn("example.com");
        String host = connection.getHost();
        assertNotEquals(null, host);
    }

}