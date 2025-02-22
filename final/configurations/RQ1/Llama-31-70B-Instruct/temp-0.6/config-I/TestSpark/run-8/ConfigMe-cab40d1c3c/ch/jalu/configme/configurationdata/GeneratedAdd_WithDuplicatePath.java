package ch.jalu.configme.configurationdata;

public class GeneratedAdd_WithDuplicatePath {

    private PropertyListBuilder underTest;

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

}