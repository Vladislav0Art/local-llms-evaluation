package ch.jalu.configme.configurationdata;

public class GeneratedAdd {

    private PropertyListBuilder underTest;

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

}