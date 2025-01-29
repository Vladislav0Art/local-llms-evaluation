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

public class GeneratedTestBuildFieldBuilders_directive_value {

    private ProcessingElementsContainer container;
    public GraphQLDirectives directives;

    @Before
    public void setup() {
        AnnotatedElement object = new TestObjectAnnotation();
        container = new ProcessingElementsContainer();
        directives = new DirectivesBuilder(object, container);
    }

    @Test
    public void testBuildFieldBuilders_directive_value() {
        Assert.assertTrue(Arrays.asList(
                new GraphQLDirective[]{
                        GraphQLDirective.newBuilder(GraphQLArgument.builder().name("type").build()),
                        GraphQLDirective.newBuilder(GraphQLArgument.builder().name("value").build())
                }.containsAll(directives.buildFieldBuildersDirectives()))
        ).containsAll(directives.buildFieldBuildersDirectives()));
    }

    public GraphQLDirective buildFieldBuildersDirectives() {
        return new GraphQLDirectiveBuilder()
                .directive("type", Arrays.asList(GraphQLScalarType.STRING))
                .directive("value", Arrays.asList("value"))
                .build();
    }

    public void testBuildFieldBuildersDirectives2() {
        Assert.assertTrue(Arrays.asList(
                        GraphQLDirective.newBuilder(GraphQLArgument.builder().name("type").build()),
                        GraphQLDirective.newBuilder(GraphQLArgument.builder().name("value").build())
                ).containsAll(directives.buildFieldBuildersDirectives()))
                .containsAll(directives.buildFieldBuildersDirectives2()));
    }

    public void testBuildFieldBuildersDirectives3() {
        Assert.assertTrue(Arrays.asList(
                new GraphQLDirective[]{
                        GraphQLDirective.newBuilder(GraphQLArgument.builder().name("type").build()),
                        GraphQLDirective.newBuilder(GraphQLArgument.builder().name("value").build())
                }.containsAll(directives.buildFieldBuildersDirectives()))
        ).containsAll(directives.buildFieldBuildersDirectives2()));
    }

    public void testBuildFieldBuildersDirectives4() {
        Assert.assertTrue(Arrays.asList(
                new GraphQLDirective[]{
                        GraphQLDirective.newBuilder(GraphQLArgument.builder().name("type").build()),
                        GraphQLDirective.newBuilder(GraphQLArgument.builder().name("value").build())
                }.containsAll(directives.buildFieldBuildersDirectives()))
        ).containsAll(directives.buildFieldBuildersDirectives3()));
    }

    public void testBuildDirectives() {
        Assert.assertTrue(Arrays.asList(
                new GraphQLDirective[]{
                        GraphQLDirective.newBuilder(GraphQLDirectives.DIRECTIVE_NAME),
                        GraphQLDirective.newBuilder(GraphQLDirectives.DIRECTIVE_VALUE)
                }.containsAll(directives.buildDirectives()))
        ).containsAll(directives.buildFieldBuildersDirectives()));
    }

    public void testBuildDirectives2() {
        Assert.assertTrue(Arrays.asList(
                new GraphQLDirective[]{
                        GraphQLDirective.newBuilder(GraphQLDirectives.DIRECTIVE_NAME),
                        GraphQLDirective.newBuilder(GraphQLDirectives.DIRECTIVE_VALUE)
                }.containsAll(directives.buildDirectives()))
        ).containsAll(directives.buildFieldBuildersDirectives()));
    }

    public void testBuild() {
        Assert.assertTrue(Arrays.asList(
                new GraphQLDirective[]{
                        GraphQLDirective.newBuilder(GraphQLArgument.builder().name("type").build()),
                        GraphQLDirective.newBuilder(GraphQLArgument.builder().name("value").build())
                }.containsAll(directives.build()))
        ).containsAll(directives.build()));
    }

}