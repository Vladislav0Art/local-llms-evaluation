package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedAddProperty_WithoutConflict_RaisesNoException {

    @Test
    public void addProperty_WithoutConflict_RaisesNoException() {
        Property<?> property = new Property<>("DataSource", "mysql");
        new PropertyListBuilder().add(property);
        assertFalse(new PropertyListBuilder().getRootEntries().containsValue(property));
    }

}