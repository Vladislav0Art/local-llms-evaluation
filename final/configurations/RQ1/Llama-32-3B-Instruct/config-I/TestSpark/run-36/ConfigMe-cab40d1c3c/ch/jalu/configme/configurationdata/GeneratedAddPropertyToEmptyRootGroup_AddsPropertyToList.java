package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedAddPropertyToEmptyRootGroup_AddsPropertyToList {

    @Test
    public void addPropertyToEmptyRootGroup_AddsPropertyToList() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = builder.create();
        assertFalse(properties.isEmpty());
    }

}