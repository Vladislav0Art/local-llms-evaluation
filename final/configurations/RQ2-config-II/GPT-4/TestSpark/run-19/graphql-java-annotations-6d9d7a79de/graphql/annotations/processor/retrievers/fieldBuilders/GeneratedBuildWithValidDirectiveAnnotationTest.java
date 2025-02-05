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

public class GeneratedBuildWithValidDirectiveAnnotationTest {

    @Test
    public void buildWithValidDirectiveAnnotationTest() {
        Method mockMethod = Mockito.mock(Method.class);
        when(mockMethod.getAnnotations()).thenReturn(new Annotation[]{new ValidAnnotation()});
        DirectivesBuilder builder = new DirectivesBuilder(mockMethod, null);
        GraphQLDirective[] result = builder.build();
        assertNotNull(result);
        assertEquals(1, result.length);
    }

}