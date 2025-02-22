package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.PropertyBuilder;
import ch.jalu.configme.properties.types.PrimitivePropertyType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddProperty_nullProperty_exceptionThrown {

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Test
    public void addProperty_nullProperty_exceptionThrown() {
        assertThrows(NullPointerException.class, () -> propertyListBuilder.add(null));
    }

}