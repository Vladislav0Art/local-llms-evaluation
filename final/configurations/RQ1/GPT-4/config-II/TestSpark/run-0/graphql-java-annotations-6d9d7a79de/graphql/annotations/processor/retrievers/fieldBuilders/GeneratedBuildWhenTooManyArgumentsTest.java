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

public class GeneratedBuildWhenTooManyArgumentsTest {

    @Test
    public void buildWhenTooManyArgumentsTest() {
        Class<?> mockClass = Mockito.mock(Class.class);
        Annotation mockAnnotation = Mockito.mock(Annotation.class);
        Mockito.when(mockAnnotation.annotationType()).thenReturn((Class) mockClass);

        Mockito.when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(mockClass)).thenReturn(Collections.singletonList(mockAnnotation));
        Mockito.when(DirectiveJavaAnnotationUtil.getName(mockAnnotation)).thenReturn("name");

        Method[] mockMethods = new Method[2];
        Mockito.when(mockClass.getDeclaredMethods()).thenReturn(mockMethods);

        DirectiveRegistry directiveRegistry = new DirectiveRegistry();
        directiveRegistry.put("name", new GraphQLDirective("name", "description", Collections.singletonList(new GraphQLArgument("arg1", "argDesc", GraphQLScalarType.Int, null)), false));

        ProcessingElementsContainer container = new ProcessingElementsContainer();
        container.setDirectiveRegistry(directiveRegistry);

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(mockClass, container);
        GraphQLDirective[] result = directivesBuilder.build();

        assertEquals(1, result.length);
        assertEquals("name", result[0].getName());
    }

}