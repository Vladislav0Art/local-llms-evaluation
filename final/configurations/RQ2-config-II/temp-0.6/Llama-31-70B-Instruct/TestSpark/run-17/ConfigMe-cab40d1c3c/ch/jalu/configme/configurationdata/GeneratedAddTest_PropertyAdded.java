package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddTest_PropertyAdded {

    @Test
    public void addTest_PropertyAdded() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property = Mockito.mock(Property.class);
        propertyListBuilder.add(property);
    }

}