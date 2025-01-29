package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedCreatePropertyCreatesProperty {

    @BeforeEach
    public void setup() {
        this.propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void createPropertyCreatesProperty() {
        List<Property<?>> properties = propertyListBuilder.create();
        assertNotNull(properties);
    }

}