package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;

import java.util.List;
import java.util.Map;

public class GeneratedAddNotNullPropertyTest {

    @Test
    public void addNotNullPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = mock(Property.class);

        try {
            propertyListBuilder.add(mockProperty);
            Assert.assertTrue(true); // No exception thrown
        } catch (ConfigMeException ex) {
            Assert.fail("Unexpected ConfigMeException was thrown");
        }
    }

}