package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.StringProperty;
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
public class GeneratedCreate_AddedProperties_ReturnsAddedProperties {

    @InjectMocks
    private PropertyListBuilder builder;

    @Test
    public void create_AddedProperties_ReturnsAddedProperties() {
        StringProperty property1 = new StringProperty("test1", "value1");
        StringProperty property2 = new StringProperty("test2", "value2");
        builder.add(property1);
        builder.add(property2);
        assertEquals(2, builder.create().size());
    }

}