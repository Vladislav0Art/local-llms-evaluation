package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.mockito.Mockito.verify;

public class GeneratedTestAddMultipleProperties {

    @Test
    public void testAddMultipleProperties() throws ConfigMeException {
        // Arrange
        String rootKey = "root1";
        List<Property<?>> properties = new ArrayList<>();
        MockitoAnnotations.initMocks(this);

        // Act
        propertyListBuilder.add(Property.from(rootKey, "value1"));
        propertyListBuilder.add(Property.from(rootKey, "value2"));

        // Assert
        assertEquals(4, properties.size());
    }

}