package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedAddValidPropertyTest {

    @Test
    public void addValidPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> mockProperty = Mockito.mock(Property.class);
        try {
            propertyListBuilder.add(mockProperty);
        } catch (ConfigMeException e) {
            fail("Exception should not be thrown when adding valid Property");
        }
    }

}