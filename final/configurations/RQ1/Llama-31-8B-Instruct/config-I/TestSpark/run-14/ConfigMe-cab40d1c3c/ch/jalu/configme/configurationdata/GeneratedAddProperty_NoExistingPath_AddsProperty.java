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
public class GeneratedAddProperty_NoExistingPath_AddsProperty {

    @InjectMocks
    private PropertyListBuilder builder;

    @Test
    public void addProperty_NoExistingPath_AddsProperty() {
        Property<String> property = new Property<>("test", "value", "type");
        builder.add(property);
        assertEquals(1, builder.create().size());
    }

}