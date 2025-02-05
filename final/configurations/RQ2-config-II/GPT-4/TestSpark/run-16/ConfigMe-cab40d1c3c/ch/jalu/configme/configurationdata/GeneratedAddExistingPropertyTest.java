package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedAddExistingPropertyTest {

    @Test
    public void addExistingPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.add");
        builder.add(mockProperty);

        try {
            builder.add(mockProperty);
            fail("Expected an ConfigMeException to be thrown");
        } catch (ConfigMeException e) {
            assertEquals("Property 'test.add' has already been added", e.getMessage());
        }
    }

}