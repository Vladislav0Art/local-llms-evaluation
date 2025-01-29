package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.mockito.Mockito.verify;

public class GeneratedTestAddProperty {

    @Test
    public void testAddProperty() throws ConfigMeException {
        // Arrange
        String rootKey = "root1";
        List<Property<?>> properties = new ArrayList<>();
        MockitoAnnotations.initMocks(this);

        // Act
        propertyListBuilder.add(Property.from(rootKey, "value1"));

        // Assert
        assertEquals(2, properties.size());
    }

}