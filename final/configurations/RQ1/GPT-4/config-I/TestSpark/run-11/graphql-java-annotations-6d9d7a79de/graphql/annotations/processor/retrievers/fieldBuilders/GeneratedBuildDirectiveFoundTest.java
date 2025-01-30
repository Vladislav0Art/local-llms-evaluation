package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static graphql.schema.GraphQLDirective.newDirective;

public class GeneratedBuildDirectiveFoundTest {

    @Test
    public void buildDirectiveFoundTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Annotation annotation = Mockito.mock(Annotation.class);
        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        String name = "DirectiveName";

        Mockito.when(container.getDirectiveRegistry()).thenReturn(Map.of(name, directive));
        Mockito.when(object.getDeclaredAnnotations()).thenReturn(new Annotation[]{annotation});
        Mockito.when(directive.getName()).thenReturn(name);

        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = builder.build();

        Assert.assertEquals(1, directives.length);
        Assert.assertEquals(name, directives[0].getName());
    }

}