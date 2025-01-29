package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratedTestBuild_directives {

    private ProcessingElementsContainer container;
    public GraphQLDirectives directives;

    @Before
    public void setup() {
        AnnotatedElement object = new TestObjectAnnotation();
        container = new ProcessingElementsContainer();
        directives = new DirectivesBuilder(object, container);
    }

    @Test
    public void testBuild_directives() {
        Assert.assertTrue(Arrays.asList(
                new GraphQLDirective[]{
                        GraphQLDirective.newBuilder(GraphQLDirectives.DIRECTIVE_NAME),
                        GraphQLDirective.newBuilder(GraphQLDirectives.DIRECTIVE_VALUE)
                }
        ).containsAll(directives.buildDirectives()));
    }

}