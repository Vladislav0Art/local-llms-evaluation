package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.PropertyBuilder;
import ch.jalu.configme.properties.types.PrimitivePropertyType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetRootEntries_noPropertiesAdded_emptyMap {

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Test
    public void getRootEntries_noPropertiesAdded_emptyMap() {
        assertEquals(0, propertyListBuilder.getRootEntries().size());
    }

}