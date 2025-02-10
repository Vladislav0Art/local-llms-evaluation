package ch.jalu.configme.configurationdata;

public class GeneratedAddNotNullProperty {

    @Test
    public void addNotNullProperty() {
        // Arrange
        Property<?> property = new Property<>();
        List<Property<?>> list = new ArrayList<>();

        // Act
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property);
        list.addAll(builder.create());

        // Assert
        assertTrue(list.contains(property));
    }

}