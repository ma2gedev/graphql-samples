defmodule GraphqlSampleWeb.Schema do
  use Absinthe.Schema
  import_types(GraphqlSampleWeb.Schema.Models)

  query do
    @desc "returns book list"
    field :books, non_null(list_of(:book)) do
      resolve(fn _, _ ->
        {:ok, [
          %{
            id: 1,
            title: "エムスリーテックブック#1",
            author: "エムスリーエンジニアリンググループ執筆部"
          }
        ]}
      end)
    end
  end
end
