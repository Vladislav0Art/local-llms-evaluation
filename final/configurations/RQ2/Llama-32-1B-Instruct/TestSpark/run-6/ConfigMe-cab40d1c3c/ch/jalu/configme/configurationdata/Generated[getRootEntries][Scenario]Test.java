package ch.jalu.configme.configurationdata;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generated[getRootEntries][Scenario]

Test {

    private Map<String, Object> rootEntries = new HashMap<>();

    public void addProperty (Property < ? > property){
        rootEntries.put(property.getKey(), property.getValue());
    }

    public @NotNull List<Property<?>> create () {
        return new ArrayList<>(rootEntries);
    }

    protected final @NotNull Map<String, Object> getRootEntries () {
        return rootEntries;
    }
}

public class PropertyListBuilderTest {

    @Test
    public void [getRootEntries][Scenario]

    Test() {
        // Arrange
        String[] key1 = {"key1", "value1"};
        String[] key2 = {"key2", "value2"};

        // Act and Assert
        Map<String, Object> map = new HashMap<>();
        map.put(key1[0], "value1");
        map.put(key1[1], "value1");
        map.put(key2[0], "value2");

        PropertyListBuilder builder = new PropertyListBuilder();
        @NotNull List<Property<?>> result = builder.getRootEntries();

        // Verify
        Mockito.verify(builder, Mockito.times(1)).getRootEntries(Mockito.any(Map.class));
    }

}