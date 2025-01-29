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

public class GeneratedTestBuildFieldBuilders_directive_name {

    private ProcessingElementsContainer container;
    public GraphQLDirectives directives;

    @Before
    public void setup() {
        AnnotatedElement object = new TestObjectAnnotation();
        container = new ProcessingElementsContainer();
        directives = new DirectivesBuilder(object, container);
    }

    @Test
    public void testBuildFieldBuilders_directive_name() {
        Assert.assertTrue(Arrays.asList(
                new GraphQLDirective[]{
                        GraphQLDirective.newBuilder(GraphQLArgument.builder().name("type").type(GraphQLScalarType.STRING).build()),
                        GraphQLDirective.newBuilder(GraphQLArgument.builder().name("value").type(GraphQLScalarType.STRING).build())
                }.containsAll(directives.buildFieldBuildersDirectives()))
        ).containsAll(directives.buildFieldBuildersDirectives()));
    }

}