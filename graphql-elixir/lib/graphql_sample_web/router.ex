defmodule GraphqlSampleWeb.Router do
  use GraphqlSampleWeb, :router

  pipeline :api do
    plug :accepts, ["json"]
  end

  scope "/api", GraphqlSampleWeb do
    pipe_through :api
  end

  forward "/graphiql", Absinthe.Plug.GraphiQL, schema: GraphqlSampleWeb.Schema, interface: :simple
  forward "/", Absinthe.Plug, schema: GraphqlSampleWeb.Schema
end
