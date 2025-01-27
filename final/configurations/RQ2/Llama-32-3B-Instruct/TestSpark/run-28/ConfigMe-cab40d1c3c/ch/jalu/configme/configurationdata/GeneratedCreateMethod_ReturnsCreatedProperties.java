package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedCreateMethod_ReturnsCreatedProperties {

    @Test
    public void createMethod_ReturnsCreatedProperties() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property1 = Mockito.mock(Property.class);
        Property<?> property2 = Mockito.mock(Property.class);
        builder.addProperty(property1);
        builder.addProperty(property2);
        List<Property<?>> result = builder.create();
        assertEquals(2, result.size());
    }

}