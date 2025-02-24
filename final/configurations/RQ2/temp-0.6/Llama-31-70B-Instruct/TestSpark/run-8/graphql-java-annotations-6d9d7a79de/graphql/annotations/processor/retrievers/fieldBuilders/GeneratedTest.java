package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GeneratedTest {

    @Test
    public void buildTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] graphQLDirectives = directivesBuilder.build();
        // Add assertions
    }

    @Test
    public void buildNoContainerTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, null);
        GraphQLDirective[] graphQLDirectives = directivesBuilder.build();
        // Add assertions
    }

    @Test
    public void buildNoObjectTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(null, container);
        GraphQLDirective[] graphQLDirectives = directivesBuilder.build();
        // Add assertions
    }

}