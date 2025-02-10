package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

public class GeneratedBuildDirectivesBuilderWithFieldWithoutDirectivesAndArgs_ReturnsEmptyArray {

    @Test
    public void buildDirectivesBuilderWithFieldWithoutDirectivesAndArgs_ReturnsEmptyArray() {
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(DirectivesBuilder.java.lang.reflect.Method.class, null);
        Object[] result = directivesBuilder.build();
        assertTrue(result.length == 0);
    }

}