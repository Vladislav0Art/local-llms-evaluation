package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> mockProperty = Mockito.mock(Property.class);

        // When
        propertyListBuilder.add(mockProperty);
        List<Property<?>> results = propertyListBuilder.create();

        // Then
        Assert.assertEquals(1, results.size());
        Assert.assertSame(mockProperty, results.get(0));
    }

}