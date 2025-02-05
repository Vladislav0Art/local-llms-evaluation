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

public class GeneratedBuildWithInvalidDirectiveAnnotationTest {

    @Test
    public void buildWithInvalidDirectiveAnnotationTest() {
        Method mockMethod = Mockito.mock(Method.class);
        when(mockMethod.getAnnotations()).thenReturn(new Annotation[]{new InvalidAnnotation()});
        DirectivesBuilder builder = new DirectivesBuilder(mockMethod, null);
        builder.build();
    }

}