package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedAddNullPropertyTest {

    @Test
    public void addNullPropertyTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // When
        propertyListBuilder.add(null);
    }

}