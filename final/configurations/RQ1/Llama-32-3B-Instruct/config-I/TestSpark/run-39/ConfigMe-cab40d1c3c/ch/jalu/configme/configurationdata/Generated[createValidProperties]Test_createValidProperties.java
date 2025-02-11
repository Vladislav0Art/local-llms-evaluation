package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class Generated[createValidProperties]

Test_createValidProperties {

    @Mock
    private Map<String, Object> rootEntries;

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder(rootEntries);

    @Test
    public void [createValidProperties]Test_createValidProperties() {
        Property<?> property1 = new Property<>("test1", "value1");
        Property<?> property2 = new Property<>("test2", "value2");

        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);

        List<Property<?>> result = propertyListBuilder.create();
        assertEquals(2, result.size());
    }

}