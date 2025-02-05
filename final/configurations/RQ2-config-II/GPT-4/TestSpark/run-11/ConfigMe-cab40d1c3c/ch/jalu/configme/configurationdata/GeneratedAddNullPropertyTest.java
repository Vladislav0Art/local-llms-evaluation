package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.Test;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedAddNullPropertyTest {

    @Test
    public void addNullPropertyTest() {
        // Given
        PropertyListBuilder builder = new PropertyListBuilder();

        // When
        builder.add(null);

        // Then ConfigMeException should be thrown
    }

}