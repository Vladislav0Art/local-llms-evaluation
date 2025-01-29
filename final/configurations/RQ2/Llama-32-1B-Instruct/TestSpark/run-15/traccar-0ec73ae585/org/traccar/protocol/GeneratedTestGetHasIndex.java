package org.traccar.protocol;

public class GeneratedTestGetHasIndex {

    private static final Pattern pattern = Pattern.compile("^[0-9]+");

    @Test
    public void testGetHasIndex() throws Exception {
        // Given
        String message = "123";

        // When
        Object result = WatchProtocolDecoder.getHasIndex(message);

        // Then
        assertEquals(true, result instanceof Boolean);
        assertTrue((Boolean) result);
    }

}