package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddProperty_MultipleProperties_AddsProperties {

    @InjectMocks
    private PropertyListBuilder builder;

    @Test
    public void addProperty_MultipleProperties_AddsProperties() {
        Property<String> property1 = new Property<>("test1", "value1");
        Property<String> property2 = new Property<>("test2", "value2");
        builder.add(property1);
        builder.add(property2);
        assertEquals(2, builder.getRootEntries().size());
    }

}