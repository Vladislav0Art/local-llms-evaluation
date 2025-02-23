package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddPropertyTest {

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Test
    public void addPropertyTest() {
        Property property = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("DataSource.mysql");

        propertyListBuilder.add(property);

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertNotNull(rootEntries.get("DataSource"));
        assertTrue(rootEntries.get("DataSource") instanceof Map);
        Map<String, Object> dataSourceMap = (Map<String, Object>) rootEntries.get("DataSource");
        assertEquals(property, dataSourceMap.get("mysql"));
    }

}