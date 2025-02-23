package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddTest {

    @Test
    public void addTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property property = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("DataSource.mysql");
        propertyListBuilder.add(property);
        assertEquals(propertyListBuilder.getRootEntries().get("DataSource").get("mysql"), property);
    }

}