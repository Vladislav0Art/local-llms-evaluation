package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedAddProperty_validProperty_addsProperty {

    private final PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Test
    public void addProperty_validProperty_addsProperty() {
        Property<?> property = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("test.path");

        propertyListBuilder.add(property);

        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(1, properties.size());
        assertSame(property, properties.get(0));
    }

}