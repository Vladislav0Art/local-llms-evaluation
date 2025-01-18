package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<Object> mockProperty = Mockito.mock(Property.class);

        builder.add(mockProperty);
        List<Property<?>> createdProperties = builder.create();

        assertTrue("Created properties should contain added property.", createdProperties.contains(mockProperty));
    }

}