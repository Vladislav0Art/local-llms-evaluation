package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAddProperty_pathAlreadyExists_throwsException {

    @Test
    public void addProperty_pathAlreadyExists_throwsException() {
        Property<?> property1 = Mockito.mock(Property.class);
        when(property1.getPath()).thenReturn("test");
        Property<?> property2 = Mockito.mock(Property.class);
        when(property2.getPath()).thenReturn("test");

        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);
    }

}