package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddIncorrectPathTest {

    @Test
    public void addIncorrectPathTest() {
        // Given
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<Boolean> property1 = new Property<>("keyA.keyB.PropertyOne",
                false);
        Property<String> property2 = new Property<>("keyA.keyB",
                "defaultValue");
        builder.add(property1);
        builder.add(property2); // this will throw exception
    }

}