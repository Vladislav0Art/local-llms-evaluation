package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCreateTest {

    @Test
    public void createTest() {
        // Given
        Property<?> mockPropertyA = Mockito.mock(Property.class);
        Mockito.when(mockPropertyA.getPath()).thenReturn("DataSource.mysql");
        Property<?> mockPropertyB = Mockito.mock(Property.class);
        Mockito.when(mockPropertyB.getPath()).thenReturn("security.firewall");
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // When
        propertyListBuilder.add(mockPropertyA);
        propertyListBuilder.add(mockPropertyB);

        // Then
        List<Property<?>> result = propertyListBuilder.create();
        assertTrue(result.size() > 0);
    }

}