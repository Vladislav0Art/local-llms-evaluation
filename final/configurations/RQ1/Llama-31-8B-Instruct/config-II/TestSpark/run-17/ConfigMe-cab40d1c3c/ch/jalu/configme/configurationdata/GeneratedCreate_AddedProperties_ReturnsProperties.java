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
public class GeneratedCreate_AddedProperties_ReturnsProperties {

    @InjectMocks
    private PropertyListBuilder builder;

    @Test
    public void create_AddedProperties_ReturnsProperties() {
        Property<String> property1 = new Property<>("test1", "value1");
        Property<String> property2 = new Property<>("test2", "value2");
        builder.add(property1);
        builder.add(property2);
        List<Property<?>> result = builder.create();
        assertEquals(2, result.size());
        assertEquals(property1, result.get(0));
        assertEquals(property2, result.get(1));
    }

}