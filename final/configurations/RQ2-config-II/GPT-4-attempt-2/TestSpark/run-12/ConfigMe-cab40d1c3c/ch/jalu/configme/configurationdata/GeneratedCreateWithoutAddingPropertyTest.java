package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedCreateWithoutAddingPropertyTest {

    @Test
    public void createWithoutAddingPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        List<Property<?>> properties = propertyListBuilder.create();
        assertNotNull(properties);
        assertTrue(properties.isEmpty());
    }

}