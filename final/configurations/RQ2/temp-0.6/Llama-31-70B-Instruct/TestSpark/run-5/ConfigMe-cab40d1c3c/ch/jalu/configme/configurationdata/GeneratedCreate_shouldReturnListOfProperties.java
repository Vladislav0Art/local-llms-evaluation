package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreate_shouldReturnListOfProperties {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void create_shouldReturnListOfProperties() {
        propertyListBuilder = new PropertyListBuilder();
        Property<?> property = Mockito.mock(Property.class);
        propertyListBuilder.add(property);
        List<Property<?>> propertyList = propertyListBuilder.create();
        assertNotNull(propertyList);
        assertEquals(1, propertyList.size());
    }

}