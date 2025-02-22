package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.PropertyBuilder;
import ch.jalu.configme.properties.types.PrimitivePropertyType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreate_noPropertiesAdded_emptyList {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void initialize() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void create_noPropertiesAdded_emptyList() {
        assertEquals(0, propertyListBuilder.create().size());
    }

}