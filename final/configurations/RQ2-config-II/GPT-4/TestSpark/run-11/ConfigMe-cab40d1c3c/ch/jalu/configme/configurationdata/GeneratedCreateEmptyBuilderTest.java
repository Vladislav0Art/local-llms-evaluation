package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.Test;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedCreateEmptyBuilderTest {

    @Test
    public void createEmptyBuilderTest() {
        // Given
        PropertyListBuilder builder = new PropertyListBuilder();

        // When
        List<Property<?>> properties = builder.create();

        // Then
        Assert.assertTrue(properties.isEmpty());
    }

}