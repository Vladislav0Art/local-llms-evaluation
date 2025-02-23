package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAddProperty_uniqueProperty_success {

    @Test
    public void addProperty_uniqueProperty_success() {
        Property<?> property = Mockito.mock(Property.class);
        when(property.getPath()).thenReturn("test");

        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property);

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertEquals(1, rootEntries.size());
        assertEquals(property, rootEntries.get("test"));
    }

}