package com.example.graphqlkotlin

import com.example.graphqlkotlin.query.Query
import com.expedia.graphql.SchemaGeneratorConfig
import com.expedia.graphql.TopLevelNames
import com.expedia.graphql.TopLevelObject
import com.expedia.graphql.toSchema
import graphql.schema.GraphQLSchema
import graphql.schema.idl.SchemaPrinter
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class GraphqlKotlinApplication {

	@Bean
	fun schema(): GraphQLSchema {
		val schemaConfig = SchemaGeneratorConfig(
				supportedPackages = listOf("com.example.graphqlkotlin"),
				topLevelNames = TopLevelNames("Query")
		)
        val schema = toSchema(
				queries = listOf(TopLevelObject(Query())),
				config = schemaConfig
		)
        println(SchemaPrinter().print(schema))
		return schema
	}
}

fun main(args: Array<String>) {
	runApplication<GraphqlKotlinApplication>(*args)
}
