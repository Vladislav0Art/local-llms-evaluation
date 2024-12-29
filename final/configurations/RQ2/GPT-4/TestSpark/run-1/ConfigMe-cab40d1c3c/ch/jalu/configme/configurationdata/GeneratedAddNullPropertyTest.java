package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.exception.ConfigMeException;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;

public class GeneratedAddNullPropertyTest {

    @Test
    public void addNullPropertyTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // When
        propertyListBuilder.add(null);

        // Then
        // Expect ConfigMeException due to the null input
    }

}