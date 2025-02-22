package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

public class GeneratedGivenProperty_whenAddWithSamePath_thenConfigMeExceptionThrown {

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Test
    public void givenProperty_whenAddWithSamePath_thenConfigMeExceptionThrown() {
        Property<Integer> property1 = new Property<>("test.property", 42);
        Property<Integer> property2 = new Property<>("test.property", 43);

        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);
    }

}