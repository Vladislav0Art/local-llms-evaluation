package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.retrievers.fieldBuilders.Builder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        Class<?> mockClass = Mockito.mock(Class.class);
        Annotation mockAnnotation = Mockito.mock(Annotation.class);
        Mockito.when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(mockClass)).thenReturn(Collections.singletonList(mockAnnotation));

        DirectiveRegistry directiveRegistry = new DirectiveRegistry();
        directiveRegistry.put("name", new GraphQLDirective("name", "description", Collections.emptyList(), false));

        ProcessingElementsContainer container = new ProcessingElementsContainer();
        container.setDirectiveRegistry(directiveRegistry);

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(mockClass, container);
        GraphQLDirective[] result = directivesBuilder.build();

        assertEquals(1, result.length);
        assertEquals("name", result[0].getName());
    }

}