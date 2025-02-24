package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    @Test
    public void addTest() {
        // Arrange
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = mock(Property.class);

        // Act
        propertyListBuilder.add(property);

        // Assert
        // TODO: Make assertions here
    }

    @Test
    public void createTest() {
        // Arrange
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // Act
        List<Property<?>> result = propertyListBuilder.create();

        // Assert
        // TODO: Make assertions here
    }

    @Test
    public void getRootEntriesTest() {
        // Arrange
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // Act
        Map<String, Object> result = propertyListBuilder.getRootEntries();

        // Assert
        // TODO: Make assertions here
    }

}