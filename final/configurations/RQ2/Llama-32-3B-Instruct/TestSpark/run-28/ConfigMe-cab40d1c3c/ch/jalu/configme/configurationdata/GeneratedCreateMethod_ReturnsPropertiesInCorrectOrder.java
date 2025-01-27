package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedCreateMethod_ReturnsPropertiesInCorrectOrder {

    @Test
    public void createMethod_ReturnsPropertiesInCorrectOrder() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property1 = Mockito.mock(Property.class);
        Property<?> property2 = Mockito.mock(Property.class);
        builder.addProperty(property1);
        builder.addProperty(property2);
        List<Property<?>> result = builder.create();
        assertEquals(Arrays.asList(property2, property1), result);
    }

}