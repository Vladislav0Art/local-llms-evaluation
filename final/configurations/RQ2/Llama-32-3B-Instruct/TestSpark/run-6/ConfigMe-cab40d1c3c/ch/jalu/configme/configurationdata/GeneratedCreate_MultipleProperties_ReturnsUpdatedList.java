package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreate_MultipleProperties_ReturnsUpdatedList {

    @Mock
    private List<Property<?>> properties;

    @Test
    public void create_MultipleProperties_ReturnsUpdatedList() {
        List<Property<?>> expectedProperties = new ArrayList<>();
        expectedProperties.add(new Property<String>("key1", "value1"));
        expectedProperties.add(new Property<String>("key2", "value2"));

        new PropertyListBuilder()
                .add(expectedProperties.get(0))
                .add(expectedProperties.get(1))
                .create()
                .forEach(property -> assertEquals("key1", property.getKey()));
    }

}