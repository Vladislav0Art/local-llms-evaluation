package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAddTest_NullProperty {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void AddTest_NullProperty() {
        propertyListBuilder = new PropertyListBuilder();

        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(null));
    }

}