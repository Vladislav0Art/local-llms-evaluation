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
public class GeneratedAddProperty_MultipleProperties {

    @InjectMocks
    private PropertyListBuilder builder;

    @Test
    public void addProperty_MultipleProperties() {
        Property<?> property1 = new Property<>("test1");
        Property<?> property2 = new Property<>("test2");
        Property<?> property3 = new Property<>("test3");
        builder.add(property1);
        builder.add(property2);
        builder.add(property3);
        assertEquals(3, builder.create().size());
    }

}