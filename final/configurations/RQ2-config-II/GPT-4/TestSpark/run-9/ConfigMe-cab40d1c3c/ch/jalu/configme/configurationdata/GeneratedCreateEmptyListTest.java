package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedCreateEmptyListTest {

    @Test
    public void createEmptyListTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // When
        List<Property<?>> results = propertyListBuilder.create();

        // Then
        Assert.assertTrue(results.isEmpty());
    }

}