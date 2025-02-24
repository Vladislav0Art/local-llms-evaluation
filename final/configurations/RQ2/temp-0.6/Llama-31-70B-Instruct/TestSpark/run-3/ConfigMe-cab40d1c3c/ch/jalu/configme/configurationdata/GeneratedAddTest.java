package ch.jalu.configme.configurationdata;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import ch.jalu.configme.properties.Property;

public class GeneratedAddTest {

    @Test
    public void addTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = Mockito.mock(Property.class);
        propertyListBuilder.add(property);
        assertNotNull(propertyListBuilder.create());
    }

}