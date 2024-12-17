package org.jsoup.helper;

import org.junit.Test;

public class GeneratedTestMockConnection {

    @Test
    public void testMockConnection() throws Exception {
        // Create mock connection
        MockConnection mockConn = new MockConnection();

        // Call mock conn's methods
        assertTrue(mockConn.connect());
        assertTrue(mockConn.connect());
        assertTrue(mockConn.disconnect());

        // Close mock connection
        mockConn.close();

        // Check if disconnect was called
        Thread.sleep(1000);
        assertTrue(mockConn.disconnect().equals(Exception.class));
    }
}

class MockConnection {
    public boolean connect() throws Exception {
        return true;
    }

    @Override
    public void disconnect() throws Exception {
        throw new Exception("Mock IOException");
    }
}

}