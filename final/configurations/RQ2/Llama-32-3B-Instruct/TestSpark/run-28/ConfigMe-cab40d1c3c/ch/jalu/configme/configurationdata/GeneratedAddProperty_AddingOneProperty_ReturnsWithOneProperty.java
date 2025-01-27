package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedAddProperty_AddingOneProperty_ReturnsWithOneProperty {

    @Test
    public void addProperty_AddingOneProperty_ReturnsWithOneProperty() {
        List<Property<?>> properties = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = Mockito.mock(Property.class);
        builder.addProperty(property);
        List<Property<?>> result = builder.create();
        assertTrue(result.size() > 0);
    }

}