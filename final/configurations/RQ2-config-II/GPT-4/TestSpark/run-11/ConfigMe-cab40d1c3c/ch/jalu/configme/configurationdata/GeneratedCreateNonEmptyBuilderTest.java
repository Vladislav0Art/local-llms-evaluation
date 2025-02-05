package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.Test;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedCreateNonEmptyBuilderTest {

    @Test
    public void createNonEmptyBuilderTest() {
        // Given
        PropertyListBuilder builder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);

        // When
        builder.add(mockProperty);
        List<Property<?>> properties = builder.create();

        // Then
        Assert.assertFalse(properties.isEmpty());
        Assert.assertEquals(mockProperty, properties.get(0));
    }

}