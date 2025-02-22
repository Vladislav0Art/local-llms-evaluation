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

public class GeneratedTestAdd_PropertyAlreadyExists_ThrowsException {

    @Test
    public void testAdd_PropertyAlreadyExists_ThrowsException() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> mockProperty = mock(Property.class);
        when(mockProperty.getPath()).thenReturn("path");
        propertyListBuilder.add(mockProperty);
        propertyListBuilder.add(mockProperty);
    }

}