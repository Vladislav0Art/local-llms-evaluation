package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreate_AddedProperties_ReturnsProperties {

    @InjectMocks
    private PropertyListBuilder builder;

    @Test
    public void create_AddedProperties_ReturnsProperties() {
        Property<String> property1 = mock(Property.class);
        when(property1.getPath()).thenReturn("DataSource.mysql.host");
        builder.add(property1);
        Property<String> property2 = mock(Property.class);
        when(property2.getPath()).thenReturn("security.password");
        builder.add(property2);
        assertEquals(2, builder.create().size());
    }

}