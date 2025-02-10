package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.List;

public class GeneratedBuildDirectivesBuilderWithInvalidDirectiveAnnotation_ThrowsException {

    @Test
    public void buildDirectivesBuilderWithInvalidDirectiveAnnotation_ThrowsException() {
        java.lang.reflect.Field field = new Field(); // invalid directive annotation
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(field, null);
        directivesBuilder.build();
    }

    private static class Field extends java.lang.reflect.Field {
    }

}