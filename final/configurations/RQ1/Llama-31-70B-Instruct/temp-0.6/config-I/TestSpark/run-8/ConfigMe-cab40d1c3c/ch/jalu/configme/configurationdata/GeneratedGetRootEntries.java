package ch.jalu.configme.configurationdata;

public class GeneratedGetRootEntries {

    private PropertyListBuilder underTest;

    @Test
    public void getRootEntries() {
        // Arrange
        underTest = new PropertyListBuilder();

        // Act
        Map<String, Object> result = underTest.getRootEntries();

        // Assert
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

}