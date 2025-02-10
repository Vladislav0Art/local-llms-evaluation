package ch.jalu.configme.configurationdata;

public class GeneratedCreateEmptyList {

    @Test
    public void createEmptyList() {
        // Arrange

        // Act
        List<Property<?>> list = new ArrayList<>();
        list.addAll(PropertyListBuilder.getInstance().create());

        // Assert
        assertEquals(0, list.size());
    }

}