package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

    private static final Pattern pattern = Pattern.compile("^[0-9]+");

    @Test
    public void testGetManufacturer() throws Exception {
        // Given
        String message = "ABCDEF";

        // When
        Object result = WatchProtocolDecoder.getManufacturer(message);

        // Then
        assertNotNull(result);
        assertEquals("ABCDEF", result.toString());
    }

}