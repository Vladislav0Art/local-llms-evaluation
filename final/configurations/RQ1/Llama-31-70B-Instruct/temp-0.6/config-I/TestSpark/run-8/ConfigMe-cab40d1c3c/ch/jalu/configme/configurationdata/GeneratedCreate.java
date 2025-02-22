package ch.jalu.configme.configurationdata;

public class GeneratedCreate {

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

}