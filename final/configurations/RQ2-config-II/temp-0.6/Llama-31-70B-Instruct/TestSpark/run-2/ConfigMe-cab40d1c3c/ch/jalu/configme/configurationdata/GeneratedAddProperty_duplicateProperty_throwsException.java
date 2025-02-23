package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAddProperty_duplicateProperty_throwsException {

    @Test
    public void addProperty_duplicateProperty_throwsException() {
        Property<?> property = Mockito.mock(Property.class);
        when(property.getPath()).thenReturn("test");

        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

}