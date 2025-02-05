package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.Test;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedAddValidPropertyTest {

    @Test
    public void addValidPropertyTest() {
        // Given
        PropertyListBuilder builder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);

        // When
        builder.add(mockProperty);

        // Then no exception should be thrown
    }

}