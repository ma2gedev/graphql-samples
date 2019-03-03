package com.example.graphqljavatools.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.example.graphqljavatools.model.Book
import org.springframework.stereotype.Component

@Component
class Query : GraphQLQueryResolver {
    fun books() = listOf(
            Book(
                    1,
                    "エムスリーテックブック#1",
                    "エムスリーエンジニアリンググループ執筆部"
            )
    )
}
