package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLType;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuildNoDirectivesTest {

    @Test
    public void buildNoDirectivesTest() {
        DirectivesBuilder builder = new DirectivesBuilder(mock(Method.class), null);
        GraphQLDirective[] result = builder.build();
        assertNotNull(result);
        assertEquals(0, result.length);
    }

}