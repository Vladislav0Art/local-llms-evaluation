package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private PropertyListBuilder underTest;

    @Test
    public void create() {
        // Arrange
        Property<?> property = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("");
        underTest = new PropertyListBuilder();
        underTest.add(property);

        // Act
        List<Property<?>> result = underTest.create();

        // Assert
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(property, result.get(0));
    }

    @Test
    public void add() {
        // Arrange
        Property<?> property = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("");
        underTest = new PropertyListBuilder();
        underTest.add(property);

        // Act
        underTest.add(property);
    }

    @Test
    public void add_WithDuplicatePath() {
        // Arrange
        Property<?> property = Mockito.mock(Property.class);
        Property<?> property2 = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("");
        Mockito.when(property2.getPath()).thenReturn("");
        underTest = new PropertyListBuilder();

        // Act
        underTest.add(property);
        underTest.add(property2);
    }

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