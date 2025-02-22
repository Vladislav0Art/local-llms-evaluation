package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import ch.jalu.configme.properties.Property;

import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTestAdd {

    private PropertyListBuilder propertyListBuilder;

    @BeforeEach
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @AfterEach
    public void tearDown() {
        propertyListBuilder = null;
    }

    @Test
    public void testAdd() {
        Property property = mock(Property.class);
        when(property.getPath()).thenReturn("DataSource.mysql");
        propertyListBuilder.add(property);
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertEquals(1, rootEntries.size());
        Map<String, Object> dataSource = (Map<String, Object>) rootEntries.get("DataSource");
        assertEquals(1, dataSource.size());
        assertEquals(property, dataSource.get("mysql"));
    }

}