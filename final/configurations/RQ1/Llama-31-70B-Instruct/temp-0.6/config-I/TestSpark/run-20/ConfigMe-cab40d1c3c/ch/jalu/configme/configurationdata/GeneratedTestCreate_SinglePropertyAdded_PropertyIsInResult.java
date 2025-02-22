package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestCreate_SinglePropertyAdded_PropertyIsInResult {

    @Test
    public void testCreate_SinglePropertyAdded_PropertyIsInResult() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> mockProperty = mock(Property.class);
        when(mockProperty.getPath()).thenReturn("path");
        propertyListBuilder.add(mockProperty);
        List<Property<?>> result = propertyListBuilder.create();
        assertEquals(1, result.size());
        assertEquals(mockProperty, result.get(0));
    }

}