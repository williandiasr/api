# Sthephany e Willian

URL DA DOCUMENTAÇÃO 

https://developers.themoviedb.org/3/getting-started/introduction 


URL DE ACESSO A API 

Para utilizar a API é necessário ter uma chave de autenticação, para isso, precisa-se criar um cadastro no seguinte link Invalid Permissions — The Movie Database (TMDB) (themoviedb.org). 


MÉTODOS E DADOS DE AUTENTICAÇÃO 

Para conseguir obter acesso a cada método, é necessário a chave de autenticação solicitada. 

 
MÉTODOS DISPONÍVEIS 

CONTA 

GET 

Get Detail 

Obtenha os detalhes da sua conta. 

GET 

Get Created List 

Obtenha todas as listas criadas por uma conta. Irá incluir listas privadas se você é o proprietário. 

GET 

Get Favorite Movies 

Obtenha a lista de seus filmes favoritos. 

GET 

Get Favorite TV Shows 

Obtenha a lista de seus programas de TV favoritos. 

POST 

Mark as Favorite 

Esse método permite que você marque um filme ou programa de TV como um item favorito. 

GET 

Get Rated Movies 

Obtenha uma lista de todos os filmes que você classificou. 

GET 

Get Rated TV Shows 

Obtenha uma lista de todos os programas de TV que você classificou. 

GET 

Get Rated TV Episodes 

Obtenha uma lista de todos os episódios de TV que você classificou. 

GET 

Get Movies Watchlist 

Obtenha uma lista de todos os filmes que você adicionou à sua lista de observação. 

GET 

Get TV Show Watchlist 

Obtenha uma lista de todos os programas de TV que você adicionou à sua lista de observação. 

POST 

Add to Watchlist 

Adicione um filme ou programa de TV à sua lista de observação. 

 

AUTENTICAÇÃO 

GET 

Create Guest Session 

Esse método permitirá que você crie uma nova sessão de convidado. As sessões de convidado são um tipo de sessão que permitirá que um usuário classifique filmes e programas de TV, mas não exija que eles tenham uma conta de usuário do TMDB. 

GET 

Create Request Token 

Crie um token de solicitação temporário que possa ser usado para validar um logon de usuário do TMDB. 

POST 

Create Session 

Você pode usar esse método para criar uma ID de sessão totalmente válida depois que um usuário tiver validado o token de solicitação. 

POST 

Create Session With Login 

Esse método permite que um aplicativo valide um token de solicitação inserindo um nome de usuário e senha. 

POST 

Create Session (from v4 access token) 

Use esse método para criar uma ID de sessão v3 se você já tiver um token de acesso v4 válido. O token v4 precisa ser autenticado pelo usuário. Seu "token de leitura" padrão não será validado para criar um ID de sessão. 

DELET 

Delete Session 

Se você quiser excluir (ou "logout") de uma sessão, chame esse método com uma ID de sessão válida. 

 

CERTIFICAÇÃO 

GET 

Get Movie Certifications 

Obtenha uma lista atualizada das certificações de filmes oficialmente suportadas no TMDB. 

GET 

Get TV Certifications 

Obtenha uma lista atualizada das certificações de programas de TV oficialmente suportadas no TMDB. 

 

MODIFICAÇÃO 

GET 

Get Movie Change List 

Obtenha uma lista de todos os IDs de filmes que foram alterados nas últimas 24 horas. 

GET 

Get TV Change List 

Obtenha uma lista de todos os IDs de programas de TV que foram alterados nas últimas 24 horas. 

GET 

Get Perso Change List 

Obtenha uma lista de todos os IDs de pessoas que foram alterados nas últimas 24 horas. 

 

COLEÇÃO 

GET 

Get Details 

Obtenha detalhes da coleção por ID. 

GET 

Get Images 

Obtenha as imagens de uma coleção por ID. 

GET 

Get Translations 

Obtenha as traduções de lista para uma coleção por ID. 

 

COMPANHIAS 

GET 

Get Details 

Obtenha os detalhes de uma empresa por ID. 

GET 

Get Alternative Names 

Obtenha os nomes alternativos de uma empresa. 

GET 

Get Images 

Obtenha logotipos de uma empresa por ID. 

 

CONFIGURAÇÕES 

GET 

Get API Configuration 

Obtenha as informações de configuração de todo o sistema. 

GET 

Get  Countries 

Obtenha a lista de países (tags ISO 3166-1) usados em todo o TMDB. 

GET 

Get Jobs 

Obtenha uma lista dos trabalhos e departamentos que usamos no TMDB. 

GET 

Get Languages 

Obtenha a lista de idiomas (tags ISO 639-1) usados em todo o TMDB. 

GET 

Get Primary Translations 

Obtenha uma lista das traduções oficialmente suportadas no TMDB. 

GET 

Get Timezones 

Obtenha a lista de fusos horários usados em todo o TMDB. 

 

CRÉDITOS 

GET 

Get Details 

Obtenha detalhes de crédito de um filme ou TV por ID. 

 

DESCOBRIR 

GET 

Movie Discover 

Descubra filmes por diferentes tipos de dados, como classificação média, número de votos, gêneros e certificações. 

GET 

TV Discover 

Descubra programas de TV por diferentes tipos de dados, como classificação média, número de votos, gêneros, a rede em que foram ao ar e datas de exibição. 

 

ENCONTRAR 

GET 

Find by ID 

Pesquisa de objetos por um ID externo. 

 

GÊNERO 

GET 

Get Movie List 

Obtenha a lista de gêneros oficiais para filmes. 

GET 

Get TV List 

Obtenha a lista de gêneros oficiais para programas de TV. 

 

SESSÕES DE CONVIDADOS 

GET 

Get Rated Movie 

Obtenha os filmes classificados para uma sessão de convidados. 

GET 

Get Rated TV Show 

Obtenha os programas de TV classificados para uma sessão de convidados. 

GET 

Get Rated TV Episodes 

Obtenha os episódios de TV classificados para uma sessão de convidados. 

 

KEYWORDS 

GET 

Get Details 

Não possui especificação 

GET 

Get Movies 

Obtenha os filmes que pertencem a uma palavra-chave. 

É altamente recomendável usar o filme descobrir em vez deste método, pois é muito mais flexível. 

 

LISTAS 

GET 

Get Details 

Obtenha os detalhes de uma lista. 

GET 

Check Item Status 

Você pode usar esse método para verificar se um filme já foi adicionado à lista. 

POST 

Create List 

Crie uma lista. 

POST 

Add Movies 

Adicionar um filme a uma lista. 

POST 

Remove Movies 

Remover um filme de uma lista. 

POST 

Clear List 

Limpe todos os itens de uma lista. 

DELETE 

Delete List 

Excluir uma lista. 

 

FILMES 

GET 

Get Details 

Obtenha as informações principais sobre um filme. 

GET 

Get Account States 

Pegue os seguintes estados de conta para uma sessão: 

Classificação do filme 

Se pertencer à sua lista de observação 

Se pertencer à sua lista de favoritos. 

GET 

Get Alternative Titles 

Obtenha todos os títulos alternativos para um filme. 

GET 

Get Changes 

Obtenha as alterações de um filme. Por padrão, apenas as últimas 24 horas são retornadas. 

GET 

Get Credits 

Pegue o elenco e a equipe para um filme. 

GET 

Get External IDs 

Obtenha as IDs externas de um filme. Atualmente, oferecemos suporte às seguintes fontes externas. 

GET 

Get Images 

Obtenha as imagens que pertencem a um filme. 

GET 

Get Keywords 

Obtenha as palavras-chave que foram adicionadas a um filme. 

GET 

Get Lists 

Obtenha uma lista de listas às quais este filme pertence. 

GET 

Get Recommendations 

Obtenha uma lista de filmes recomendados para um filme. 

GET 

Get Release Dates 

Obtenha a data de lançamento juntamente com a certificação de um filme. 

As datas de lançamento suportam diferentes tipos: estreia, teatral (limitado), teatral, digital, físico, TV. 

GET 

Get Reviews 

Obtenha as resenhas de usuários de um filme. 

GET 

Get Similar Movies 

Obtenha uma lista de filmes semelhantes. Isso não é o mesmo que o sistema de "Recomendação" que você vê no site. 

Esses itens são montados observando palavras-chave e gêneros. 

GET 

Get Translations 

Obtenha uma lista de traduções que foram criadas para um filme. 

GET 

Get Videos 

Obtenha os vídeos que foram adicionados a um filme. 

GET 

Get Watch Providers 

Você pode consultar esse método para obter uma lista das disponibilidades por país por provedor. 

POST 

Rate Movies 

Classifique um filme. 

É necessária uma sessão válida ou um ID de sessão de convidado. 

DELETE 

Delete Rating 

Remova a classificação de um filme. 

É necessária uma sessão válida ou um ID de sessão de convidado. 

GET 

Get Latest 

Obtenha o filme mais recém-criado. Esta é uma resposta ao vivo e mudará continuamente. 

GET 

Get Now Playing 

Obtenha uma lista de filmes nos cinemas. Esta é uma consulta de tipo de versão que procura todos os filmes que têm um tipo de lançamento de 2 ou 3 dentro do intervalo de datas especificado. 

GET 

Get Popular 

Obtenha uma lista dos filmes populares atuais no TMDB. Esta lista é atualizada diariamente. 

GET 

Get Top Rated 

Obtenha os filmes mais bem classificados no TMDB. 

GET 

Get Upcoming 

Obtenha uma lista dos próximos filmes nos cinemas. Esta é uma consulta de tipo de versão que procura todos os filmes que têm um tipo de lançamento de 2 ou 3 dentro do intervalo de datas especificado. 

 

REDES 

GET 

Get Details 

Obtenha os detalhes de uma rede. 

GET 

Get Alternative Names 

Obtenha os nomes alternativos de uma rede. 

GET 

Get Image 

Obtenha os logotipos da rede de TV por id. 

Existem dois formatos de imagem que são suportados para redes, PNG's e SVG's. 

 

TENDÊNCIAS 

GET 

Get Trending 

Obtenha os itens de tendência diários ou semanais. A lista de tendências diárias rastreia itens durante o período de um dia, enquanto os itens têm uma meia-vida de 24 horas. A lista semanal rastreia itens durante um período de 7 dias, com uma meia-vida de 7 dias. 

 

PESSOAS 

GET 

Get Details 

Obtenha os detalhes da pessoa principal por ID. 

GET 

Get Changes 

Obtenha as alterações para uma pessoa. Por padrão, apenas as últimas 24 horas são retornadas. 

GET 

Get Movie Credits 

Obtenha os créditos do filme para uma pessoa. 

GET 

Get TV Credits 

Obtenha os créditos do programa de TV para uma pessoa. 

Você pode consultar alguns detalhes extras sobre o crédito com o método de crédito. 

GET 

Get Combined Credits 

Reúna os créditos do filme e da TV em uma única resposta. 

GET 

Get External IDs 

Obtenha os IDs externos de uma pessoa.  

GET 

Get Images 

Obtenha as imagens para uma pessoa. 

GET 

Get Tagged Images 

Obtenha as imagens em que essa pessoa foi marcada. 

GET 

Get Translations 

Obtenha uma lista de traduções que foram criadas para uma pessoa. 

GET 

Get Latest 

Obtenha a pessoa mais recém-criada. Esta é uma resposta ao vivo e mudará continuamente. 

GET 

Get Popular 

Obtenha a lista de pessoas populares no TMDB. Esta lista é atualizada diariamente. 

 

OPINIÕES 

GET 

Get Details 

Recupere os detalhes de uma resenha de filme ou programa de TV. 

 

PROCURAR 

GET 

Search Companies 

Pesquise empresas. 

GET 

Search Collections 

Pesquise coleções. 

GET 

Search Keywords 

Pesquise palavras-chave. 

GET 

Search Movies 

Procure filmes. 

GET 

Multi Search 

Pesquise vários modelos em uma única solicitação. Atualmente, a pesquisa múltipla suporta a pesquisa de filmes, programas de TV e pessoas em uma única solicitação. 

GET 

Search Peoples 

Procure pessoas. 

GET 

Search TV Shows 

Procure um programa de TV. 

 

TV 

GET 

Get Details 

Obtenha os detalhes do programa de TV principal por ID. 

GET 

Get Account States 

Pegue os seguintes estados de conta para uma sessão: classificação de programas de TV, se pertencer à sua lista de observação, se pertencer à sua lista de favoritos 

GET 

Get Aggregative Credits 

Obtenha os créditos agregados (elenco e equipe) que foram adicionados a um programa de TV. 

Esta chamada difere da chamada principal na medida em que não retorna a temporada mais recente, mas sim, é uma visão de todo o elenco e equipe para todos os episódios pertencentes a um programa de TV. 

GET 

Get Alternative Titles 

Retorna todos os títulos alternativos de um programa de TV. 

GET 

Get Changes 

Obtenha as alterações para um programa de TV. Por padrão, apenas as últimas 24 horas são retornadas. 

GET 

Get Content Ratings 

Obtenha a lista de classificações de conteúdo (certificações) que foram adicionadas a um programa de TV. 

GET 

Get Credits 

Obtenha os créditos (elenco e equipe) que foram adicionados a um programa de TV. 

GET 

Get Episode Groups 

Obtenha todos os grupos de episódios que foram criados para um programa de TV. Com um ID de grupo, você pode chamar o método get TV episode group details. 

GET 

Get External IDs 

Obtenha os IDs externos de um programa de TV. 

GET 

Get Images 

Obtenha as imagens que pertencem a um programa de TV. 

GET 

Get Keywords 

Obtenha as palavras-chave que foram adicionadas a um programa de TV. 

GET 

Get Recommendations 

Obtenha a lista de recomendações de programas de TV para este item. 

GET 

Get Reviews 

Obtenha os comentários de um programa de TV. 

GET 

Get Screened Theatrically 

Obtenha uma lista de temporadas ou episódios que foram exibidos em um festival de cinema ou teatro. 

GET 

Get Similar TV Shows 

Obtenha uma lista de programas de TV semelhantes. Esses itens são montados observando palavras-chave e gêneros. 

GET 

Get Translations 

Obtenha uma lista das traduções que existem para um programa de TV. 

GET 

Get Videos 

Obtenha os vídeos que foram adicionados a um programa de TV. 

GET 

Get Watch Providers 

você pode consultar esse método para obter uma lista das disponibilidades por país por provedor. 

POST 

Rate TV Shows 

Classifique um programa de TV. 

É necessária uma sessão válida ou um ID de sessão de convidado. 

DELETE 

Delete Rating 

Remova a classificação de um programa de TV. 

É necessária uma sessão válida ou um ID de sessão de convidado. 

GET 

Get Latest 

Obtenha o programa de TV mais recém-criado. Esta é uma resposta ao vivo e mudará continuamente. 

GET 

Get TV Airing Today 

Obtenha uma lista de programas de TV que estão indo ao ar hoje. Esta consulta é puramente baseada em dia, pois atualmente não suportamos horários de exibição. 

Você pode especificar um fuso horário para compensar o cálculo do dia. Sem um fuso horário especificado, essa consulta tem como padrão EST (Hora do Leste UTC-05:00). 

GET 

Get TV On The Air 

Obtenha uma lista de programas que estão atualmente no ar. 

Esta consulta procura qualquer programa de TV que tenha um episódio com uma data de exibição nos próximos 7 dias. 

GET 

Get Popular 

Obtenha uma lista dos programas de TV populares atuais no TMDB. Esta lista é atualizada diariamente. 

GET 

Get Top Rated 

Obtenha uma lista dos programas de TV mais bem avaliados no TMDB. 

 

TEMPORADAS DE TV 

GET 

Get Details 

Obtenha os detalhes da temporada de TV por ID. 

GET 

Get Account States 

Retorna todas as classificações de usuários para os episódios da temporada. 

GET 

Get Aggregative Credits 

Obtenha os créditos agregados para a temporada de TV. 

Esta chamada difere da chamada principal na medida em que não apenas retorna os créditos da temporada, mas é uma visão de todo o elenco e equipe de todos os episódios pertencentes a uma temporada. 

GET 

Get Changes 

Obtenha as alterações para uma temporada de TV. Por padrão, apenas as últimas 24 horas são retornadas. 

GET 

Get Credits 

Obtenha os créditos para a temporada de TV. 

GET 

Get External IDs 

Obtenha os IDs externos para uma temporada de TV. 

GET 

Get Images 

Obtenha as imagens que pertencem a uma temporada de TV. 

GET 

Get Translations 

Obtenha os créditos para a temporada de TV. 

GET 

Get Videos 

Obtenha os vídeos que foram adicionados a uma temporada de TV. 

 

EPISÓDIOS DE TV 

GET 

Get Details 

Obtenha os detalhes do episódio de TV por ID. 

GET 

Get Account States 

Obtenha sua classificação para um episódio. 

GET 

Get Changes 

Obtenha as alterações para um episódio de TV. Por padrão, apenas as últimas 24 horas são retornadas. 

GET 

Get Credits 

Obtenha os créditos (elenco, equipe e estrelas convidadas) para um episódio de TV. 

GET 

Get External IDs 

Obtenha os IDs externos de um episódio de TV. 

GET 

Get Images 

Obtenha as imagens que pertencem a um episódio de TV. 

Consultar imagens com um parâmetro filtrará os resultados. 

GET 

Get Translations 

Obtenha os dados de tradução de um episódio. 

POST 

Rate TV Episodes 

Classifique um episódio de TV. 

É necessária uma sessão válida ou um ID de sessão de convidado. 

DELETE 

Delete Rating 

Remova a classificação de um episódio de TV. 

É necessária uma sessão válida ou um ID de sessão de convidado. 

GET 

Get Videos 

Obtenha os vídeos que foram adicionados a um episódio de TV. 

 

GRUPOS DE EPISÓDIOS DE TV 

GET 

Get details 

Obtenha os detalhes de um grupo de episódios de TV. Os grupos oferecem suporte a 7 tipos diferentes que são enumerados da seguinte forma: data de exibição original, absoluto, DVD, digital, arco da história, produção, TV 

 

PROVEDORES DE RELÓGIOS 

GET 

Get Available Regions 

Retorna uma lista de todos os países para os quais temos dados do provedor de relógios (OTT/streaming). 

GET 

Get Movie Providers 

Retorna uma lista dos dados do provedor de exibição (OTT/streaming) que temos disponíveis para filmes. Você pode especificar um parâmetro se quiser filtrar ainda mais a lista por país. 

GET 

Get TV Providers 

Retorna uma lista dos dados do provedor de relógios (OTT/streaming) que temos disponíveis para séries de TV. Você pode especificar um parâmetro se quiser filtrar ainda mais a lista por país. 

 

DADOS RETORNADOS PARA CADA MÉTODO 

Get Detail 

{ 
  "avatar": { 
    "gravatar": { 
      "hash": "c9e9fc152ee756a900db85757c29815d" 
    } 
  }, 
  "id": 548, 
  "iso_639_1": "en", 
  "iso_3166_1": "CA", 
  "name": "Travis Bell", 
  "include_adult": true, 
  "username": "travisbell" 
} 

Get Created List 

{ 
  "page": 1, 
  "results": [ 
    { 
      "description": "Name pretty much says it all, here's the top 50 grossing films of all time.", 
      "favorite_count": 0, 
      "id": 10, 
      "item_count": 0, 
      "iso_639_1": "en", 
      "list_type": "movie", 
      "name": "Top 50 Grossing Films of All Time (Worldwide)", 
      "poster_path": null 
    } 
  ], 
  "total_pages": 4, 
  "total_results": 61 
} 

Get Favorite Movies 

{ 
  "page": 1, 
  "results": [ 
    { 
      "adult": false, 
      "backdrop_path": null, 
      "genre_ids": [ 
        16 
      ], 
      "id": 9806, 
      "original_language": "en", 
      "original_title": "The Incredibles", 
      "overview": "Bob Parr has given up his superhero days to log in time as an insurance adjuster and raise his three children with his formerly heroic wife in suburbia. But when he receives a mysterious assignment, it's time to get back into costume.", 
      "release_date": "2004-11-04", 
      "poster_path": null, 
      "popularity": 0.167525, 
      "title": "The Incredibles", 
      "video": false, 
      "vote_average": 6.8, 
      "vote_count": 1584 
    } 
  ], 
  "total_pages": 4, 
  "total_results": 77 
} 

Get Favorite TV Shows 

{ 
  "page": 1, 
  "results": [ 
    { 
      "adult": false, 
      "backdrop_path": null, 
      "genre_ids": [ 
        16 
      ], 
      "id": 9806, 
      "original_language": "en", 
      "original_title": "The Incredibles", 
      "overview": "Bob Parr has given up his superhero days to log in time as an insurance adjuster and raise his three children with his formerly heroic wife in suburbia. But when he receives a mysterious assignment, it's time to get back into costume.", 
      "release_date": "2004-11-04", 
      "poster_path": null, 
      "popularity": 0.167525, 
      "title": "The Incredibles", 
      "video": false, 
      "vote_average": 6.8, 
      "vote_count": 1584 
    } 
  ], 
  "total_pages": 4, 
  "total_results": 77 
} 

Mark as Favorite 

{ 
  "status_code": 12, 
  "status_message": "The item/record was updated successfully." 
} 

Get Rated Movies 

{ 
  "page": 1, 
  "results": [ 
    { 
      "adult": false, 
      "backdrop_path": null, 
      "genre_ids": [ 
        28 
      ], 
      "id": 155, 
      "original_language": "en", 
      "original_title": "The Dark Knight", 
      "overview": "Batman raises the stakes in his war on crime. With the help of Lt. Jim Gordon and District Attorney Harvey Dent, Batman sets out to dismantle the remaining criminal organizations that plague the streets. The partnership proves to be effective, but they soon find themselves prey to a reign of chaos unleashed by a rising criminal mastermind known to the terrified citizens of Gotham as the Joker.", 
      "release_date": "2008-07-18", 
      "poster_path": null, 
      "popularity": 0.293783, 
      "title": "The Dark Knight", 
      "video": false, 
      "vote_average": 7.9, 
      "vote_count": 5504, 
      "rating": 9 
    } 
  ], 
  "total_pages": 31, 
  "total_results": 605 
} 

Get Rated TV Shows 

{ 
  "page": 1, 
  "results": [ 
    { 
      "backdrop_path": null, 
      "first_air_date": "2008-09-09", 
      "genre_ids": [ 
        18 
      ], 
      "id": 1705, 
      "original_language": "en", 
      "original_name": "Fringe", 
      "overview": "Fringe is an American science fiction television series that follows Olivia Dunham, Peter Bishop, and Walter Bishop, members of a Federal Bureau of Investigation \"Fringe Division\" team based in Boston, Massachusetts under the supervision of Homeland Security. The team uses \"fringe\" science and FBI investigative techniques to investigate a series of unexplained, often ghastly occurrences, which are related to mysteries surrounding a parallel universe. The series has been described as a hybrid of The X-Files, Altered States, and The Twilight Zone.", 
      "origin_country": [ 
        "US" 
      ], 
      "poster_path": null, 
      "popularity": 0.372415, 
      "name": "Fringe", 
      "vote_average": 8.4, 
      "vote_count": 46, 
      "rating": 9 
    } 
  ], 
  "total_pages": 7, 
  "total_results": 139 
} 

Get Rated TV Episodes 

{ 
  "page": 1, 
  "results": [ 
    { 
      "air_date": "2013-10-15", 
      "episode_number": 5, 
      "id": 64782, 
      "name": "The Workplace Proximity", 
      "overview": "Amy starts working at Caltech which causes friction with Sheldon. Howard agrees with Sheldon who mentions this to Bernadette causing a big fight for the Wolowitzes.", 
      "production_code": "4X5305", 
      "season_number": 7, 
      "show_id": 1418, 
      "still_path": "/8gsO10PHQnMO0qqXKN58Dk9bBBm.jpg", 
      "vote_average": 7.583, 
      "vote_count": 6, 
      "rating": 8 
    }, 
    { 
      "air_date": "2013-12-08", 
      "episode_number": 11, 
      "id": 968782, 
      "name": "Big Man in Tehran", 
      "overview": "Brody's loyalty to the mission wavers when he meets a ghost from his past. As Lockhart's confirmation looms, Saul stares into the precipice between success and failure.", 
      "production_code": "3WAH11", 
      "season_number": 3, 
      "show_id": 1407, 
      "still_path": "/3zRlEKCjd5hYtalJtxfdrX5cWqH.jpg", 
      "vote_average": 8.333, 
      "vote_count": 6, 
      "rating": 9 
    }, 
    { 
      "air_date": "2014-03-23", 
      "episode_number": 15, 
      "id": 973273, 
      "name": "Dramatics, Your Honor", 
      "overview": "Alicia asks Cary to be her lawyer when Nelson Dubeck (Eric Bogosian) asks her to participate in a deposition; Will faces off with a new prosecutor while defending Jeffrey Grant (Hunter Parrish).", 
      "production_code": null, 
      "season_number": 5, 
      "show_id": 1435, 
      "still_path": "/eGQg94nfM6EhKrxGA8A92SXe3WT.jpg", 
      "vote_average": 6.667, 
      "vote_count": 3, 
      "rating": 9 
    }, 
    { 
      "air_date": "2014-05-11", 
      "episode_number": 6, 
      "id": 63099, 
      "name": "The Laws of Gods and Men", 
      "overview": "Stannis and Davos set sail; Dany meets with supplicants; Tyrion faces down his father. ", 
      "production_code": "406", 
      "season_number": 4, 
      "show_id": 1399, 
      "still_path": "/vKt9b7HNYhwM91C7S53zPsAWfT3.jpg", 
      "vote_average": 8.885, 
      "vote_count": 48, 
      "rating": 8.5 
    }, 
    { 
      "air_date": "2014-05-18", 
      "episode_number": 7, 
      "id": 63100, 
      "name": "Mockingbird", 
      "overview": "Tyrion gains an unlikely ally; Daario asks Dany to allow him to do what he does best; Jon's warnings about the vulnerability of the Wall are ignored; Brienne follows a new lead. ", 
      "production_code": "407", 
      "season_number": 4, 
      "show_id": 1399, 
      "still_path": "/r7u0uELPyDkNnBZzAFVvw1XJKo5.jpg", 
      "vote_average": 8.035, 
      "vote_count": 43, 
      "rating": 8.5 
    }, 
    { 
      "air_date": "2014-06-16", 
      "episode_number": 12, 
      "id": 975339, 
      "name": "Tome-wan", 
      "overview": "Bedelia returns and accepts immunity to testify against Hannibal. Mason Verger plots revenge after learning of Hannibal's manipulations.", 
      "production_code": "212", 
      "season_number": 2, 
      "show_id": 40008, 
      "still_path": "/pYsO5cXmjJGYUZWVDocBI3CIM6.jpg", 
      "vote_average": 8.385, 
      "vote_count": 13, 
      "rating": 9 
    }, 
    { 
      "air_date": "2014-05-23", 
      "episode_number": 13, 
      "id": 976285, 
      "name": "Mizumono", 
      "overview": "Springing their trap, Jack, Will and Alana face off with Hannibal in a bloody final showdown, but the doctor has a few surprises of his own.", 
      "production_code": "213", 
      "season_number": 2, 
      "show_id": 40008, 
      "still_path": "/40jqX3XRk6W97gscX5rj4kTy411.jpg", 
      "vote_average": 9.105, 
      "vote_count": 19, 
      "rating": 10 
    }, 
    { 
      "air_date": "2014-06-01", 
      "episode_number": 8, 
      "id": 63101, 
      "name": "The Mountain and the Viper", 
      "overview": "Unexpected visitors arrive in Mole's Town. Littlefinger's motives are questioned. Ramsay tries to prove himself to his father. Tyrion's fate is decided.", 
      "production_code": "408", 
      "season_number": 4, 
      "show_id": 1399, 
      "still_path": "/B5ttTcMjq7YzgKcCzhb6ggJT03.jpg", 
      "vote_average": 8.654, 
      "vote_count": 52, 
      "rating": 9.5 
    }, 
    { 
      "air_date": "2013-09-29", 
      "episode_number": 16, 
      "id": 62161, 
      "name": "Felina", 
      "overview": "All bad things must come to an end.", 
      "production_code": null, 
      "season_number": 5, 
      "show_id": 1396, 
      "still_path": "/pA0YwyhvdDXP3BEGL2grrIhq8aM.jpg", 
      "vote_average": 8.805, 
      "vote_count": 41, 
      "rating": 9 
    }, 
    { 
      "air_date": "2014-07-13", 
      "episode_number": 1, 
      "id": 989249, 
      "name": "Night Zero", 
      "overview": "When a plane lands in New York City with everyone on board dead, Dr. Ephraim Goodweather, head of the CDC’s Canary Project, and his team are called upon to investigate. Harlem pawnbroker Abraham Setrakian races to the airport, convinced that what looks at first like a mysterious viral outbreak might be the beginning of something infinitely more sinister.", 
      "production_code": "XSN01001", 
      "season_number": 1, 
      "show_id": 47640, 
      "still_path": "/hNvvXGRszkgQXVUDnK2EIMXcD0t.jpg", 
      "vote_average": 7.643, 
      "vote_count": 7, 
      "rating": 7.5 
    }, 
    { 
      "air_date": "2014-06-19", 
      "episode_number": 1, 
      "id": 976915, 
      "name": "Running with the Bull", 
      "overview": "Daniel’s family fears he won’t recover from his injuries and his attackers will escape justice. Judy Dean shows Bobby some unexpected affection. Ted, Jr. hides a shameful secret from his wife. Sheriff Daggett investigates Daniel’s beating.", 
      "production_code": null, 
      "season_number": 2, 
      "show_id": 46619, 
      "still_path": "/yzH8iOxLAGgwDcXehUM0O8sTolo.jpg", 
      "vote_average": 9.667, 
      "vote_count": 3, 
      "rating": 9 
    }, 
    { 
      "air_date": "2014-08-24", 
      "episode_number": 9, 
      "id": 990362, 
      "name": "The Garveys at Their Best", 
      "overview": "Kevin tries to suppress his bad habits while tracking down a marauding deer in Mapleton. Laurie receives not-unexpected news amidst a rising sense of foreboding. Tom connects with his past, against his better judgment. Nora has a job interview; Kevin Senior receives an honor.", 
      "production_code": "4X5709", 
      "season_number": 1, 
      "show_id": 54344, 
      "still_path": "/gGLWdy0ac2OryUwfGd3y0TiHTpD.jpg", 
      "vote_average": 8.857, 
      "vote_count": 7, 
      "rating": 9 
    }, 
    { 
      "air_date": "2012-07-15", 
      "episode_number": 1, 
      "id": 62147, 
      "name": "Live Free or Die", 
      "overview": "As Walt deals with the aftermath of the Casa Tranquila explosion, Hank works to wrap up his investigation of Gus' empire.", 
      "production_code": null, 
      "season_number": 5, 
      "show_id": 1396, 
      "still_path": "/uShB5dWoA3xIivZ9jvwWnGCVvt4.jpg", 
      "vote_average": 7.692, 
      "vote_count": 26, 
      "rating": 8 
    }, 
    { 
      "air_date": "2012-08-26", 
      "episode_number": 7, 
      "id": 62153, 
      "name": "Say My Name", 
      "overview": "Walt takes control of business matters; Mike deals with the consequences of his actions.", 
      "production_code": null, 
      "season_number": 5, 
      "show_id": 1396, 
      "still_path": "/2NA7ti9jsWnG4xreMEFwbq4DH1f.jpg", 
      "vote_average": 8.1, 
      "vote_count": 25, 
      "rating": 8.5 
    }, 
    { 
      "air_date": "2015-03-01", 
      "episode_number": 1, 
      "id": 1022053, 
      "name": "The Battle Creek Way", 
      "overview": "Jaded Det. Russ Agnew reluctantly partners with charming FBI Agent Milt Chamberlain to solve a drug-related double homicide, but while Milt investigates with the high-tech resources of the FBI, Russ prefers old-school police work and instinct.", 
      "production_code": "101", 
      "season_number": 1, 
      "show_id": 61676, 
      "still_path": "/3WhjGuI9AD2OXF40hntDJbWC6Sp.jpg", 
      "vote_average": 7.5, 
      "vote_count": 2, 
      "rating": 8 
    }, 
    { 
      "air_date": "2015-02-23", 
      "episode_number": 16, 
      "id": 1039439, 
      "name": "The Wrong Stuff", 
      "overview": "When an astronaut, training for a trip to Mars, is mysteriously killed inside a Mars simulation, Castle and Beckett don spacesuits to investigate. But when they discover no one inside the sealed simulation could have committed the murder and no one from the outside could get in, the case takes a shocking turn", 
      "production_code": "716", 
      "season_number": 7, 
      "show_id": 1419, 
      "still_path": "/kg0beAZYaaLVsP3mMxVnwDcG1f8.jpg", 
      "vote_average": 8, 
      "vote_count": 4, 
      "rating": 8 
    }, 
    { 
      "air_date": "2015-04-10", 
      "episode_number": 13, 
      "id": 1036361, 
      "name": "Daredevil", 
      "overview": "In the season finale, a boxed-in Fisk and a desperate Murdock, Foggy and Karen are forced to play their end games.", 
      "production_code": null, 
      "season_number": 1, 
      "show_id": 61889, 
      "still_path": "/nSCJMlJkGULVKHuisKeH9Crguy8.jpg", 
      "vote_average": 7.64, 
      "vote_count": 25, 
      "rating": 9.5 
    }, 
    { 
      "air_date": "2015-03-20", 
      "episode_number": 1, 
      "id": 1040171, 
      "name": "Part 1", 
      "overview": "Trouble starts when oldest son Danny Rayburn comes home for the 45th anniversary celebration of his parents' hotel in the Florida Keys' Islamorada.", 
      "production_code": null, 
      "season_number": 1, 
      "show_id": 61986, 
      "still_path": "/k9dcZnv7tHeGZF6LWBVdzm4B3E3.jpg", 
      "vote_average": 7.7, 
      "vote_count": 5, 
      "rating": 8.5 
    }, 
    { 
      "air_date": "2015-05-31", 
      "episode_number": 8, 
      "id": 1070282, 
      "name": "Hardhome", 
      "overview": "Arya makes progress in her training. Sansa confronts an old friend. Cersei struggles. Jon travels.", 
      "production_code": "508", 
      "season_number": 5, 
      "show_id": 1399, 
      "still_path": "/zIrSrXU4zOArlVYnXFxxfKDYYY2.jpg", 
      "vote_average": 9.21, 
      "vote_count": 69, 
      "rating": 10 
    }, 
    { 
      "air_date": "2011-04-17", 
      "episode_number": 1, 
      "id": 63056, 
      "name": "Winter Is Coming", 
      "overview": "Jon Arryn, the Hand of the King, is dead. King Robert Baratheon plans to ask his oldest friend, Eddard Stark, to take Jon's place. Across the sea, Viserys Targaryen plans to wed his sister to a nomadic warlord in exchange for an army.", 
      "production_code": "101", 
      "season_number": 1, 
      "show_id": 1399, 
      "still_path": "/wrGWeW4WKxnaeA8sxJb2T9O6ryo.jpg", 
      "vote_average": 7.413, 
      "vote_count": 104, 
      "rating": 9 
    } 
  ], 
  "total_pages": 8, 
  "total_results": 152 
} 

Get Movies Watchlist 

{ 
  "page": 1, 
  "results": [ 
    { 
      "adult": false, 
      "backdrop_path": null, 
      "genre_ids": [ 
        18 
      ], 
      "id": 76726, 
      "original_language": "it", 
      "original_title": "Chronicle", 
      "overview": "Three high school students make an incredible discovery, leading to their developing uncanny powers beyond their understanding. As they learn to control their abilities and use them to their advantage, their lives start to spin out of control, and their darker sides begin to take over.", 
      "release_date": "2012-02-02", 
      "poster_path": null, 
      "popularity": 0.237951, 
      "title": "Chronicle", 
      "video": false, 
      "vote_average": 6.2, 
      "vote_count": 545 
    } 
  ], 
  "total_pages": 14, 
  "total_results": 277 
} 

Get TV Show Watchlist 

{ 
  "page": 1, 
  "results": [ 
    { 
      "backdrop_path": null, 
      "first_air_date": "2013-09-26", 
      "genre_ids": [ 
        35 
      ], 
      "id": 58932, 
      "original_language": "en", 
      "original_name": "The Crazy Ones", 
      "overview": "The Crazy Ones is an American situation comedy series created by David E. Kelley that stars Robin Williams and Sarah Michelle Gellar. The single-camera project premiered on CBS on September 26, 2013, as part of the 2013–14 American television season as a Thursday night 9 pm entry. Bill D'Elia, Dean Lorey, Jason Winer, John Montgomery and Mark Teitelbaum serve as executive producers for 20th Century Fox Television.", 
      "origin_country": [ 
        "US" 
      ], 
      "poster_path": null, 
      "popularity": 0.075407, 
      "name": "The Crazy Ones", 
      "vote_average": 5.3, 
      "vote_count": 4 
    } 
  ], 
  "total_pages": 4, 
  "total_results": 64 
} 

Add to Watchlist 

{ 
  "status_code": 1, 
  "status_message": "Success." 
} 

Create Guest Session 

{ 
  "success": true, 
  "guest_session_id": "1ce82ec1223641636ad4a60b07de3581", 
  "expires_at": "2016-08-27 16:26:40 UTC" 
} 

Create Request Token 

{ 
  "success": true, 
  "expires_at": "2016-08-26 17:04:39 UTC", 
  "request_token": "ff5c7eeb5a8870efe3cd7fc5c282cffd26800ecd" 
} 

Create Session 

{ 
  "success": true, 
  "session_id": "79191836ddaa0da3df76a5ffef6f07ad6ab0c641" 
} 

Create Session With Login 

{ 
  "success": true, 
  "expires_at": "2018-07-24 04:10:26 UTC", 
  "request_token": "1531f1a558c8357ce8990cf887ff196e8f5402ec" 
} 

Create Session (from v4 access token) 

{ 
  "success": true, 
  "session_id": "2629f70fb498edc263a0adb99118ac41f0053e8c" 
} 

Delete Session 

{ 
  "success": true 
} 

Get Movie Certifications 

{ 
  "certifications": { 
    "US": [ 
      { 
        "certification": "G", 
        "meaning": "All ages admitted. There is no content that would be objectionable to most parents. This is one of only two ratings dating back to 1968 that still exists today.", 
        "order": 1 
      }, 
      { 
        "certification": "PG-13", 
        "meaning": "Some material may be inappropriate for children under 13. Films given this rating may contain sexual content, brief or partial nudity, some strong language and innuendo, humor, mature themes, political themes, terror and/or intense action violence. However, bloodshed is rarely present. This is the minimum rating at which drug content is present.", 
        "order": 3 
      }, 
      { 
        "certification": "R", 
        "meaning": "Under 17 requires accompanying parent or adult guardian 21 or older. The parent/guardian is required to stay with the child under 17 through the entire movie, even if the parent gives the child/teenager permission to see the film alone. These films may contain strong profanity, graphic sexuality, nudity, strong violence, horror, gore, and strong drug use. A movie rated R for profanity often has more severe or frequent language than the PG-13 rating would permit. An R-rated movie may have more blood, gore, drug use, nudity, or graphic sexuality than a PG-13 movie would admit.", 
        "order": 4 
      }, 
      { 
        "certification": "NC-17", 
        "meaning": "These films contain excessive graphic violence, intense or explicit sex, depraved, abhorrent behavior, explicit drug abuse, strong language, explicit nudity, or any other elements which, at present, most parents would consider too strong and therefore off-limits for viewing by their children and teens. NC-17 does not necessarily mean obscene or pornographic in the oft-accepted or legal meaning of those words.", 
        "order": 5 
      }, 
      { 
        "certification": "NR", 
        "meaning": "No rating information.", 
        "order": 0 
      }, 
      { 
        "certification": "PG", 
        "meaning": "Some material may not be suitable for children under 10. These films may contain some mild language, crude/suggestive humor, scary moments and/or violence. No drug content is present. There are a few exceptions to this rule. A few racial insults may also be heard.", 
        "order": 2 
      } 
    ], 
    "CA": [ 
      { 
        "certification": "18A", 
        "meaning": "Persons under 18 years of age must be accompanied by an adult. In the Maritimes & Manitoba, children under the age of 14 are prohibited from viewing the film.", 
        "order": 4 
      }, 
      { 
        "certification": "G", 
        "meaning": "All ages.", 
        "order": 1 
      }, 
      { 
        "certification": "PG", 
        "meaning": "Parental guidance advised. There is no age restriction but some material may not be suitable for all children.", 
        "order": 2 
      }, 
      { 
        "certification": "14A", 
        "meaning": "Persons under 14 years of age must be accompanied by an adult.", 
        "order": 3 
      }, 
      { 
        "certification": "A", 
        "meaning": "Admittance restricted to people 18 years of age or older. Sole purpose of the film is the portrayal of sexually explicit activity and/or explicit violence.", 
        "order": 5 
      } 
    ], 
    "AU": [ 
      { 
        "certification": "E", 
        "meaning": "Exempt from classification. Films that are exempt from classification must not contain contentious material (i.e. material that would ordinarily be rated M or higher).", 
        "order": 1 
      }, 
      { 
        "certification": "G", 
        "meaning": "General. The content is very mild in impact.", 
        "order": 2 
      }, 
      { 
        "certification": "R18+", 
        "meaning": "Restricted to 18 years and over. Adults only. The content is high in impact.", 
        "order": 6 
      }, 
      { 
        "certification": "RC", 
        "meaning": "Refused Classification. Banned from sale or hire in Australia; also generally applies to importation (if inspected by and suspicious to Customs). Private Internet viewing is unenforced and attempts to legally censor such online material has resulted in controversy. Films are rated RC if their content exceeds the guidelines. The content is very high in impact.", 
        "order": 8 
      }, 
      { 
        "certification": "PG", 
        "meaning": "Parental guidance recommended. There are no age restrictions. The content is mild in impact.", 
        "order": 3 
      }, 
      { 
        "certification": "M", 
        "meaning": "Recommended for mature audiences. There are no age restrictions. The content is moderate in impact.", 
        "order": 4 
      }, 
      { 
        "certification": "MA15+", 
        "meaning": "Mature Accompanied. Unsuitable for children younger than 15. Children younger than 15 years must be accompanied by a parent or guardian. The content is strong in impact.", 
        "order": 5 
      }, 
      { 
        "certification": "X18+", 
        "meaning": "Restricted to 18 years and over. Films with this rating have pornographic content. Films classified as X18+ are banned from being sold or rented in all Australian states and are only legally available in the Australian Capital Territory and the Northern Territory. However, importing X18+ material from the two territories to any of the Australian states is legal.The content is sexually explicit in impact.", 
        "order": 7 
      } 
    ], 
    "DE": [ 
      { 
        "certification": "0", 
        "meaning": "No age restriction.", 
        "order": 1 
      }, 
      { 
        "certification": "6", 
        "meaning": "No children younger than 6 years admitted.", 
        "order": 2 
      }, 
      { 
        "certification": "12", 
        "meaning": "Children 12 or older admitted, children between 6 and 11 only when accompanied by parent or a legal guardian.", 
        "order": 3 
      }, 
      { 
        "certification": "16", 
        "meaning": "Children 16 or older admitted, nobody under this age admitted.", 
        "order": 4 
      }, 
      { 
        "certification": "18", 
        "meaning": "No youth admitted, only adults.", 
        "order": 5 
      } 
    ], 
    "FR": [ 
      { 
        "certification": "U", 
        "meaning": "(Tous publics) valid for all audiences.", 
        "order": 1 
      }, 
      { 
        "certification": "12", 
        "meaning": "(Interdit aux moins de 12 ans) unsuitable for children younger than 12 or forbidden in cinemas for under 12.", 
        "order": 3 
      }, 
      { 
        "certification": "10", 
        "meaning": "(Déconseillé aux moins de 10 ans) unsuitable for children younger than 10 (this rating is only used for TV); equivalent in theatres : \"avertissement\" (warning), some scenes may be disturbing to young children and sensitive people; equivalent on video : \"accord parental\" (parental guidance).", 
        "order": 2 
      }, 
      { 
        "certification": "16", 
        "meaning": "(Interdit aux moins de 16 ans) unsuitable for children younger than 16 or forbidden in cinemas for under 16.", 
        "order": 4 
      }, 
      { 
        "certification": "18", 
        "meaning": "(Interdit aux mineurs) unsuitable for children younger than 18 or forbidden in cinemas for under 18.", 
        "order": 5 
      } 
    ], 
    "NZ": [ 
      { 
        "certification": "M", 
        "meaning": "Suitable for (but not restricted to) mature audiences 16 years and up.", 
        "order": 3 
      }, 
      { 
        "certification": "13", 
        "meaning": "Restricted to persons 13 years of age and over.", 
        "order": 4 
      }, 
      { 
        "certification": "15", 
        "meaning": "Restricted to persons 15 years of age and over.", 
        "order": 5 
      }, 
      { 
        "certification": "G", 
        "meaning": "Suitable for general audiences.", 
        "order": 1 
      }, 
      { 
        "certification": "PG", 
        "meaning": "Parental guidance recommended for younger viewers.", 
        "order": 2 
      }, 
      { 
        "certification": "16", 
        "meaning": "Restricted to persons 16 years of age and over.", 
        "order": 6 
      }, 
      { 
        "certification": "18", 
        "meaning": "Restricted to persons 18 years of age and over.", 
        "order": 7 
      }, 
      { 
        "certification": "R", 
        "meaning": "Restricted to a particular class of persons, or for particular purposes, or both.", 
        "order": 8 
      } 
    ], 
    "IN": [ 
      { 
        "certification": "U", 
        "meaning": "Unrestricted Public Exhibition throughout India, suitable for all age groups. Films under this category should not upset children over 4. Such films may contain educational, social or family-oriented themes. Films under this category may also contain fantasy violence and/or mild bad language.", 
        "order": 0 
      }, 
      { 
        "certification": "UA", 
        "meaning": "All ages admitted, but it is advised that children below 12 be accompanied by a parent as the theme or content may be considered intense or inappropriate for young children. Films under this category may contain mature themes, sexual references, mild sex scenes, violence with brief gory images and/or infrequent use of crude language.", 
        "order": 1 
      }, 
      { 
        "certification": "A", 
        "meaning": "Restricted to adult audiences (18 years or over). Nobody below the age of 18 may buy/rent an A-rated DVD, VHS, UMD or watch a film in the cinema with this rating. Films under this category may contain adult/disturbing themes, frequent crude language, brutal violence with blood and gore, strong sex scenes and/or scenes of drug abuse which is considered unsuitable for minors.", 
        "order": 2 
      } 
    ], 
    "GB": [ 
      { 
        "certification": "15", 
        "meaning": "Only those over 15 years are admitted. Nobody younger than 15 can rent or buy a 15-rated VHS, DVD, Blu-ray Disc, UMD or game, or watch a film in the cinema with this rating. Films under this category can contain adult themes, hard drugs, frequent strong language and limited use of very strong language, strong violence and strong sex references, and nudity without graphic detail. Sexual activity may be portrayed but without any strong detail. Sexual violence may be shown if discreet and justified by context.", 
        "order": 5 
      }, 
      { 
        "certification": "R18", 
        "meaning": "Can only be shown at licensed adult cinemas or sold at licensed sex shops, and only to adults, those aged 18 or over. Films under this category are always hard-core pornography, defined as material intended for sexual stimulation and containing clear images of real sexual activity, strong fetish material, explicit animated images, or sight of certain acts such as triple simultaneous penetration and snowballing. There remains a range of material that is often cut from the R18 rating: strong images of injury in BDSM or spanking works, urolagnia, scenes suggesting incest even if staged, references to underage sex or childhood sexual development and aggressive behaviour such as hair-pulling or spitting on a performer are not permitted. More cuts are demanded in this category than any other category.", 
        "order": 7 
      }, 
      { 
        "certification": "U", 
        "meaning": "All ages admitted, there is nothing unsuitable for children.", 
        "order": 1 
      }, 
      { 
        "certification": "PG", 
        "meaning": "All ages admitted, but certain scenes may be unsuitable for young children. May contain mild language and sex/drugs references. May contain moderate violence if justified by context (e.g. fantasy).", 
        "order": 2 
      }, 
      { 
        "certification": "12A", 
        "meaning": "Films under this category are considered to be unsuitable for very young people. Those aged under 12 years are only admitted if accompanied by an adult, aged at least 18 years, at all times during the motion picture. However, it is generally not recommended that children under 12 years should watch the film. Films under this category can contain mature themes, discrimination, soft drugs, moderate swear words, infrequent strong language and moderate violence, sex references and nudity. Sexual activity may be briefly and discreetly portrayed. Sexual violence may be implied or briefly indicated.", 
        "order": 3 
      }, 
      { 
        "certification": "12", 
        "meaning": "Home media only since 2002. 12A-rated films are usually given a 12 certificate for the VHS/DVD version unless extra material has been added that requires a higher rating. Nobody younger than 12 can rent or buy a 12-rated VHS, DVD, Blu-ray Disc, UMD or game. The content guidelines are identical to those used for the 12A certificate.", 
        "order": 4 
      }, 
      { 
        "certification": "18", 
        "meaning": "Only adults are admitted. Nobody younger than 18 can rent or buy an 18-rated VHS, DVD, Blu-ray Disc, UMD or game, or watch a film in the cinema with this rating. Films under this category do not have limitation on the bad language that is used. Hard drugs are generally allowed, and explicit sex references along with detailed sexual activity are also allowed. Scenes of strong real sex may be permitted if justified by the context. Very strong, gory, and/or sadistic violence is usually permitted. Strong sexual violence is permitted unless it is eroticised or excessively graphic.", 
        "order": 6 
      } 
    ], 
    "NL": [ 
      { 
        "certification": "AL", 
        "meaning": "All ages.", 
        "order": 1 
      }, 
      { 
        "certification": "6", 
        "meaning": "Potentially harmful to children under 6 years.", 
        "order": 2 
      }, 
      { 
        "certification": "9", 
        "meaning": "Potentially harmful to children under 9 years.", 
        "order": 3 
      }, 
      { 
        "certification": "12", 
        "meaning": "Potentially harmful to children under 12 years; broadcasting is not allowed before 8:00 pm.", 
        "order": 4 
      }, 
      { 
        "certification": "16", 
        "meaning": "Potentially harmful to children under 16 years; broadcasting is not allowed before 10:00 pm.", 
        "order": 5 
      } 
    ], 
    "BR": [ 
      { 
        "certification": "L", 
        "meaning": "General Audiences. Do not expose children to potentially harmful content.", 
        "order": 1 
      }, 
      { 
        "certification": "10", 
        "meaning": "Not recommended for minors under ten. Violent content or inappropriate language to children, even if of a less intensity.", 
        "order": 2 
      }, 
      { 
        "certification": "12", 
        "meaning": "Not recommended for minors under twelve. Scenes can include physical aggression, use of legal drugs and sexual innuendo.", 
        "order": 3 
      }, 
      { 
        "certification": "14", 
        "meaning": "Not recommended for minors under fourteen. More violent material, stronger sex references and/or nudity.", 
        "order": 4 
      }, 
      { 
        "certification": "16", 
        "meaning": "Not recommended for minors under sixteen. Scenes featuring production, trafficking and/or use of illegal drugs, hyper-realistic sex, sexual violence, abortion, torture, mutilation, suicide, trivialization of violence and death penalty.", 
        "order": 5 
      }, 
      { 
        "certification": "18", 
        "meaning": "Not recommended for minors under eighteen. Scenes featuring explicit sex, incest, pedophilia, praising of the use of illegal drugs and violence of a strong imagery impact.", 
        "order": 6 
      } 
    ], 
    "FI": [ 
      { 
        "certification": "S", 
        "meaning": "For all ages.", 
        "order": 1 
      }, 
      { 
        "certification": "K-7", 
        "meaning": "Over 7 years.", 
        "order": 2 
      }, 
      { 
        "certification": "K-12", 
        "meaning": "Over 12 years.", 
        "order": 3 
      }, 
      { 
        "certification": "K-16", 
        "meaning": "Over 16 years.", 
        "order": 4 
      }, 
      { 
        "certification": "K-18", 
        "meaning": "Adults only.", 
        "order": 5 
      }, 
      { 
        "certification": "KK", 
        "meaning": "Banned from commercial distribution.", 
        "order": 6 
      } 
    ], 
    "BG": [ 
      { 
        "certification": "A", 
        "meaning": "Recommended for children.", 
        "order": 1 
      }, 
      { 
        "certification": "B", 
        "meaning": "Without age restrictions.", 
        "order": 2 
      }, 
      { 
        "certification": "C", 
        "meaning": "Not recommended for children under 12.", 
        "order": 3 
      }, 
      { 
        "certification": "D", 
        "meaning": "Prohibited for persons under 16.", 
        "order": 4 
      }, 
      { 
        "certification": "X", 
        "meaning": "Prohibited for persons under 18.", 
        "order": 5 
      } 
    ], 
    "ES": [ 
      { 
        "certification": "APTA", 
        "meaning": "General admission.", 
        "order": 1 
      }, 
      { 
        "certification": "7", 
        "meaning": "Not recommended for audiences under 7.", 
        "order": 2 
      }, 
      { 
        "certification": "12", 
        "meaning": "Not recommended for audiences under 12.", 
        "order": 3 
      }, 
      { 
        "certification": "16", 
        "meaning": "Not recommended for audiences under 16.", 
        "order": 4 
      }, 
      { 
        "certification": "18", 
        "meaning": "Not recommended for audiences under 18.", 
        "order": 5 
      }, 
      { 
        "certification": "X", 
        "meaning": "Prohibited for audiences under 18.", 
        "order": 6 
      } 
    ], 
    "PH": [ 
      { 
        "certification": "G", 
        "meaning": "General Audiences. Viewers of all ages are admitted.", 
        "order": 1 
      }, 
      { 
        "certification": "PG", 
        "meaning": "Parental Guidance. Viewers below 13 years old must be accompanied by a parent or supervising adult.", 
        "order": 2 
      }, 
      { 
        "certification": "R-13", 
        "meaning": "Restricted-13. Only viewers who are 13 years old and above can be admitted.", 
        "order": 3 
      }, 
      { 
        "certification": "R-16", 
        "meaning": "Restricted-16. Only viewers who are 16 years old and above can be admitted.", 
        "order": 4 
      }, 
      { 
        "certification": "R-18", 
        "meaning": "Restricted-18. Only viewers who are 18 years old and above can be admitted.", 
        "order": 5 
      }, 
      { 
        "certification": "X", 
        "meaning": "Not For Public Exhibition. X-rated films are not suitable for public exhibition.", 
        "order": 6 
      } 
    ], 
    "PT": [ 
      { 
        "certification": "Públicos", 
        "meaning": "For all the public (especially designed for children under 3 years of age).", 
        "order": 1 
      }, 
      { 
        "certification": "M/3", 
        "meaning": "Passed for viewers aged 3 and older.", 
        "order": 2 
      }, 
      { 
        "certification": "M/6", 
        "meaning": "Passed for viewers aged 6 and older.", 
        "order": 3 
      }, 
      { 
        "certification": "M/12", 
        "meaning": "Passed for viewers aged 12 and older.", 
        "order": 4 
      }, 
      { 
        "certification": "M/14", 
        "meaning": "Passed for viewers aged 14 and older.", 
        "order": 5 
      }, 
      { 
        "certification": "M/16", 
        "meaning": "Passed for viewers aged 16 and older.", 
        "order": 6 
      }, 
      { 
        "certification": "M/18", 
        "meaning": "Passed for viewers aged 18 and older.", 
        "order": 7 
      }, 
      { 
        "certification": "P", 
        "meaning": "Special rating supplementary to the M/18 age rating denoting pornography.", 
        "order": 8 
      } 
    ] 
  } 
} 

Get TV Certifications 

{ 
  "certifications": { 
    "RU": [ 
      { 
        "certification": "18+", 
        "meaning": "Restricted to People 18 or Older.", 
        "order": 5 
      }, 
      { 
        "certification": "0+", 
        "meaning": "Can be watched by Any Age.", 
        "order": 1 
      }, 
      { 
        "certification": "6+", 
        "meaning": "Only kids the age of 6 or older can watch.", 
        "order": 2 
      }, 
      { 
        "certification": "12+", 
        "meaning": "Only kids the age of 12 or older can watch.", 
        "order": 3 
      }, 
      { 
        "certification": "16+", 
        "meaning": "Only teens the age of 16 or older can watch.", 
        "order": 4 
      } 
    ], 
    "US": [ 
      { 
        "certification": "NR", 
        "meaning": "No rating information.", 
        "order": 0 
      }, 
      { 
        "certification": "TV-Y", 
        "meaning": "This program is designed to be appropriate for all children.", 
        "order": 1 
      }, 
      { 
        "certification": "TV-Y7", 
        "meaning": "This program is designed for children age 7 and above.", 
        "order": 2 
      }, 
      { 
        "certification": "TV-G", 
        "meaning": "Most parents would find this program suitable for all ages.", 
        "order": 3 
      }, 
      { 
        "certification": "TV-PG", 
        "meaning": "This program contains material that parents may find unsuitable for younger children.", 
        "order": 4 
      }, 
      { 
        "certification": "TV-14", 
        "meaning": "This program contains some material that many parents would find unsuitable for children under 14 years of age.", 
        "order": 5 
      }, 
      { 
        "certification": "TV-MA", 
        "meaning": "This program is specifically designed to be viewed by adults and therefore may be unsuitable for children under 17.", 
        "order": 6 
      } 
    ], 
    "CA": [ 
      { 
        "certification": "Exempt", 
        "meaning": "Shows which are exempt from ratings (such as news and sports programming) will not display an on-screen rating at all.", 
        "order": 0 
      }, 
      { 
        "certification": "C", 
        "meaning": "Programming suitable for children ages of 2–7 years. No profanity or sexual content of any level allowed. Contains little violence.", 
        "order": 1 
      }, 
      { 
        "certification": "C8", 
        "meaning": "Suitable for children ages 8+. Low level violence and fantasy horror is allowed. No foul language is allowed, but occasional \"socially offensive and discriminatory\" language is allowed if in the context of the story. No sexual content of any level allowed.", 
        "order": 2 
      }, 
      { 
        "certification": "G", 
        "meaning": "Suitable for general audiences. Programming suitable for the entire family with mild violence, and mild profanity and/or censored language.", 
        "order": 3 
      }, 
      { 
        "certification": "PG", 
        "meaning": "Parental guidance. Moderate violence and moderate profanity is allowed, as is brief nudity and sexual references if important to the context of the story.", 
        "order": 4 
      }, 
      { 
        "certification": "14+", 
        "meaning": "Programming intended for viewers ages 14 and older. May contain strong violence and strong profanity, and depictions of sexual activity as long as they are within the context of a story.", 
        "order": 5 
      }, 
      { 
        "certification": "18+", 
        "meaning": "Programming intended for viewers ages 18 and older. May contain explicit violence and sexual activity. Programming with this rating cannot air before the watershed (9:00 p.m. to 6:00 a.m.).", 
        "order": 6 
      } 
    ], 
    "AU": [ 
      { 
        "certification": "P", 
        "meaning": "Programming is intended for younger children 2–11; commercial stations must show at least 30 minutes of P-rated content each weekday and weekends at all times. No advertisements may be shown during P-rated programs.", 
        "order": 1 
      }, 
      { 
        "certification": "C", 
        "meaning": "Programming intended for older children 5–14; commercial stations must show at least 30 minutes of C-rated content each weekday between 7 a.m. and 8 a.m. or between 4 p.m. and 8:30 p.m. A further 2 and a half ours a week must also be shown either within these time bands or between 7 a.m. and 8:30 p.m. on weekends and school holidays, for a total of five hours a week (averaged as 260 hours over the course of a year). C-rated content is subject to certain restrictions and limitations on advertising (typically five minutes maximum per 30-minute period or seven minutes including promotions and community announcements).", 
        "order": 2 
      }, 
      { 
        "certification": "G", 
        "meaning": "For general exhibition; all ages are permitted to watch programming with this rating.", 
        "order": 3 
      }, 
      { 
        "certification": "PG", 
        "meaning": "Parental guidance is recommended for young viewers; PG-rated content may air at any time on digital-only channels, otherwise, it should only be broadcast between 8:30 a.m. and 4:00 p.m. and between 7:00 p.m. and 6:00 a.m. on weekdays, and between 10:00 a.m. and 6:00 a.m. on weekends.", 
        "order": 4 
      }, 
      { 
        "certification": "M", 
        "meaning": "Recommended for mature audiences; M-rated content may only be broadcast between 8:30 p.m. and 5:00 a.m. on any day, and additionally between 12:00 p.m. and 3:00 p.m. on schooldays.", 
        "order": 5 
      }, 
      { 
        "certification": "MA15+", 
        "meaning": "Not suitable for children and teens under 15; MA15+-rated programming may only be broadcast between 9:00 p.m. and 5:00 a.m. on any given day. Consumer advice is mandatory. Some R18+ rated movies on DVD/Blu-ray are often re-edited on free TV/cable channels to secure a more \"appropriate\" MA15+ rating. Some movies that were rated R18 on DVD have since been aired in Australian TV with MA15+ rating.", 
        "order": 6 
      }, 
      { 
        "certification": "AV15+", 
        "meaning": "Not suitable for children and teens under 15; this is the same as the MA15+ rating, except the \"AV\" stands for \"Adult Violence\" meaning that anything that is Classified \"MA15+\" with the consumer advice \"Frequent Violence\" or \"Strong Violence\" will automatically become AV15+ (with that same consumer advice.) The AV rating is still allowed to exceed any MA15+ content, in particular – 'Violence'. AV15+ content may only be broadcast between 9:30 p.m. and 5:00 a.m. on any day. Consumer advice is mandatory.", 
        "order": 7 
      }, 
      { 
        "certification": "R18+", 
        "meaning": "Not for children under 18; this is limited to Adult \"Pay Per View\" VC 196 and 197. Content may include graphic violence, sexual situations, coarse language and explicit drug use.", 
        "order": 8 
      } 
    ], 
    "FR": [ 
      { 
        "certification": "NR", 
        "meaning": "No rating information.", 
        "order": 0 
      }, 
      { 
        "certification": "10", 
        "meaning": "Not recommended for children under 10. Not allowed in children's television series.", 
        "order": 1 
      }, 
      { 
        "certification": "12", 
        "meaning": "Not recommended for children under 12. Not allowed air before 10:00 p.m. Some channels and programs are subject to exception.", 
        "order": 2 
      }, 
      { 
        "certification": "16", 
        "meaning": "Not recommended for children under 16. Not allowed air before 10:30 p.m. Some channels and programs are subject to exception.", 
        "order": 3 
      }, 
      { 
        "certification": "18", 
        "meaning": "Not recommended for persons under 18. Allowed between midnight and 5 a.m. and only in some channels, access to these programs is locked by a personal password.", 
        "order": 4 
      } 
    ], 
    "DE": [ 
      { 
        "certification": "0", 
        "meaning": "Can be aired at any time.", 
        "order": 0 
      }, 
      { 
        "certification": "6", 
        "meaning": "Can be aired at any time.", 
        "order": 1 
      }, 
      { 
        "certification": "12", 
        "meaning": "The broadcaster must take the decision about the air time by taking in consideration the impact on young children in the timeframe from 6:00am to 8:00pm.", 
        "order": 2 
      }, 
      { 
        "certification": "16", 
        "meaning": "Can be aired only from 10:00pm Uhr to 6:00am.", 
        "order": 3 
      }, 
      { 
        "certification": "18", 
        "meaning": "Can be aired only from 11:00pm Uhr to 6:00am.", 
        "order": 4 
      } 
    ], 
    "TH": [ 
      { 
        "certification": "ส", 
        "meaning": "Sor - Educational movies which the public should be encouraged to see.", 
        "order": 0 
      }, 
      { 
        "certification": "ท", 
        "meaning": "Tor - G Movies appropriate for the general public. No sex, abusive language or violence.", 
        "order": 1 
      }, 
      { 
        "certification": "น 13+", 
        "meaning": "Nor 13+ Movies appropriate for audiences aged 13 and older.", 
        "order": 2 
      }, 
      { 
        "certification": "น 15+", 
        "meaning": "Nor 15+ Movies appropriate for audiences aged 15 and older. Some violence, brutality, inhumanity, bad language or indecent gestures allowed.", 
        "order": 3 
      }, 
      { 
        "certification": "น 18+", 
        "meaning": "Nor 18+ Movies appropriate for audiences aged 18 and older.", 
        "order": 4 
      }, 
      { 
        "certification": "ฉ 20-", 
        "meaning": "Chor 20 - Movies prohibited for audiences aged below 20.", 
        "order": 5 
      }, 
      { 
        "certification": "-", 
        "meaning": "Banned.", 
        "order": 6 
      } 
    ], 
    "KR": [ 
      { 
        "certification": "Exempt", 
        "meaning": "This rating is only for knowledge based game shows; lifestyle shows; documentary shows; news; current topic discussion shows; education/culture shows; sports that excludes MMA or other violent sports; and other programs that Korea Communications Standards Commission recognizes.", 
        "order": 0 
      }, 
      { 
        "certification": "ALL", 
        "meaning": "This rating is for programming that is appropriate for all ages. This program usually involves programs designed for children or families.", 
        "order": 1 
      }, 
      { 
        "certification": "7", 
        "meaning": "This rating is for programming that may contain material inappropriate for children younger than 7, and parental discretion should be used. Some cartoon programming not deemed strictly as \"educational\", and films rated \"G\" or \"PG\" in North America may fall into the 7 category.", 
        "order": 2 
      }, 
      { 
        "certification": "12", 
        "meaning": "This rating is for programs that may deemed inappropriate for those younger than 12, and parental discretion should be used. Usually used for animations that have stronger themes or violence then those designed for children, or for reality shows that have mild violence, themes, or language.", 
        "order": 3 
      }, 
      { 
        "certification": "15", 
        "meaning": "This rating is for programs that contain material that may be inappropriate for children under 15, and that parental discretion should be used. Examples include most dramas, and talk shows on OTA (over-the-air) TV (KBS, MBC, SBS), and many American TV shows/dramas on Cable TV channels like OCN and OnStyle. The programs that have this rating may include moderate or strong adult themes, language, sexual inference, and violence. As with the TV-MA rating in North America, this rating is commonly applied to live events where the occurrence of inappropriate dialogue is unpredictable. Since 2007, this rating is the most used rating for TV.", 
        "order": 4 
      }, 
      { 
        "certification": "19", 
        "meaning": "This rating is for programs that are intended for adults only. 19-rated programming cannot air during the hours of 7:00AM to 9:00AM, and 1:00PM to 10:00PM. Programmes that receive this rating will almost certainly have adult themes, sexual situations, frequent use of strong language and disturbing scenes of violence.", 
        "order": 5 
      } 
    ], 
    "GB": [ 
      { 
        "certification": "U", 
        "meaning": "The U symbol stands for Universal. A U film should be suitable for audiences aged four years and over.", 
        "order": 0 
      }, 
      { 
        "certification": "PG", 
        "meaning": "PG stands for Parental Guidance. This means a film is suitable for general viewing, but some scenes may be unsuitable for young children. A PG film should not unsettle a child aged around eight or older.", 
        "order": 1 
      }, 
      { 
        "certification": "12A", 
        "meaning": "Films classified 12A and video works classified 12 contain material that is not generally suitable for children aged under 12. 12A requires an adult to accompany any child under 12 seeing a 12A film at the cinema.", 
        "order": 2 
      }, 
      { 
        "certification": "12", 
        "meaning": "Films classified 12A and video works classified 12 contain material that is not generally suitable for children aged under 12.", 
        "order": 3 
      }, 
      { 
        "certification": "15", 
        "meaning": "No-one under 15 is allowed to see a 15 film at the cinema or buy/rent a 15 rated video. 15 rated works are not suitable for children under 15 years of age.", 
        "order": 4 
      }, 
      { 
        "certification": "18", 
        "meaning": "Films rated 18 are for adults. No-one under 18 is allowed to see an 18 film at the cinema or buy / rent an 18 rated video. No 18 rated works are suitable for children.", 
        "order": 5 
      }, 
      { 
        "certification": "R18", 
        "meaning": "The R18 category is a special and legally-restricted classification primarily for explicit works of consenting sex or strong fetish material involving adults.", 
        "order": 6 
      } 
    ], 
    "BR": [ 
      { 
        "certification": "L", 
        "meaning": "Content is suitable for all audiences.", 
        "order": 0 
      }, 
      { 
        "certification": "10", 
        "meaning": "Content suitable for viewers over the age of 10.", 
        "order": 1 
      }, 
      { 
        "certification": "12", 
        "meaning": "Content suitable for viewers over the age of 12.", 
        "order": 2 
      }, 
      { 
        "certification": "14", 
        "meaning": "Content suitable for viewers over the age of 14.", 
        "order": 3 
      }, 
      { 
        "certification": "16", 
        "meaning": "Content suitable for viewers over the age of 16.", 
        "order": 4 
      }, 
      { 
        "certification": "18", 
        "meaning": "Content suitable for viewers over the age of 18.", 
        "order": 5 
      } 
    ] 
  } 
} 

Get Movie Change List 

{ 
  "results": [ 
    { 
      "id": 412683, 
      "adult": false 
    }, 
    { 
      "id": 412685, 
      "adult": false 
    }, 
    { 
      "id": 75258, 
      "adult": false 
    }, 
    { 
      "id": 60308, 
      "adult": false 
    }, 
    { 
      "id": 314851, 
      "adult": false 
    }, 
    { 
      "id": 224076, 
      "adult": false 
    }, 
    { 
      "id": 412684, 
      "adult": false 
    }, 
    { 
      "id": 412686, 
      "adult": false 
    }, 
    { 
      "id": 412687, 
      "adult": false 
    }, 
    { 
      "id": 309063, 
      "adult": false 
    }, 
    { 
      "id": 357201, 
      "adult": false 
    }, 
    { 
      "id": 412660, 
      "adult": false 
    }, 
    { 
      "id": 412689, 
      "adult": false 
    }, 
    { 
      "id": 197583, 
      "adult": false 
    }, 
    { 
      "id": 412690, 
      "adult": false 
    }, 
    { 
      "id": 412691, 
      "adult": false 
    }, 
    { 
      "id": 412692, 
      "adult": false 
    }, 
    { 
      "id": 333373, 
      "adult": false 
    }, 
    { 
      "id": 214761, 
      "adult": false 
    }, 
    { 
      "id": 412693, 
      "adult": false 
    }, 
    { 
      "id": 54990, 
      "adult": false 
    }, 
    { 
      "id": 392620, 
      "adult": false 
    }, 
    { 
      "id": 2087, 
      "adult": false 
    }, 
    { 
      "id": 412694, 
      "adult": false 
    }, 
    { 
      "id": 2649, 
      "adult": false 
    }, 
    { 
      "id": 348537, 
      "adult": false 
    }, 
    { 
      "id": 371865, 
      "adult": false 
    }, 
    { 
      "id": 368374, 
      "adult": false 
    }, 
    { 
      "id": 10747, 
      "adult": false 
    }, 
    { 
      "id": 412695, 
      "adult": false 
    }, 
    { 
      "id": 283418, 
      "adult": false 
    }, 
    { 
      "id": 271686, 
      "adult": false 
    }, 
    { 
      "id": 412696, 
      "adult": false 
    }, 
    { 
      "id": 141021, 
      "adult": false 
    }, 
    { 
      "id": 404439, 
      "adult": false 
    }, 
    { 
      "id": 412698, 
      "adult": false 
    }, 
    { 
      "id": 402331, 
      "adult": false 
    }, 
    { 
      "id": 412699, 
      "adult": false 
    }, 
    { 
      "id": 1285, 
      "adult": false 
    }, 
    { 
      "id": 19214, 
      "adult": false 
    }, 
    { 
      "id": 258034, 
      "adult": false 
    }, 
    { 
      "id": 161838, 
      "adult": false 
    }, 
    { 
      "id": 130774, 
      "adult": false 
    }, 
    { 
      "id": 412700, 
      "adult": false 
    }, 
    { 
      "id": 412701, 
      "adult": false 
    }, 
    { 
      "id": 412702, 
      "adult": false 
    }, 
    { 
      "id": 412703, 
      "adult": false 
    }, 
    { 
      "id": 10972, 
      "adult": false 
    }, 
    { 
      "id": 236215, 
      "adult": false 
    }, 
    { 
      "id": 499, 
      "adult": false 
    }, 
    { 
      "id": 2047, 
      "adult": false 
    }, 
    { 
      "id": 407825, 
      "adult": false 
    }, 
    { 
      "id": 32220, 
      "adult": false 
    }, 
    { 
      "id": 410209, 
      "adult": false 
    }, 
    { 
      "id": 412704, 
      "adult": false 
    }, 
    { 
      "id": 411735, 
      "adult": false 
    }, 
    { 
      "id": 412705, 
      "adult": false 
    }, 
    { 
      "id": 3549, 
      "adult": false 
    }, 
    { 
      "id": 393877, 
      "adult": false 
    }, 
    { 
      "id": 412706, 
      "adult": false 
    }, 
    { 
      "id": 49026, 
      "adult": false 
    }, 
    { 
      "id": 290762, 
      "adult": false 
    }, 
    { 
      "id": 1124, 
      "adult": false 
    }, 
    { 
      "id": 26271, 
      "adult": false 
    }, 
    { 
      "id": 408, 
      "adult": false 
    }, 
    { 
      "id": 412707, 
      "adult": false 
    }, 
    { 
      "id": 3043, 
      "adult": false 
    }, 
    { 
      "id": 11353, 
      "adult": false 
    }, 
    { 
      "id": 40095, 
      "adult": false 
    }, 
    { 
      "id": 71579, 
      "adult": false 
    }, 
    { 
      "id": 412708, 
      "adult": false 
    }, 
    { 
      "id": 262463, 
      "adult": false 
    }, 
    { 
      "id": 43360, 
      "adult": false 
    }, 
    { 
      "id": 368188, 
      "adult": false 
    }, 
    { 
      "id": 59117, 
      "adult": false 
    }, 
    { 
      "id": 412709, 
      "adult": false 
    }, 
    { 
      "id": 399406, 
      "adult": false 
    }, 
    { 
      "id": 392572, 
      "adult": false 
    }, 
    { 
      "id": 397503, 
      "adult": false 
    }, 
    { 
      "id": 267852, 
      "adult": false 
    }, 
    { 
      "id": 412710, 
      "adult": false 
    }, 
    { 
      "id": 412711, 
      "adult": false 
    }, 
    { 
      "id": 412712, 
      "adult": false 
    }, 
    { 
      "id": 53342, 
      "adult": false 
    }, 
    { 
      "id": 412713, 
      "adult": false 
    }, 
    { 
      "id": 1284, 
      "adult": false 
    }, 
    { 
      "id": 1283, 
      "adult": false 
    }, 
    { 
      "id": 2019, 
      "adult": false 
    }, 
    { 
      "id": 412714, 
      "adult": false 
    }, 
    { 
      "id": 352179, 
      "adult": false 
    }, 
    { 
      "id": 412715, 
      "adult": false 
    }, 
    { 
      "id": 336265, 
      "adult": false 
    }, 
    { 
      "id": 412716, 
      "adult": false 
    }, 
    { 
      "id": 358881, 
      "adult": false 
    }, 
    { 
      "id": 254869, 
      "adult": false 
    }, 
    { 
      "id": 86822, 
      "adult": false 
    }, 
    { 
      "id": 73420, 
      "adult": false 
    }, 
    { 
      "id": 412717, 
      "adult": false 
    }, 
    { 
      "id": 82386, 
      "adult": false 
    }, 
    { 
      "id": 412718, 
      "adult": false 
    } 
  ], 
  "page": 1, 
  "total_pages": 10, 
  "total_results": 952 
} 

Get TV Change List 

{ 
  "results": [ 
    { 
      "id": 412683, 
      "adult": false 
    }, 
    { 
      "id": 412685, 
      "adult": false 
    }, 
    { 
      "id": 75258, 
      "adult": false 
    }, 
    { 
      "id": 60308, 
      "adult": false 
    }, 
    { 
      "id": 314851, 
      "adult": false 
    }, 
    { 
      "id": 224076, 
      "adult": false 
    }, 
    { 
      "id": 412684, 
      "adult": false 
    }, 
    { 
      "id": 412686, 
      "adult": false 
    }, 
    { 
      "id": 412687, 
      "adult": false 
    }, 
    { 
      "id": 309063, 
      "adult": false 
    }, 
    { 
      "id": 357201, 
      "adult": false 
    }, 
    { 
      "id": 412660, 
      "adult": false 
    }, 
    { 
      "id": 412689, 
      "adult": false 
    }, 
    { 
      "id": 197583, 
      "adult": false 
    }, 
    { 
      "id": 412690, 
      "adult": false 
    }, 
    { 
      "id": 412691, 
      "adult": false 
    }, 
    { 
      "id": 412692, 
      "adult": false 
    }, 
    { 
      "id": 333373, 
      "adult": false 
    }, 
    { 
      "id": 214761, 
      "adult": false 
    }, 
    { 
      "id": 412693, 
      "adult": false 
    }, 
    { 
      "id": 54990, 
      "adult": false 
    }, 
    { 
      "id": 392620, 
      "adult": false 
    }, 
    { 
      "id": 2087, 
      "adult": false 
    }, 
    { 
      "id": 412694, 
      "adult": false 
    }, 
    { 
      "id": 2649, 
      "adult": false 
    }, 
    { 
      "id": 348537, 
      "adult": false 
    }, 
    { 
      "id": 371865, 
      "adult": false 
    }, 
    { 
      "id": 368374, 
      "adult": false 
    }, 
    { 
      "id": 10747, 
      "adult": false 
    }, 
    { 
      "id": 412695, 
      "adult": false 
    }, 
    { 
      "id": 283418, 
      "adult": false 
    }, 
    { 
      "id": 271686, 
      "adult": false 
    }, 
    { 
      "id": 412696, 
      "adult": false 
    }, 
    { 
      "id": 141021, 
      "adult": false 
    }, 
    { 
      "id": 404439, 
      "adult": false 
    }, 
    { 
      "id": 412698, 
      "adult": false 
    }, 
    { 
      "id": 402331, 
      "adult": false 
    }, 
    { 
      "id": 412699, 
      "adult": false 
    }, 
    { 
      "id": 1285, 
      "adult": false 
    }, 
    { 
      "id": 19214, 
      "adult": false 
    }, 
    { 
      "id": 258034, 
      "adult": false 
    }, 
    { 
      "id": 161838, 
      "adult": false 
    }, 
    { 
      "id": 130774, 
      "adult": false 
    }, 
    { 
      "id": 412700, 
      "adult": false 
    }, 
    { 
      "id": 412701, 
      "adult": false 
    }, 
    { 
      "id": 412702, 
      "adult": false 
    }, 
    { 
      "id": 412703, 
      "adult": false 
    }, 
    { 
      "id": 10972, 
      "adult": false 
    }, 
    { 
      "id": 236215, 
      "adult": false 
    }, 
    { 
      "id": 499, 
      "adult": false 
    }, 
    { 
      "id": 2047, 
      "adult": false 
    }, 
    { 
      "id": 407825, 
      "adult": false 
    }, 
    { 
      "id": 32220, 
      "adult": false 
    }, 
    { 
      "id": 410209, 
      "adult": false 
    }, 
    { 
      "id": 412704, 
      "adult": false 
    }, 
    { 
      "id": 411735, 
      "adult": false 
    }, 
    { 
      "id": 412705, 
      "adult": false 
    }, 
    { 
      "id": 3549, 
      "adult": false 
    }, 
    { 
      "id": 393877, 
      "adult": false 
    }, 
    { 
      "id": 412706, 
      "adult": false 
    }, 
    { 
      "id": 49026, 
      "adult": false 
    }, 
    { 
      "id": 290762, 
      "adult": false 
    }, 
    { 
      "id": 1124, 
      "adult": false 
    }, 
    { 
      "id": 26271, 
      "adult": false 
    }, 
    { 
      "id": 408, 
      "adult": false 
    }, 
    { 
      "id": 412707, 
      "adult": false 
    }, 
    { 
      "id": 3043, 
      "adult": false 
    }, 
    { 
      "id": 11353, 
      "adult": false 
    }, 
    { 
      "id": 40095, 
      "adult": false 
    }, 
    { 
      "id": 71579, 
      "adult": false 
    }, 
    { 
      "id": 412708, 
      "adult": false 
    }, 
    { 
      "id": 262463, 
      "adult": false 
    }, 
    { 
      "id": 43360, 
      "adult": false 
    }, 
    { 
      "id": 368188, 
      "adult": false 
    }, 
    { 
      "id": 59117, 
      "adult": false 
    }, 
    { 
      "id": 412709, 
      "adult": false 
    }, 
    { 
      "id": 399406, 
      "adult": false 
    }, 
    { 
      "id": 392572, 
      "adult": false 
    }, 
    { 
      "id": 397503, 
      "adult": false 
    }, 
    { 
      "id": 267852, 
      "adult": false 
    }, 
    { 
      "id": 412710, 
      "adult": false 
    }, 
    { 
      "id": 412711, 
      "adult": false 
    }, 
    { 
      "id": 412712, 
      "adult": false 
    }, 
    { 
      "id": 53342, 
      "adult": false 
    }, 
    { 
      "id": 412713, 
      "adult": false 
    }, 
    { 
      "id": 1284, 
      "adult": false 
    }, 
    { 
      "id": 1283, 
      "adult": false 
    }, 
    { 
      "id": 2019, 
      "adult": false 
    }, 
    { 
      "id": 412714, 
      "adult": false 
    }, 
    { 
      "id": 352179, 
      "adult": false 
    }, 
    { 
      "id": 412715, 
      "adult": false 
    }, 
    { 
      "id": 336265, 
      "adult": false 
    }, 
    { 
      "id": 412716, 
      "adult": false 
    }, 
    { 
      "id": 358881, 
      "adult": false 
    }, 
    { 
      "id": 254869, 
      "adult": false 
    }, 
    { 
      "id": 86822, 
      "adult": false 
    }, 
    { 
      "id": 73420, 
      "adult": false 
    }, 
    { 
      "id": 412717, 
      "adult": false 
    }, 
    { 
      "id": 82386, 
      "adult": false 
    }, 
    { 
      "id": 412718, 
      "adult": false 
    } 
  ], 
  "page": 1, 
  "total_pages": 10, 
  "total_results": 952 
} 

Get Perso Change List 

{ 
  "results": [ 
    { 
      "id": 1670120, 
      "adult": false 
    }, 
    { 
      "id": 1670121, 
      "adult": false 
    }, 
    { 
      "id": 1670122, 
      "adult": false 
    }, 
    { 
      "id": 1670123, 
      "adult": false 
    }, 
    { 
      "id": 1670124, 
      "adult": false 
    }, 
    { 
      "id": 1670125, 
      "adult": false 
    }, 
    { 
      "id": 123476, 
      "adult": false 
    }, 
    { 
      "id": 1670126, 
      "adult": false 
    }, 
    { 
      "id": 93069, 
      "adult": false 
    }, 
    { 
      "id": 1670127, 
      "adult": false 
    }, 
    { 
      "id": 1670128, 
      "adult": false 
    }, 
    { 
      "id": 1061663, 
      "adult": false 
    }, 
    { 
      "id": 1363741, 
      "adult": false 
    }, 
    { 
      "id": 1670129, 
      "adult": false 
    }, 
    { 
      "id": 1670130, 
      "adult": false 
    }, 
    { 
      "id": 1670131, 
      "adult": false 
    }, 
    { 
      "id": 1670132, 
      "adult": false 
    }, 
    { 
      "id": 1670133, 
      "adult": false 
    }, 
    { 
      "id": 1670134, 
      "adult": false 
    }, 
    { 
      "id": 96529, 
      "adult": false 
    }, 
    { 
      "id": 1214234, 
      "adult": false 
    }, 
    { 
      "id": 1670135, 
      "adult": false 
    }, 
    { 
      "id": 1670136, 
      "adult": false 
    }, 
    { 
      "id": 1670137, 
      "adult": false 
    }, 
    { 
      "id": 1670138, 
      "adult": false 
    }, 
    { 
      "id": 1670139, 
      "adult": false 
    }, 
    { 
      "id": 1670140, 
      "adult": false 
    }, 
    { 
      "id": 1670141, 
      "adult": false 
    }, 
    { 
      "id": 1670142, 
      "adult": false 
    }, 
    { 
      "id": 1670143, 
      "adult": false 
    }, 
    { 
      "id": 1670144, 
      "adult": false 
    }, 
    { 
      "id": 1670145, 
      "adult": false 
    }, 
    { 
      "id": 1670146, 
      "adult": false 
    }, 
    { 
      "id": 1670147, 
      "adult": false 
    }, 
    { 
      "id": 1670148, 
      "adult": false 
    }, 
    { 
      "id": 1670149, 
      "adult": false 
    }, 
    { 
      "id": 1670150, 
      "adult": false 
    }, 
    { 
      "id": 1670151, 
      "adult": false 
    }, 
    { 
      "id": 1110505, 
      "adult": false 
    }, 
    { 
      "id": 1670152, 
      "adult": false 
    }, 
    { 
      "id": 1670153, 
      "adult": false 
    }, 
    { 
      "id": 1621789, 
      "adult": false 
    }, 
    { 
      "id": 1670154, 
      "adult": false 
    }, 
    { 
      "id": 135434, 
      "adult": false 
    }, 
    { 
      "id": 1670155, 
      "adult": false 
    }, 
    { 
      "id": 1670156, 
      "adult": false 
    }, 
    { 
      "id": 1670157, 
      "adult": false 
    }, 
    { 
      "id": 1410725, 
      "adult": false 
    }, 
    { 
      "id": 205937, 
      "adult": false 
    }, 
    { 
      "id": 106278, 
      "adult": false 
    }, 
    { 
      "id": 1670158, 
      "adult": false 
    }, 
    { 
      "id": 15443, 
      "adult": false 
    }, 
    { 
      "id": 1670159, 
      "adult": false 
    }, 
    { 
      "id": 79651, 
      "adult": false 
    }, 
    { 
      "id": 1427212, 
      "adult": false 
    }, 
    { 
      "id": 183048, 
      "adult": false 
    }, 
    { 
      "id": 1423073, 
      "adult": false 
    }, 
    { 
      "id": 1128416, 
      "adult": false 
    }, 
    { 
      "id": 1670160, 
      "adult": false 
    }, 
    { 
      "id": 123456, 
      "adult": false 
    }, 
    { 
      "id": 1042160, 
      "adult": false 
    }, 
    { 
      "id": 1268136, 
      "adult": false 
    }, 
    { 
      "id": 1230315, 
      "adult": false 
    }, 
    { 
      "id": 228875, 
      "adult": false 
    }, 
    { 
      "id": 48928, 
      "adult": false 
    }, 
    { 
      "id": 80232, 
      "adult": false 
    }, 
    { 
      "id": 228876, 
      "adult": false 
    }, 
    { 
      "id": 212480, 
      "adult": false 
    }, 
    { 
      "id": 1670161, 
      "adult": false 
    }, 
    { 
      "id": 1670162, 
      "adult": false 
    }, 
    { 
      "id": 228877, 
      "adult": false 
    }, 
    { 
      "id": 228879, 
      "adult": false 
    }, 
    { 
      "id": 947283, 
      "adult": false 
    }, 
    { 
      "id": 1094471, 
      "adult": false 
    }, 
    { 
      "id": 1025909, 
      "adult": false 
    }, 
    { 
      "id": 228880, 
      "adult": false 
    }, 
    { 
      "id": 1670163, 
      "adult": false 
    }, 
    { 
      "id": 1670164, 
      "adult": false 
    }, 
    { 
      "id": 1670165, 
      "adult": false 
    }, 
    { 
      "id": 1213599, 
      "adult": false 
    }, 
    { 
      "id": 1670166, 
      "adult": false 
    }, 
    { 
      "id": 1093951, 
      "adult": false 
    }, 
    { 
      "id": 1423066, 
      "adult": false 
    }, 
    { 
      "id": 1263988, 
      "adult": false 
    }, 
    { 
      "id": 1670167, 
      "adult": false 
    }, 
    { 
      "id": 1670168, 
      "adult": false 
    }, 
    { 
      "id": 1670169, 
      "adult": false 
    }, 
    { 
      "id": 1670170, 
      "adult": false 
    }, 
    { 
      "id": 1423064, 
      "adult": false 
    }, 
    { 
      "id": 1291602, 
      "adult": false 
    }, 
    { 
      "id": 1093955, 
      "adult": false 
    }, 
    { 
      "id": 1423069, 
      "adult": false 
    }, 
    { 
      "id": 1670171, 
      "adult": false 
    }, 
    { 
      "id": 1670172, 
      "adult": false 
    }, 
    { 
      "id": 1670173, 
      "adult": false 
    }, 
    { 
      "id": 1670174, 
      "adult": false 
    }, 
    { 
      "id": 1670175, 
      "adult": false 
    }, 
    { 
      "id": 1670176, 
      "adult": false 
    }, 
    { 
      "id": 1670177, 
      "adult": false 
    }, 
    { 
      "id": 1670178, 
      "adult": false 
    } 
  ], 
  "page": 1, 
  "total_pages": 7, 
  "total_results": 620 
} 

Get Details 

{ 
  "id": 10, 
  "name": "Star Wars Collection", 
  "overview": "An epic space opera theatrical film series created by George Lucas.\r The first film in the franchise was originally released on May 25, 1977, by 20th Century Fox, and became a worldwide pop culture  phenomenon, followed by two sequels, released at three-year intervals. Sixteen years after the release of the trilogy's final film, the first in a new prequel trilogy of films was released, again released at three-year intervals, with the final film released on May 19, 2005.", 
  "poster_path": null, 
  "backdrop_path": "/shDFE0i7josMt9IKXdYpnMFFgNV.jpg", 
  "parts": [ 
    { 
      "adult": false, 
      "backdrop_path": null, 
      "genre_ids": [ 
        12 
      ], 
      "id": 11, 
      "original_language": "en", 
      "original_title": "Star Wars: Episode IV - A New Hope", 
      "overview": "Princess Leia is captured and held hostage by the evil Imperial forces in their effort to take over the galactic Empire. Venturesome Luke Skywalker and dashing captain Han Solo team together with the loveable robot duo R2-D2 and C-3PO to rescue the beautiful princess and restore peace and justice in the Empire.", 
      "release_date": "1977-05-23", 
      "poster_path": "/AbJBXaVPrdXROwb8KmgWUPU2XJX.jpg", 
      "popularity": 1.411624, 
      "title": "Star Wars: Episode IV - A New Hope", 
      "video": false, 
      "vote_average": 7.7, 
      "vote_count": 2472 
    } 
  ] 
} 

Get Images 

{ 
  "id": 10, 
  "backdrops": [ 
    { 
      "aspect_ratio": 1.77777777777778, 
      "file_path": "/shDFE0i7josMt9IKXdYpnMFFgNV.jpg", 
      "height": 1080, 
      "iso_639_1": null, 
      "vote_average": 5.3125, 
      "vote_count": 1, 
      "width": 1920 
    } 
  ], 
  "posters": [ 
    { 
      "aspect_ratio": 0.666666666666667, 
      "file_path": "/hznxm4di88tWJHiCGWYDXeKk1Ih.jpg", 
      "height": 1500, 
      "iso_639_1": "en", 
      "vote_average": 5.3125, 
      "vote_count": 1, 
      "width": 1000 
    } 
  ] 
} 

Get Translations 

{ 
  "id": 10, 
  "backdrops": [ 
    { 
      "aspect_ratio": 1.77777777777778, 
      "file_path": "/shDFE0i7josMt9IKXdYpnMFFgNV.jpg", 
      "height": 1080, 
      "iso_639_1": null, 
      "vote_average": 5.3125, 
      "vote_count": 1, 
      "width": 1920 
    } 
  ], 
  "posters": [ 
    { 
      "aspect_ratio": 0.666666666666667, 
      "file_path": "/hznxm4di88tWJHiCGWYDXeKk1Ih.jpg", 
      "height": 1500, 
      "iso_639_1": "en", 
      "vote_average": 5.3125, 
      "vote_count": 1, 
      "width": 1000 
    } 
  ] 
} 

Get Details 

{ 
  "description": "", 
  "headquarters": "San Francisco, California, United States", 
  "homepage": "http://www.lucasfilm.com", 
  "id": 1, 
  "logo_path": "/o86DbpburjxrqAzEDhXZcyE8pDb.png", 
  "name": "Lucasfilm", 
  "origin_country": "US", 
  "parent_company": null 
} 

Get Alternative Names 

{ 
  "id": 3, 
  "results": [ 
    { 
      "name": "Pixar Animation Studios", 
      "type": "" 
    } 
  ] 
} 

Get Images 

{ 
  "id": 1, 
  "logos": [ 
    { 
      "aspect_ratio": 2.97979797979798, 
      "file_path": "/o86DbpburjxrqAzEDhXZcyE8pDb.png", 
      "height": 99, 
      "id": "5aa080d6c3a3683fea00011e", 
      "file_type": ".svg", 
      "vote_average": 0, 
      "vote_count": 0, 
      "width": 295 
    } 
  ] 
} 

Get API Configuration 

{ 
  "images": { 
    "base_url": "http://image.tmdb.org/t/p/", 
    "secure_base_url": "https://image.tmdb.org/t/p/", 
    "backdrop_sizes": [ 
      "w300", 
      "w780", 
      "w1280", 
      "original" 
    ], 
    "logo_sizes": [ 
      "w45", 
      "w92", 
      "w154", 
      "w185", 
      "w300", 
      "w500", 
      "original" 
    ], 
    "poster_sizes": [ 
      "w92", 
      "w154", 
      "w185", 
      "w342", 
      "w500", 
      "w780", 
      "original" 
    ], 
    "profile_sizes": [ 
      "w45", 
      "w185", 
      "h632", 
      "original" 
    ], 
    "still_sizes": [ 
      "w92", 
      "w185", 
      "w300", 
      "original" 
    ] 
  }, 
  "change_keys": [ 
    "adult", 
    "air_date", 
    "also_known_as", 
    "alternative_titles", 
    "biography", 
    "birthday", 
    "budget", 
    "cast", 
    "certifications", 
    "character_names", 
    "created_by", 
    "crew", 
    "deathday", 
    "episode", 
    "episode_number", 
    "episode_run_time", 
    "freebase_id", 
    "freebase_mid", 
    "general", 
    "genres", 
    "guest_stars", 
    "homepage", 
    "images", 
    "imdb_id", 
    "languages", 
    "name", 
    "network", 
    "origin_country", 
    "original_name", 
    "original_title", 
    "overview", 
    "parts", 
    "place_of_birth", 
    "plot_keywords", 
    "production_code", 
    "production_companies", 
    "production_countries", 
    "releases", 
    "revenue", 
    "runtime", 
    "season", 
    "season_number", 
    "season_regular", 
    "spoken_languages", 
    "status", 
    "tagline", 
    "title", 
    "translations", 
    "tvdb_id", 
    "tvrage_id", 
    "type", 
    "video", 
    "videos" 
  ] 
} 

Get  Countries 

[ 
  { 
    "iso_3166_1": "AD", 
    "english_name": "Andorra" 
  }, 
  { 
    "iso_3166_1": "AE", 
    "english_name": "United Arab Emirates" 
  }, 
  { 
    "iso_3166_1": "AF", 
    "english_name": "Afghanistan" 
  }, 
  { 
    "iso_3166_1": "AG", 
    "english_name": "Antigua and Barbuda" 
  }, 
  { 
    "iso_3166_1": "AI", 
    "english_name": "Anguilla" 
  }, 
  { 
    "iso_3166_1": "AL", 
    "english_name": "Albania" 
  }, 
  { 
    "iso_3166_1": "AM", 
    "english_name": "Armenia" 
  }, 
  { 
    "iso_3166_1": "AN", 
    "english_name": "Netherlands Antilles" 
  }, 
  { 
    "iso_3166_1": "AO", 
    "english_name": "Angola" 
  }, 
  { 
    "iso_3166_1": "AQ", 
    "english_name": "Antarctica" 
  }, 
  { 
    "iso_3166_1": "AR", 
    "english_name": "Argentina" 
  }, 
  { 
    "iso_3166_1": "AS", 
    "english_name": "American Samoa" 
  }, 
  { 
    "iso_3166_1": "AT", 
    "english_name": "Austria" 
  }, 
  { 
    "iso_3166_1": "AU", 
    "english_name": "Australia" 
  }, 
  { 
    "iso_3166_1": "AW", 
    "english_name": "Aruba" 
  }, 
  { 
    "iso_3166_1": "AZ", 
    "english_name": "Azerbaijan" 
  }, 
  { 
    "iso_3166_1": "BA", 
    "english_name": "Bosnia and Herzegovina" 
  }, 
  { 
    "iso_3166_1": "BB", 
    "english_name": "Barbados" 
  }, 
  { 
    "iso_3166_1": "BD", 
    "english_name": "Bangladesh" 
  }, 
  { 
    "iso_3166_1": "BE", 
    "english_name": "Belgium" 
  }, 
  { 
    "iso_3166_1": "BF", 
    "english_name": "Burkina Faso" 
  }, 
  { 
    "iso_3166_1": "BG", 
    "english_name": "Bulgaria" 
  }, 
  { 
    "iso_3166_1": "BH", 
    "english_name": "Bahrain" 
  }, 
  { 
    "iso_3166_1": "BI", 
    "english_name": "Burundi" 
  }, 
  { 
    "iso_3166_1": "BJ", 
    "english_name": "Benin" 
  }, 
  { 
    "iso_3166_1": "BM", 
    "english_name": "Bermuda" 
  }, 
  { 
    "iso_3166_1": "BN", 
    "english_name": "Brunei Darussalam" 
  }, 
  { 
    "iso_3166_1": "BO", 
    "english_name": "Bolivia" 
  }, 
  { 
    "iso_3166_1": "BR", 
    "english_name": "Brazil" 
  }, 
  { 
    "iso_3166_1": "BS", 
    "english_name": "Bahamas" 
  }, 
  { 
    "iso_3166_1": "BT", 
    "english_name": "Bhutan" 
  }, 
  { 
    "iso_3166_1": "BV", 
    "english_name": "Bouvet Island" 
  }, 
  { 
    "iso_3166_1": "BW", 
    "english_name": "Botswana" 
  }, 
  { 
    "iso_3166_1": "BZ", 
    "english_name": "Belize" 
  }, 
  { 
    "iso_3166_1": "BY", 
    "english_name": "Belarus" 
  }, 
  { 
    "iso_3166_1": "CA", 
    "english_name": "Canada" 
  }, 
  { 
    "iso_3166_1": "CC", 
    "english_name": "Cocos Islands" 
  }, 
  { 
    "iso_3166_1": "CD", 
    "english_name": "Congo" 
  }, 
  { 
    "iso_3166_1": "CF", 
    "english_name": "Central African Republic" 
  }, 
  { 
    "iso_3166_1": "CG", 
    "english_name": "Congo" 
  }, 
  { 
    "iso_3166_1": "CH", 
    "english_name": "Switzerland" 
  }, 
  { 
    "iso_3166_1": "CI", 
    "english_name": "Cote D'Ivoire" 
  }, 
  { 
    "iso_3166_1": "CK", 
    "english_name": "Cook Islands" 
  }, 
  { 
    "iso_3166_1": "CL", 
    "english_name": "Chile" 
  }, 
  { 
    "iso_3166_1": "CM", 
    "english_name": "Cameroon" 
  }, 
  { 
    "iso_3166_1": "CN", 
    "english_name": "China" 
  }, 
  { 
    "iso_3166_1": "CO", 
    "english_name": "Colombia" 
  }, 
  { 
    "iso_3166_1": "CR", 
    "english_name": "Costa Rica" 
  }, 
  { 
    "iso_3166_1": "CS", 
    "english_name": "Serbia and Montenegro" 
  }, 
  { 
    "iso_3166_1": "CU", 
    "english_name": "Cuba" 
  }, 
  { 
    "iso_3166_1": "CV", 
    "english_name": "Cape Verde" 
  }, 
  { 
    "iso_3166_1": "CX", 
    "english_name": "Christmas Island" 
  }, 
  { 
    "iso_3166_1": "CY", 
    "english_name": "Cyprus" 
  }, 
  { 
    "iso_3166_1": "CZ", 
    "english_name": "Czech Republic" 
  }, 
  { 
    "iso_3166_1": "DE", 
    "english_name": "Germany" 
  }, 
  { 
    "iso_3166_1": "DJ", 
    "english_name": "Djibouti" 
  }, 
  { 
    "iso_3166_1": "DK", 
    "english_name": "Denmark" 
  }, 
  { 
    "iso_3166_1": "DM", 
    "english_name": "Dominica" 
  }, 
  { 
    "iso_3166_1": "DO", 
    "english_name": "Dominican Republic" 
  }, 
  { 
    "iso_3166_1": "DZ", 
    "english_name": "Algeria" 
  }, 
  { 
    "iso_3166_1": "EC", 
    "english_name": "Ecuador" 
  }, 
  { 
    "iso_3166_1": "EE", 
    "english_name": "Estonia" 
  }, 
  { 
    "iso_3166_1": "EG", 
    "english_name": "Egypt" 
  }, 
  { 
    "iso_3166_1": "EH", 
    "english_name": "Western Sahara" 
  }, 
  { 
    "iso_3166_1": "ER", 
    "english_name": "Eritrea" 
  }, 
  { 
    "iso_3166_1": "ES", 
    "english_name": "Spain" 
  }, 
  { 
    "iso_3166_1": "ET", 
    "english_name": "Ethiopia" 
  }, 
  { 
    "iso_3166_1": "FI", 
    "english_name": "Finland" 
  }, 
  { 
    "iso_3166_1": "FJ", 
    "english_name": "Fiji" 
  }, 
  { 
    "iso_3166_1": "FK", 
    "english_name": "Falkland Islands" 
  }, 
  { 
    "iso_3166_1": "RS", 
    "english_name": "Serbia" 
  }, 
  { 
    "iso_3166_1": "FM", 
    "english_name": "Micronesia" 
  }, 
  { 
    "iso_3166_1": "FO", 
    "english_name": "Faeroe Islands" 
  }, 
  { 
    "iso_3166_1": "FR", 
    "english_name": "France" 
  }, 
  { 
    "iso_3166_1": "GA", 
    "english_name": "Gabon" 
  }, 
  { 
    "iso_3166_1": "GB", 
    "english_name": "United Kingdom" 
  }, 
  { 
    "iso_3166_1": "GD", 
    "english_name": "Grenada" 
  }, 
  { 
    "iso_3166_1": "GE", 
    "english_name": "Georgia" 
  }, 
  { 
    "iso_3166_1": "GF", 
    "english_name": "French Guiana" 
  }, 
  { 
    "iso_3166_1": "GH", 
    "english_name": "Ghana" 
  }, 
  { 
    "iso_3166_1": "GI", 
    "english_name": "Gibraltar" 
  }, 
  { 
    "iso_3166_1": "GL", 
    "english_name": "Greenland" 
  }, 
  { 
    "iso_3166_1": "GM", 
    "english_name": "Gambia" 
  }, 
  { 
    "iso_3166_1": "GN", 
    "english_name": "Guinea" 
  }, 
  { 
    "iso_3166_1": "GP", 
    "english_name": "Guadaloupe" 
  }, 
  { 
    "iso_3166_1": "GQ", 
    "english_name": "Equatorial Guinea" 
  }, 
  { 
    "iso_3166_1": "GR", 
    "english_name": "Greece" 
  }, 
  { 
    "iso_3166_1": "GS", 
    "english_name": "South Georgia and the South Sandwich Islands" 
  }, 
  { 
    "iso_3166_1": "GT", 
    "english_name": "Guatemala" 
  }, 
  { 
    "iso_3166_1": "GU", 
    "english_name": "Guam" 
  }, 
  { 
    "iso_3166_1": "GW", 
    "english_name": "Guinea-Bissau" 
  }, 
  { 
    "iso_3166_1": "GY", 
    "english_name": "Guyana" 
  }, 
  { 
    "iso_3166_1": "HK", 
    "english_name": "Hong Kong" 
  }, 
  { 
    "iso_3166_1": "HM", 
    "english_name": "Heard and McDonald Islands" 
  }, 
  { 
    "iso_3166_1": "HN", 
    "english_name": "Honduras" 
  }, 
  { 
    "iso_3166_1": "HR", 
    "english_name": "Croatia" 
  }, 
  { 
    "iso_3166_1": "HT", 
    "english_name": "Haiti" 
  }, 
  { 
    "iso_3166_1": "HU", 
    "english_name": "Hungary" 
  }, 
  { 
    "iso_3166_1": "ID", 
    "english_name": "Indonesia" 
  }, 
  { 
    "iso_3166_1": "IE", 
    "english_name": "Ireland" 
  }, 
  { 
    "iso_3166_1": "IL", 
    "english_name": "Israel" 
  }, 
  { 
    "iso_3166_1": "IN", 
    "english_name": "India" 
  }, 
  { 
    "iso_3166_1": "IO", 
    "english_name": "British Indian Ocean Territory" 
  }, 
  { 
    "iso_3166_1": "IQ", 
    "english_name": "Iraq" 
  }, 
  { 
    "iso_3166_1": "IR", 
    "english_name": "Iran" 
  }, 
  { 
    "iso_3166_1": "IS", 
    "english_name": "Iceland" 
  }, 
  { 
    "iso_3166_1": "IT", 
    "english_name": "Italy" 
  }, 
  { 
    "iso_3166_1": "JM", 
    "english_name": "Jamaica" 
  }, 
  { 
    "iso_3166_1": "JO", 
    "english_name": "Jordan" 
  }, 
  { 
    "iso_3166_1": "JP", 
    "english_name": "Japan" 
  }, 
  { 
    "iso_3166_1": "KE", 
    "english_name": "Kenya" 
  }, 
  { 
    "iso_3166_1": "KG", 
    "english_name": "Kyrgyz Republic" 
  }, 
  { 
    "iso_3166_1": "KH", 
    "english_name": "Cambodia" 
  }, 
  { 
    "iso_3166_1": "KI", 
    "english_name": "Kiribati" 
  }, 
  { 
    "iso_3166_1": "KM", 
    "english_name": "Comoros" 
  }, 
  { 
    "iso_3166_1": "KN", 
    "english_name": "St. Kitts and Nevis" 
  }, 
  { 
    "iso_3166_1": "KP", 
    "english_name": "North Korea" 
  }, 
  { 
    "iso_3166_1": "KW", 
    "english_name": "Kuwait" 
  }, 
  { 
    "iso_3166_1": "KY", 
    "english_name": "Cayman Islands" 
  }, 
  { 
    "iso_3166_1": "KZ", 
    "english_name": "Kazakhstan" 
  }, 
  { 
    "iso_3166_1": "LA", 
    "english_name": "Lao People's Democratic Republic" 
  }, 
  { 
    "iso_3166_1": "LB", 
    "english_name": "Lebanon" 
  }, 
  { 
    "iso_3166_1": "LC", 
    "english_name": "St. Lucia" 
  }, 
  { 
    "iso_3166_1": "LI", 
    "english_name": "Liechtenstein" 
  }, 
  { 
    "iso_3166_1": "LK", 
    "english_name": "Sri Lanka" 
  }, 
  { 
    "iso_3166_1": "LR", 
    "english_name": "Liberia" 
  }, 
  { 
    "iso_3166_1": "LS", 
    "english_name": "Lesotho" 
  }, 
  { 
    "iso_3166_1": "LT", 
    "english_name": "Lithuania" 
  }, 
  { 
    "iso_3166_1": "LU", 
    "english_name": "Luxembourg" 
  }, 
  { 
    "iso_3166_1": "LV", 
    "english_name": "Latvia" 
  }, 
  { 
    "iso_3166_1": "LY", 
    "english_name": "Libyan Arab Jamahiriya" 
  }, 
  { 
    "iso_3166_1": "MA", 
    "english_name": "Morocco" 
  }, 
  { 
    "iso_3166_1": "MC", 
    "english_name": "Monaco" 
  }, 
  { 
    "iso_3166_1": "MD", 
    "english_name": "Moldova" 
  }, 
  { 
    "iso_3166_1": "MG", 
    "english_name": "Madagascar" 
  }, 
  { 
    "iso_3166_1": "MH", 
    "english_name": "Marshall Islands" 
  }, 
  { 
    "iso_3166_1": "MK", 
    "english_name": "Macedonia" 
  }, 
  { 
    "iso_3166_1": "ML", 
    "english_name": "Mali" 
  }, 
  { 
    "iso_3166_1": "MM", 
    "english_name": "Myanmar" 
  }, 
  { 
    "iso_3166_1": "MN", 
    "english_name": "Mongolia" 
  }, 
  { 
    "iso_3166_1": "MO", 
    "english_name": "Macao" 
  }, 
  { 
    "iso_3166_1": "MP", 
    "english_name": "Northern Mariana Islands" 
  }, 
  { 
    "iso_3166_1": "MQ", 
    "english_name": "Martinique" 
  }, 
  { 
    "iso_3166_1": "MR", 
    "english_name": "Mauritania" 
  }, 
  { 
    "iso_3166_1": "MS", 
    "english_name": "Montserrat" 
  }, 
  { 
    "iso_3166_1": "MT", 
    "english_name": "Malta" 
  }, 
  { 
    "iso_3166_1": "MU", 
    "english_name": "Mauritius" 
  }, 
  { 
    "iso_3166_1": "MV", 
    "english_name": "Maldives" 
  }, 
  { 
    "iso_3166_1": "MW", 
    "english_name": "Malawi" 
  }, 
  { 
    "iso_3166_1": "MX", 
    "english_name": "Mexico" 
  }, 
  { 
    "iso_3166_1": "MY", 
    "english_name": "Malaysia" 
  }, 
  { 
    "iso_3166_1": "MZ", 
    "english_name": "Mozambique" 
  }, 
  { 
    "iso_3166_1": "NA", 
    "english_name": "Namibia" 
  }, 
  { 
    "iso_3166_1": "NC", 
    "english_name": "New Caledonia" 
  }, 
  { 
    "iso_3166_1": "NE", 
    "english_name": "Niger" 
  }, 
  { 
    "iso_3166_1": "NF", 
    "english_name": "Norfolk Island" 
  }, 
  { 
    "iso_3166_1": "NG", 
    "english_name": "Nigeria" 
  }, 
  { 
    "iso_3166_1": "ME", 
    "english_name": "Montenegro" 
  }, 
  { 
    "iso_3166_1": "NI", 
    "english_name": "Nicaragua" 
  }, 
  { 
    "iso_3166_1": "NL", 
    "english_name": "Netherlands" 
  }, 
  { 
    "iso_3166_1": "NO", 
    "english_name": "Norway" 
  }, 
  { 
    "iso_3166_1": "NP", 
    "english_name": "Nepal" 
  }, 
  { 
    "iso_3166_1": "NR", 
    "english_name": "Nauru" 
  }, 
  { 
    "iso_3166_1": "NU", 
    "english_name": "Niue" 
  }, 
  { 
    "iso_3166_1": "NZ", 
    "english_name": "New Zealand" 
  }, 
  { 
    "iso_3166_1": "OM", 
    "english_name": "Oman" 
  }, 
  { 
    "iso_3166_1": "PA", 
    "english_name": "Panama" 
  }, 
  { 
    "iso_3166_1": "PE", 
    "english_name": "Peru" 
  }, 
  { 
    "iso_3166_1": "PF", 
    "english_name": "French Polynesia" 
  }, 
  { 
    "iso_3166_1": "PG", 
    "english_name": "Papua New Guinea" 
  }, 
  { 
    "iso_3166_1": "PH", 
    "english_name": "Philippines" 
  }, 
  { 
    "iso_3166_1": "YU", 
    "english_name": "Yugoslavia" 
  }, 
  { 
    "iso_3166_1": "XK", 
    "english_name": "Kosovo" 
  }, 
  { 
    "iso_3166_1": "XC", 
    "english_name": "Czechoslovakia" 
  }, 
  { 
    "iso_3166_1": "PK", 
    "english_name": "Pakistan" 
  }, 
  { 
    "iso_3166_1": "PL", 
    "english_name": "Poland" 
  }, 
  { 
    "iso_3166_1": "PM", 
    "english_name": "St. Pierre and Miquelon" 
  }, 
  { 
    "iso_3166_1": "PN", 
    "english_name": "Pitcairn Island" 
  }, 
  { 
    "iso_3166_1": "PR", 
    "english_name": "Puerto Rico" 
  }, 
  { 
    "iso_3166_1": "PS", 
    "english_name": "Palestinian Territory" 
  }, 
  { 
    "iso_3166_1": "PT", 
    "english_name": "Portugal" 
  }, 
  { 
    "iso_3166_1": "PW", 
    "english_name": "Palau" 
  }, 
  { 
    "iso_3166_1": "PY", 
    "english_name": "Paraguay" 
  }, 
  { 
    "iso_3166_1": "QA", 
    "english_name": "Qatar" 
  }, 
  { 
    "iso_3166_1": "RE", 
    "english_name": "Reunion" 
  }, 
  { 
    "iso_3166_1": "RO", 
    "english_name": "Romania" 
  }, 
  { 
    "iso_3166_1": "RU", 
    "english_name": "Russia" 
  }, 
  { 
    "iso_3166_1": "RW", 
    "english_name": "Rwanda" 
  }, 
  { 
    "iso_3166_1": "SA", 
    "english_name": "Saudi Arabia" 
  }, 
  { 
    "iso_3166_1": "SB", 
    "english_name": "Solomon Islands" 
  }, 
  { 
    "iso_3166_1": "SC", 
    "english_name": "Seychelles" 
  }, 
  { 
    "iso_3166_1": "SD", 
    "english_name": "Sudan" 
  }, 
  { 
    "iso_3166_1": "SE", 
    "english_name": "Sweden" 
  }, 
  { 
    "iso_3166_1": "SG", 
    "english_name": "Singapore" 
  }, 
  { 
    "iso_3166_1": "SH", 
    "english_name": "St. Helena" 
  }, 
  { 
    "iso_3166_1": "SI", 
    "english_name": "Slovenia" 
  }, 
  { 
    "iso_3166_1": "SJ", 
    "english_name": "Svalbard & Jan Mayen Islands" 
  }, 
  { 
    "iso_3166_1": "SK", 
    "english_name": "Slovakia" 
  }, 
  { 
    "iso_3166_1": "SL", 
    "english_name": "Sierra Leone" 
  }, 
  { 
    "iso_3166_1": "SM", 
    "english_name": "San Marino" 
  }, 
  { 
    "iso_3166_1": "SN", 
    "english_name": "Senegal" 
  }, 
  { 
    "iso_3166_1": "SO", 
    "english_name": "Somalia" 
  }, 
  { 
    "iso_3166_1": "SR", 
    "english_name": "Suriname" 
  }, 
  { 
    "iso_3166_1": "ST", 
    "english_name": "Sao Tome and Principe" 
  }, 
  { 
    "iso_3166_1": "SV", 
    "english_name": "El Salvador" 
  }, 
  { 
    "iso_3166_1": "SY", 
    "english_name": "Syrian Arab Republic" 
  }, 
  { 
    "iso_3166_1": "SZ", 
    "english_name": "Swaziland" 
  }, 
  { 
    "iso_3166_1": "TC", 
    "english_name": "Turks and Caicos Islands" 
  }, 
  { 
    "iso_3166_1": "TD", 
    "english_name": "Chad" 
  }, 
  { 
    "iso_3166_1": "TF", 
    "english_name": "French Southern Territories" 
  }, 
  { 
    "iso_3166_1": "TG", 
    "english_name": "Togo" 
  }, 
  { 
    "iso_3166_1": "TH", 
    "english_name": "Thailand" 
  }, 
  { 
    "iso_3166_1": "TJ", 
    "english_name": "Tajikistan" 
  }, 
  { 
    "iso_3166_1": "TK", 
    "english_name": "Tokelau" 
  }, 
  { 
    "iso_3166_1": "TL", 
    "english_name": "Timor-Leste" 
  }, 
  { 
    "iso_3166_1": "TM", 
    "english_name": "Turkmenistan" 
  }, 
  { 
    "iso_3166_1": "TN", 
    "english_name": "Tunisia" 
  }, 
  { 
    "iso_3166_1": "TO", 
    "english_name": "Tonga" 
  }, 
  { 
    "iso_3166_1": "TR", 
    "english_name": "Turkey" 
  }, 
  { 
    "iso_3166_1": "TT", 
    "english_name": "Trinidad and Tobago" 
  }, 
  { 
    "iso_3166_1": "TV", 
    "english_name": "Tuvalu" 
  }, 
  { 
    "iso_3166_1": "TW", 
    "english_name": "Taiwan" 
  }, 
  { 
    "iso_3166_1": "TZ", 
    "english_name": "Tanzania" 
  }, 
  { 
    "iso_3166_1": "UA", 
    "english_name": "Ukraine" 
  }, 
  { 
    "iso_3166_1": "UG", 
    "english_name": "Uganda" 
  }, 
  { 
    "iso_3166_1": "UM", 
    "english_name": "United States Minor Outlying Islands" 
  }, 
  { 
    "iso_3166_1": "US", 
    "english_name": "United States of America" 
  }, 
  { 
    "iso_3166_1": "UY", 
    "english_name": "Uruguay" 
  }, 
  { 
    "iso_3166_1": "UZ", 
    "english_name": "Uzbekistan" 
  }, 
  { 
    "iso_3166_1": "VA", 
    "english_name": "Holy See" 
  }, 
  { 
    "iso_3166_1": "VC", 
    "english_name": "St. Vincent and the Grenadines" 
  }, 
  { 
    "iso_3166_1": "VE", 
    "english_name": "Venezuela" 
  }, 
  { 
    "iso_3166_1": "VG", 
    "english_name": "British Virgin Islands" 
  }, 
  { 
    "iso_3166_1": "VI", 
    "english_name": "US Virgin Islands" 
  }, 
  { 
    "iso_3166_1": "VN", 
    "english_name": "Vietnam" 
  }, 
  { 
    "iso_3166_1": "VU", 
    "english_name": "Vanuatu" 
  }, 
  { 
    "iso_3166_1": "WF", 
    "english_name": "Wallis and Futuna Islands" 
  }, 
  { 
    "iso_3166_1": "WS", 
    "english_name": "Samoa" 
  }, 
  { 
    "iso_3166_1": "YE", 
    "english_name": "Yemen" 
  }, 
  { 
    "iso_3166_1": "YT", 
    "english_name": "Mayotte" 
  }, 
  { 
    "iso_3166_1": "ZA", 
    "english_name": "South Africa" 
  }, 
  { 
    "iso_3166_1": "ZM", 
    "english_name": "Zambia" 
  }, 
  { 
    "iso_3166_1": "ZW", 
    "english_name": "Zimbabwe" 
  }, 
  { 
    "iso_3166_1": "KR", 
    "english_name": "South Korea" 
  }, 
  { 
    "iso_3166_1": "XG", 
    "english_name": "East Germany" 
  }, 
  { 
    "iso_3166_1": "SU", 
    "english_name": "Soviet Union" 
  }, 
  { 
    "iso_3166_1": "SS", 
    "english_name": "South Sudan" 
  } 
] 

Get Jobs 

[ 
  { 
    "department": "Crew", 
    "jobs": [ 
      "Special Effects", 
      "Post Production Supervisor", 
      "Second Unit", 
      "Choreographer", 
      "Stunts", 
      "Stunt Coordinator", 
      "Special Effects Coordinator", 
      "Supervising Technical Director", 
      "Supervising Animator", 
      "Production Artist", 
      "Sequence Leads", 
      "Second Film Editor", 
      "Temp Music Editor", 
      "Temp Sound Editor", 
      "Sequence Supervisor", 
      "Software Team Lead", 
      "Software Engineer", 
      "Documentation & Support", 
      "Machinist", 
      "Photoscience Manager", 
      "Department Administrator", 
      "Schedule Coordinator", 
      "Supervisor of Production Resources", 
      "Production Office Assistant", 
      "Information Systems Manager", 
      "Systems Administrators & Support", 
      "Projection", 
      "Post Production Assistant", 
      "Sound Design Assistant", 
      "Mix Technician", 
      "Motion Actor", 
      "Sets & Props Supervisor", 
      "Compositors", 
      "Tattooist", 
      "Sets & Props Artist", 
      "Motion Capture Artist", 
      "Sequence Artist", 
      "Mixing Engineer", 
      "Special Sound Effects", 
      "Post-Production Manager", 
      "Dialect Coach", 
      "Picture Car Coordinator", 
      "Cableman", 
      "Set Production Assistant", 
      "Video Assist Operator", 
      "Unit Publicist", 
      "Set Medic", 
      "Stand In", 
      "Transportation Coordinator", 
      "Transportation Captain", 
      "Post Production Consulting", 
      "Production Intern", 
      "Utility Stunts", 
      "Actor's Assistant", 
      "Set Production Intern", 
      "Production Controller", 
      "Studio Teachers", 
      "Chef", 
      "Craft Service", 
      "Scenic Artist", 
      "Propmaker", 
      "Prop Maker", 
      "Transportation Co-Captain", 
      "Driver", 
      "Security", 
      "Second Unit Cinematographer", 
      "Loader", 
      "Manager of Operations", 
      "Quality Control Supervisor", 
      "Legal Services", 
      "Public Relations", 
      "Score Engineer", 
      "Translator", 
      "Title Graphics", 
      "Telecine Colorist", 
      "Animatronic and Prosthetic Effects", 
      "Martial Arts Choreographer", 
      "Cinematography", 
      "Steadycam", 
      "Executive Visual Effects Producer", 
      "Visual Effects Design Consultant", 
      "Digital Effects Supervisor", 
      "Digital Producer", 
      "CG Supervisor", 
      "Visual Effects Art Director", 
      "Visual Effects Editor", 
      "Executive in Charge of Finance", 
      "Associate Choreographer", 
      "Makeup Effects", 
      "Treatment", 
      "Dramaturgy", 
      "Lighting Camera", 
      "Technical Supervisor", 
      "CGI Supervisor", 
      "Creative Consultant", 
      "Script", 
      "Executive Music Producer", 
      "Commissioning Editor", 
      "Additional Writing", 
      "Additional Music", 
      "Poem", 
      "Thanks", 
      "Creator", 
      "Additional Dialogue", 
      "Video Game", 
      "Graphic Novel Illustrator", 
      "Other", 
      "Series Writer", 
      "Radio Play", 
      "Armorer", 
      "Carpenter", 
      "Editorial Staff", 
      "Aerial Coordinator", 
      "Animal Coordinator", 
      "Animal Wrangler", 
      "Animatronics Designer", 
      "Drone Operator", 
      "In Memory Of", 
      "Pilot", 
      "Presenter", 
      "Animatronics Supervisor", 
      "Armory Coordinator", 
      "Digital Effects Producer", 
      "Fight Choreographer", 
      "Marine Coordinator", 
      "Pyrotechnician", 
      "Techno Crane Operator" 
    ] 
  }, 
  { 
    "department": "Sound", 
    "jobs": [ 
      "Original Music Composer", 
      "Sound Designer", 
      "Sound Editor", 
      "Sound Director", 
      "Sound Mixer", 
      "Music Editor", 
      "Sound Effects Editor", 
      "Production Sound Mixer", 
      "Additional Soundtrack", 
      "Supervising Sound Editor", 
      "Supervising Sound Effects Editor", 
      "Sound Re-Recording Mixer", 
      "Recording Supervision", 
      "Boom Operator", 
      "Sound Montage Associate", 
      "Songs", 
      "Music", 
      "ADR & Dubbing", 
      "Sound Recordist", 
      "Sound Engineer", 
      "Foley", 
      "Dialogue Editor", 
      "Additional Music Supervisor", 
      "First Assistant Sound Editor", 
      "Scoring Mixer", 
      "Dolby Consultant", 
      "Other", 
      "Music Director", 
      "Orchestrator", 
      "Vocal Coach", 
      "Music Supervisor", 
      "Sound", 
      "Musician", 
      "Additional Sound Re-Recording Mixer", 
      "Additional Sound Re-Recordist", 
      "ADR Editor", 
      "ADR Supervisor", 
      "Apprentice Sound Editor", 
      "Assistant Music Supervisor", 
      "Assistant Sound Editor", 
      "Conductor", 
      "Foley Editor", 
      "Music Programmer", 
      "Music Score Producer", 
      "Playback Singer", 
      "Sound Effects", 
      "Sound Effects Designer", 
      "Supervising ADR Editor", 
      "Supervising Dialogue Editor", 
      "Supervising Music Editor", 
      "Theme Song Performance", 
      "Utility Sound" 
    ] 
  }, 
  { 
    "department": "Lighting", 
    "jobs": [ 
      "Lighting Technician", 
      "Best Boy Electric", 
      "Gaffer", 
      "Rigging Gaffer", 
      "Lighting Supervisor", 
      "Lighting Manager", 
      "Directing Lighting Artist", 
      "Master Lighting Artist", 
      "Lighting Artist", 
      "Lighting Coordinator", 
      "Lighting Production Assistant", 
      "Best Boy Electrician", 
      "Electrician", 
      "Rigging Grip", 
      "Other", 
      "Chief Lighting Technician", 
      "Lighting Director", 
      "Rigging Supervisor", 
      "Underwater Gaffer" 
    ] 
  }, 
  { 
    "department": "Production", 
    "jobs": [ 
      "Producer", 
      "Executive Producer", 
      "Casting", 
      "Production Manager", 
      "Unit Production Manager", 
      "Line Producer", 
      "Location Manager", 
      "Other", 
      "Production Supervisor", 
      "Production Accountant", 
      "Production Office Coordinator", 
      "Finance", 
      "Executive Consultant", 
      "Character Technical Supervisor", 
      "Development Manager", 
      "Administration", 
      "Executive In Charge Of Post Production", 
      "Production Director", 
      "Executive In Charge Of Production", 
      "Publicist", 
      "Associate Producer", 
      "Co-Producer", 
      "Co-Executive Producer", 
      "Casting Associate", 
      "Researcher", 
      "Production Coordinator", 
      "Consulting Producer", 
      "Supervising Producer", 
      "Senior Executive Consultant", 
      "Unit Manager", 
      "ADR Voice Casting", 
      "Assistant Production Coordinator", 
      "Assistant Production Manager", 
      "Casting Assistant", 
      "Casting Consultant", 
      "Coordinating Producer", 
      "Local Casting", 
      "Script Researcher" 
    ] 
  }, 
  { 
    "department": "Art", 
    "jobs": [ 
      "Production Design", 
      "Art Direction", 
      "Set Decoration", 
      "Set Designer", 
      "Conceptual Design", 
      "Interior Designer", 
      "Settings", 
      "Assistant Art Director", 
      "Art Department Coordinator", 
      "Assistant Property Master", 
      "Other", 
      "Art Department Manager", 
      "Sculptor", 
      "Art Department Assistant", 
      "Background Designer", 
      "Co-Art Director", 
      "Set Decoration Buyer", 
      "Production Illustrator", 
      "Standby Painter", 
      "Property Master", 
      "Location Scout", 
      "Supervising Art Director", 
      "Leadman", 
      "Greensman", 
      "Gun Wrangler", 
      "Construction Coordinator", 
      "Construction Foreman", 
      "Lead Painter", 
      "Sign Painter", 
      "Painter", 
      "Assistant Set Dresser", 
      "Conceptual Illustrator", 
      "Draughtsman", 
      "Lead Set Dresser", 
      "Prop Designer", 
      "Set Decorating Coordinator", 
      "Set Dresser", 
      "Storyboard Designer", 
      "Title Designer" 
    ] 
  }, 
  { 
    "department": "Editing", 
    "jobs": [ 
      "Editor", 
      "Supervising Film Editor", 
      "Additional Editing", 
      "Editorial Manager", 
      "First Assistant Editor", 
      "Additional Editorial Assistant", 
      "Editorial Coordinator", 
      "Editorial Production Assistant", 
      "Editorial Services", 
      "Archival Footage Coordinator", 
      "Archival Footage Research", 
      "Color Timer", 
      "Digital Intermediate", 
      "Other", 
      "Assistant Editor", 
      "Associate Editor", 
      "Co-Editor", 
      "Negative Cutter" 
    ] 
  }, 
  { 
    "department": "Costume & Make-Up", 
    "jobs": [ 
      "Costume Design", 
      "Makeup Artist", 
      "Hairstylist", 
      "Set Dressing Artist", 
      "Set Dressing Supervisor", 
      "Set Dressing Manager", 
      "Set Dressing Production Assistant", 
      "Facial Setup Artist", 
      "Hair Setup", 
      "Costume Supervisor", 
      "Set Costumer", 
      "Makeup Department Head", 
      "Wigmaker", 
      "Shoe Design", 
      "Other", 
      "Co-Costume Designer", 
      "Hair Department Head", 
      "Hair Designer", 
      "Makeup Designer", 
      "Assistant Costume Designer", 
      "Prosthetic Supervisor", 
      "Seamstress", 
      "Key Hair Stylist", 
      "Ager/Dyer", 
      "Costume Consultant", 
      "Costume Coordinator", 
      "Costume Illustrator", 
      "Hair Supervisor", 
      "Key Costumer", 
      "Key Makeup Artist", 
      "Key Set Costumer", 
      "Makeup Effects Designer", 
      "Makeup Supervisor", 
      "Prosthetic Designer", 
      "Prosthetic Makeup Artist", 
      "Tailor", 
      "Tattoo Designer", 
      "Wardrobe Supervisor", 
      "Wig Designer" 
    ] 
  }, 
  { 
    "department": "Camera", 
    "jobs": [ 
      "Director of Photography", 
      "Underwater Camera", 
      "Camera Operator", 
      "Still Photographer", 
      "Camera Department Manager", 
      "Camera Supervisor", 
      "Camera Technician", 
      "Other", 
      "Grip", 
      "Steadicam Operator", 
      "Additional Camera", 
      "Camera Intern", 
      "Additional Photography", 
      "Helicopter Camera", 
      "First Assistant Camera", 
      "Additional Still Photographer", 
      "Aerial Camera", 
      "Aerial Camera Technician", 
      "Aerial Director of Photography", 
      "Camera Loader", 
      "Dolly Grip", 
      "Epk Camera Operator", 
      "Key Grip", 
      "Russian Arm Operator", 
      "Second Unit Director of Photography", 
      "Ultimate Arm Operator", 
      "Underwater Director of Photography" 
    ] 
  }, 
  { 
    "department": "Directing", 
    "jobs": [ 
      "Director", 
      "Script Supervisor", 
      "Other", 
      "Layout", 
      "Script Coordinator", 
      "Special Guest Director", 
      "Assistant Director", 
      "Co-Director", 
      "Continuity", 
      "First Assistant Director", 
      "Second Assistant Director", 
      "Third Assistant Director" 
    ] 
  }, 
  { 
    "department": "Visual Effects", 
    "jobs": [ 
      "Animation", 
      "Visual Effects", 
      "Chief Technician / Stop-Motion Expert", 
      "Creature Design", 
      "Shading", 
      "Modeling", 
      "CG Painter", 
      "Visual Development", 
      "Animation Manager", 
      "Animation Director", 
      "Fix Animator", 
      "Animation Department Coordinator", 
      "Animation Fix Coordinator", 
      "Animation Production Assistant", 
      "Visual Effects Supervisor", 
      "Mechanical & Creature Designer", 
      "Battle Motion Coordinator", 
      "Animation Supervisor", 
      "VFX Supervisor", 
      "Cloth Setup", 
      "VFX Artist", 
      "CG Engineer", 
      "24 Frame Playback", 
      "Imaging Science", 
      "I/O Supervisor", 
      "Visual Effects Producer", 
      "VFX Production Coordinator", 
      "I/O Manager", 
      "Additional Effects Development", 
      "Color Designer", 
      "Simulation & Effects Production Assistant", 
      "Simulation & Effects Artist", 
      "Pyrotechnic Supervisor", 
      "Special Effects Supervisor", 
      "3D Supervisor", 
      "3D Director", 
      "Digital Compositors", 
      "Visual Effects Coordinator", 
      "VFX Editor", 
      "2D Artist", 
      "2D Supervisor", 
      "3D Animator", 
      "3D Artist", 
      "3D Coordinator", 
      "3D Generalist", 
      "3D Modeller", 
      "3D Sequence Supervisor", 
      "3D Tracking Layout", 
      "CG Animator", 
      "CGI Director", 
      "Character Designer", 
      "Character Modelling Supervisor", 
      "Creature Technical Director", 
      "Digital Effects Producer", 
      "Key Animation", 
      "Lead Animator", 
      "Lead Character Designer", 
      "Matchmove Supervisor", 
      "Mechanical Designer", 
      "Opening/Ending Animation", 
      "Pre-Visualization Supervisor", 
      "Roto Supervisor", 
      "Stereoscopic Coordinator", 
      "VFX Director of Photography", 
      "VFX Lighting Artist", 
      "Visual Effects Designer", 
      "Visual Effects Technical Director" 
    ] 
  }, 
  { 
    "department": "Actors", 
    "jobs": [ 
      "Actor", 
      "Stunt Double", 
      "Voice", 
      "Cameo", 
      "Special Guest" 
    ] 
  }, 
  { 
    "department": "Writing", 
    "jobs": [ 
      "Screenplay", 
      "Author", 
      "Novel", 
      "Characters", 
      "Theatre Play", 
      "Adaptation", 
      "Dialogue", 
      "Writer", 
      "Other", 
      "Storyboard", 
      "Original Story", 
      "Scenario Writer", 
      "Screenstory", 
      "Musical", 
      "Idea", 
      "Story", 
      "Creative Producer", 
      "Teleplay", 
      "Opera", 
      "Co-Writer", 
      "Book", 
      "Comic Book", 
      "Short Story", 
      "Series Composition", 
      "Script Editor", 
      "Script Consultant", 
      "Story Editor" 
    ] 
  } 
] 

Get Languages 

[ 
  { 
    "iso_639_1": "xx", 
    "english_name": "No Language", 
    "name": "No Language" 
  }, 
  { 
    "iso_639_1": "aa", 
    "english_name": "Afar", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "af", 
    "english_name": "Afrikaans", 
    "name": "Afrikaans" 
  }, 
  { 
    "iso_639_1": "ak", 
    "english_name": "Akan", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "an", 
    "english_name": "Aragonese", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "as", 
    "english_name": "Assamese", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "av", 
    "english_name": "Avaric", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ae", 
    "english_name": "Avestan", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ay", 
    "english_name": "Aymara", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "az", 
    "english_name": "Azerbaijani", 
    "name": "Azərbaycan" 
  }, 
  { 
    "iso_639_1": "ba", 
    "english_name": "Bashkir", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "bm", 
    "english_name": "Bambara", 
    "name": "Bamanankan" 
  }, 
  { 
    "iso_639_1": "bi", 
    "english_name": "Bislama", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "bo", 
    "english_name": "Tibetan", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "br", 
    "english_name": "Breton", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ca", 
    "english_name": "Catalan", 
    "name": "Català" 
  }, 
  { 
    "iso_639_1": "cs", 
    "english_name": "Czech", 
    "name": "Český" 
  }, 
  { 
    "iso_639_1": "ce", 
    "english_name": "Chechen", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "cu", 
    "english_name": "Slavic", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "cv", 
    "english_name": "Chuvash", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "kw", 
    "english_name": "Cornish", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "co", 
    "english_name": "Corsican", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "cr", 
    "english_name": "Cree", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "cy", 
    "english_name": "Welsh", 
    "name": "Cymraeg" 
  }, 
  { 
    "iso_639_1": "da", 
    "english_name": "Danish", 
    "name": "Dansk" 
  }, 
  { 
    "iso_639_1": "de", 
    "english_name": "German", 
    "name": "Deutsch" 
  }, 
  { 
    "iso_639_1": "dv", 
    "english_name": "Divehi", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "dz", 
    "english_name": "Dzongkha", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "eo", 
    "english_name": "Esperanto", 
    "name": "Esperanto" 
  }, 
  { 
    "iso_639_1": "et", 
    "english_name": "Estonian", 
    "name": "Eesti" 
  }, 
  { 
    "iso_639_1": "eu", 
    "english_name": "Basque", 
    "name": "euskera" 
  }, 
  { 
    "iso_639_1": "fo", 
    "english_name": "Faroese", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "fj", 
    "english_name": "Fijian", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "fi", 
    "english_name": "Finnish", 
    "name": "suomi" 
  }, 
  { 
    "iso_639_1": "fr", 
    "english_name": "French", 
    "name": "Français" 
  }, 
  { 
    "iso_639_1": "fy", 
    "english_name": "Frisian", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ff", 
    "english_name": "Fulah", 
    "name": "Fulfulde" 
  }, 
  { 
    "iso_639_1": "gd", 
    "english_name": "Gaelic", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ga", 
    "english_name": "Irish", 
    "name": "Gaeilge" 
  }, 
  { 
    "iso_639_1": "gl", 
    "english_name": "Gallegan", 
    "name": "Galego" 
  }, 
  { 
    "iso_639_1": "gv", 
    "english_name": "Manx", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "gn", 
    "english_name": "Guarani", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "gu", 
    "english_name": "Gujarati", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ht", 
    "english_name": "Haitian; Haitian Creole", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ha", 
    "english_name": "Hausa", 
    "name": "Hausa" 
  }, 
  { 
    "iso_639_1": "sh", 
    "english_name": "Serbo-Croatian", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "hz", 
    "english_name": "Herero", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ho", 
    "english_name": "Hiri Motu", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "hr", 
    "english_name": "Croatian", 
    "name": "Hrvatski" 
  }, 
  { 
    "iso_639_1": "hu", 
    "english_name": "Hungarian", 
    "name": "Magyar" 
  }, 
  { 
    "iso_639_1": "ig", 
    "english_name": "Igbo", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "io", 
    "english_name": "Ido", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ii", 
    "english_name": "Yi", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "iu", 
    "english_name": "Inuktitut", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ie", 
    "english_name": "Interlingue", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ia", 
    "english_name": "Interlingua", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "id", 
    "english_name": "Indonesian", 
    "name": "Bahasa indonesia" 
  }, 
  { 
    "iso_639_1": "ik", 
    "english_name": "Inupiaq", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "is", 
    "english_name": "Icelandic", 
    "name": "Íslenska" 
  }, 
  { 
    "iso_639_1": "it", 
    "english_name": "Italian", 
    "name": "Italiano" 
  }, 
  { 
    "iso_639_1": "jv", 
    "english_name": "Javanese", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ja", 
    "english_name": "Japanese", 
    "name": "日本語" 
  }, 
  { 
    "iso_639_1": "kl", 
    "english_name": "Kalaallisut", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "kn", 
    "english_name": "Kannada", 
    "name": "?????" 
  }, 
  { 
    "iso_639_1": "ks", 
    "english_name": "Kashmiri", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "kr", 
    "english_name": "Kanuri", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "kk", 
    "english_name": "Kazakh", 
    "name": "қазақ" 
  }, 
  { 
    "iso_639_1": "km", 
    "english_name": "Khmer", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ki", 
    "english_name": "Kikuyu", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "rw", 
    "english_name": "Kinyarwanda", 
    "name": "Kinyarwanda" 
  }, 
  { 
    "iso_639_1": "ky", 
    "english_name": "Kirghiz", 
    "name": "??????" 
  }, 
  { 
    "iso_639_1": "kv", 
    "english_name": "Komi", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "kg", 
    "english_name": "Kongo", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ko", 
    "english_name": "Korean", 
    "name": "한국어/조선말" 
  }, 
  { 
    "iso_639_1": "kj", 
    "english_name": "Kuanyama", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ku", 
    "english_name": "Kurdish", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "lo", 
    "english_name": "Lao", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "la", 
    "english_name": "Latin", 
    "name": "Latin" 
  }, 
  { 
    "iso_639_1": "lv", 
    "english_name": "Latvian", 
    "name": "Latviešu" 
  }, 
  { 
    "iso_639_1": "li", 
    "english_name": "Limburgish", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ln", 
    "english_name": "Lingala", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "lt", 
    "english_name": "Lithuanian", 
    "name": "Lietuvikai" 
  }, 
  { 
    "iso_639_1": "lb", 
    "english_name": "Letzeburgesch", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "lu", 
    "english_name": "Luba-Katanga", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "lg", 
    "english_name": "Ganda", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "mh", 
    "english_name": "Marshall", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ml", 
    "english_name": "Malayalam", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "mr", 
    "english_name": "Marathi", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "mg", 
    "english_name": "Malagasy", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "mt", 
    "english_name": "Maltese", 
    "name": "Malti" 
  }, 
  { 
    "iso_639_1": "mo", 
    "english_name": "Moldavian", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "mn", 
    "english_name": "Mongolian", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "mi", 
    "english_name": "Maori", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ms", 
    "english_name": "Malay", 
    "name": "Bahasa melayu" 
  }, 
  { 
    "iso_639_1": "my", 
    "english_name": "Burmese", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "na", 
    "english_name": "Nauru", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "nv", 
    "english_name": "Navajo", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "nr", 
    "english_name": "Ndebele", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "nd", 
    "english_name": "Ndebele", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ng", 
    "english_name": "Ndonga", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ne", 
    "english_name": "Nepali", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "nl", 
    "english_name": "Dutch", 
    "name": "Nederlands" 
  }, 
  { 
    "iso_639_1": "nn", 
    "english_name": "Norwegian Nynorsk", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "nb", 
    "english_name": "Norwegian Bokmål", 
    "name": "Bokmål" 
  }, 
  { 
    "iso_639_1": "no", 
    "english_name": "Norwegian", 
    "name": "Norsk" 
  }, 
  { 
    "iso_639_1": "ny", 
    "english_name": "Chichewa; Nyanja", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "oc", 
    "english_name": "Occitan", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "oj", 
    "english_name": "Ojibwa", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "or", 
    "english_name": "Oriya", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "om", 
    "english_name": "Oromo", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "os", 
    "english_name": "Ossetian; Ossetic", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "pi", 
    "english_name": "Pali", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "pl", 
    "english_name": "Polish", 
    "name": "Polski" 
  }, 
  { 
    "iso_639_1": "pt", 
    "english_name": "Portuguese", 
    "name": "Português" 
  }, 
  { 
    "iso_639_1": "qu", 
    "english_name": "Quechua", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "rm", 
    "english_name": "Raeto-Romance", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ro", 
    "english_name": "Romanian", 
    "name": "Română" 
  }, 
  { 
    "iso_639_1": "rn", 
    "english_name": "Rundi", 
    "name": "Kirundi" 
  }, 
  { 
    "iso_639_1": "ru", 
    "english_name": "Russian", 
    "name": "Pусский" 
  }, 
  { 
    "iso_639_1": "sg", 
    "english_name": "Sango", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "sa", 
    "english_name": "Sanskrit", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "si", 
    "english_name": "Sinhalese", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "sk", 
    "english_name": "Slovak", 
    "name": "Slovenčina" 
  }, 
  { 
    "iso_639_1": "sl", 
    "english_name": "Slovenian", 
    "name": "Slovenščina" 
  }, 
  { 
    "iso_639_1": "se", 
    "english_name": "Northern Sami", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "sm", 
    "english_name": "Samoan", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "sn", 
    "english_name": "Shona", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "sd", 
    "english_name": "Sindhi", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "so", 
    "english_name": "Somali", 
    "name": "Somali" 
  }, 
  { 
    "iso_639_1": "st", 
    "english_name": "Sotho", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "es", 
    "english_name": "Spanish", 
    "name": "Español" 
  }, 
  { 
    "iso_639_1": "sq", 
    "english_name": "Albanian", 
    "name": "shqip" 
  }, 
  { 
    "iso_639_1": "sc", 
    "english_name": "Sardinian", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "sr", 
    "english_name": "Serbian", 
    "name": "Srpski" 
  }, 
  { 
    "iso_639_1": "ss", 
    "english_name": "Swati", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "su", 
    "english_name": "Sundanese", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "sw", 
    "english_name": "Swahili", 
    "name": "Kiswahili" 
  }, 
  { 
    "iso_639_1": "sv", 
    "english_name": "Swedish", 
    "name": "svenska" 
  }, 
  { 
    "iso_639_1": "ty", 
    "english_name": "Tahitian", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ta", 
    "english_name": "Tamil", 
    "name": "தமிழ்" 
  }, 
  { 
    "iso_639_1": "tt", 
    "english_name": "Tatar", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "te", 
    "english_name": "Telugu", 
    "name": "తెలుగు" 
  }, 
  { 
    "iso_639_1": "tg", 
    "english_name": "Tajik", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "tl", 
    "english_name": "Tagalog", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "th", 
    "english_name": "Thai", 
    "name": "ภาษาไทย" 
  }, 
  { 
    "iso_639_1": "ti", 
    "english_name": "Tigrinya", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "to", 
    "english_name": "Tonga", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "tn", 
    "english_name": "Tswana", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ts", 
    "english_name": "Tsonga", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "tk", 
    "english_name": "Turkmen", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "tr", 
    "english_name": "Turkish", 
    "name": "Türkçe" 
  }, 
  { 
    "iso_639_1": "tw", 
    "english_name": "Twi", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ug", 
    "english_name": "Uighur", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "uk", 
    "english_name": "Ukrainian", 
    "name": "Український" 
  }, 
  { 
    "iso_639_1": "ur", 
    "english_name": "Urdu", 
    "name": "اردو" 
  }, 
  { 
    "iso_639_1": "uz", 
    "english_name": "Uzbek", 
    "name": "ozbek" 
  }, 
  { 
    "iso_639_1": "ve", 
    "english_name": "Venda", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "vi", 
    "english_name": "Vietnamese", 
    "name": "Tiếng Việt" 
  }, 
  { 
    "iso_639_1": "vo", 
    "english_name": "Volapük", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "wa", 
    "english_name": "Walloon", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "wo", 
    "english_name": "Wolof", 
    "name": "Wolof" 
  }, 
  { 
    "iso_639_1": "xh", 
    "english_name": "Xhosa", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "yi", 
    "english_name": "Yiddish", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "za", 
    "english_name": "Zhuang", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "zu", 
    "english_name": "Zulu", 
    "name": "isiZulu" 
  }, 
  { 
    "iso_639_1": "ab", 
    "english_name": "Abkhazian", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "zh", 
    "english_name": "Mandarin", 
    "name": "普通话" 
  }, 
  { 
    "iso_639_1": "ps", 
    "english_name": "Pushto", 
    "name": "پښتو" 
  }, 
  { 
    "iso_639_1": "am", 
    "english_name": "Amharic", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "ar", 
    "english_name": "Arabic", 
    "name": "العربية" 
  }, 
  { 
    "iso_639_1": "bg", 
    "english_name": "Bulgarian", 
    "name": "български език" 
  }, 
  { 
    "iso_639_1": "cn", 
    "english_name": "Cantonese", 
    "name": "广州话 / 廣州話" 
  }, 
  { 
    "iso_639_1": "mk", 
    "english_name": "Macedonian", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "el", 
    "english_name": "Greek", 
    "name": "ελληνικά" 
  }, 
  { 
    "iso_639_1": "fa", 
    "english_name": "Persian", 
    "name": "فارسی" 
  }, 
  { 
    "iso_639_1": "he", 
    "english_name": "Hebrew", 
    "name": "עִבְרִית" 
  }, 
  { 
    "iso_639_1": "hi", 
    "english_name": "Hindi", 
    "name": "हिन्दी" 
  }, 
  { 
    "iso_639_1": "hy", 
    "english_name": "Armenian", 
    "name": "" 
  }, 
  { 
    "iso_639_1": "en", 
    "english_name": "English", 
    "name": "English" 
  }, 
  { 
    "iso_639_1": "ee", 
    "english_name": "Ewe", 
    "name": "Èʋegbe" 
  }, 
  { 
    "iso_639_1": "ka", 
    "english_name": "Georgian", 
    "name": "ქართული" 
  }, 
  { 
    "iso_639_1": "pa", 
    "english_name": "Punjabi", 
    "name": "ਪੰਜਾਬੀ" 
  }, 
  { 
    "iso_639_1": "bn", 
    "english_name": "Bengali", 
    "name": "বাংলা" 
  }, 
  { 
    "iso_639_1": "bs", 
    "english_name": "Bosnian", 
    "name": "Bosanski" 
  }, 
  { 
    "iso_639_1": "ch", 
    "english_name": "Chamorro", 
    "name": "Finu' Chamorro" 
  }, 
  { 
    "iso_639_1": "be", 
    "english_name": "Belarusian", 
    "name": "беларуская мова" 
  } 
] 

Get Primary Translations 

[ 
  "ar-AE", 
  "ar-SA", 
  "bg-BG", 
  "bn-BD", 
  "ca-ES", 
  "ch-GU", 
  "cs-CZ", 
  "da-DK", 
  "de-DE", 
  "el-GR", 
  "en-US", 
  "eo-EO", 
  "es-ES", 
  "es-MX", 
  "eu-ES", 
  "fa-IR", 
  "fi-FI", 
  "fr-CA", 
  "fr-FR", 
  "he-IL", 
  "hi-IN", 
  "hu-HU", 
  "id-ID", 
  "it-IT", 
  "ja-JP", 
  "ka-GE", 
  "kn-IN", 
  "ko-KR", 
  "lt-LT", 
  "ml-IN", 
  "nb-NO", 
  "nl-NL", 
  "no-NO", 
  "pl-PL", 
  "pt-BR", 
  "pt-PT", 
  "ro-RO", 
  "ru-RU", 
  "sk-SK", 
  "sl-SI", 
  "sr-RS", 
  "sv-SE", 
  "ta-IN", 
  "te-IN", 
  "th-TH", 
  "tr-TR", 
  "uk-UA", 
  "vi-VN", 
  "zh-CN", 
  "zh-TW" 
] 

Get Timezones 

[ 
  { 
    "iso_3166_1": "AD", 
    "zones": [ 
      "Europe/Andorra" 
    ] 
  }, 
  { 
    "iso_3166_1": "AE", 
    "zones": [ 
      "Asia/Dubai" 
    ] 
  }, 
  { 
    "iso_3166_1": "AF", 
    "zones": [ 
      "Asia/Kabul" 
    ] 
  }, 
  { 
    "iso_3166_1": "AG", 
    "zones": [ 
      "America/Port_of_Spain" 
    ] 
  }, 
  { 
    "iso_3166_1": "AI", 
    "zones": [ 
      "America/Port_of_Spain" 
    ] 
  }, 
  { 
    "iso_3166_1": "AL", 
    "zones": [ 
      "Europe/Tirane" 
    ] 
  }, 
  { 
    "iso_3166_1": "AM", 
    "zones": [ 
      "Asia/Yerevan" 
    ] 
  }, 
  { 
    "iso_3166_1": "AO", 
    "zones": [ 
      "Africa/Lagos" 
    ] 
  }, 
  { 
    "iso_3166_1": "AQ", 
    "zones": [ 
      "Antarctica/Casey", 
      "Antarctica/Davis", 
      "Antarctica/DumontDUrville", 
      "Antarctica/Mawson", 
      "Antarctica/Palmer", 
      "Antarctica/Rothera", 
      "Antarctica/Syowa", 
      "Antarctica/Troll", 
      "Antarctica/Vostok", 
      "Pacific/Auckland" 
    ] 
  }, 
  { 
    "iso_3166_1": "AR", 
    "zones": [ 
      "America/Argentina/Buenos_Aires", 
      "America/Argentina/Cordoba", 
      "America/Argentina/Salta", 
      "America/Argentina/Jujuy", 
      "America/Argentina/Tucuman", 
      "America/Argentina/Catamarca", 
      "America/Argentina/La_Rioja", 
      "America/Argentina/San_Juan", 
      "America/Argentina/Mendoza", 
      "America/Argentina/San_Luis", 
      "America/Argentina/Rio_Gallegos", 
      "America/Argentina/Ushuaia" 
    ] 
  }, 
  { 
    "iso_3166_1": "AS", 
    "zones": [ 
      "Pacific/Pago_Pago" 
    ] 
  }, 
  { 
    "iso_3166_1": "AT", 
    "zones": [ 
      "Europe/Vienna" 
    ] 
  }, 
  { 
    "iso_3166_1": "AU", 
    "zones": [ 
      "Australia/Lord_Howe", 
      "Antarctica/Macquarie", 
      "Australia/Hobart", 
      "Australia/Currie", 
      "Australia/Melbourne", 
      "Australia/Sydney", 
      "Australia/Broken_Hill", 
      "Australia/Brisbane", 
      "Australia/Lindeman", 
      "Australia/Adelaide", 
      "Australia/Darwin", 
      "Australia/Perth", 
      "Australia/Eucla" 
    ] 
  }, 
  { 
    "iso_3166_1": "AW", 
    "zones": [ 
      "America/Curacao" 
    ] 
  }, 
  { 
    "iso_3166_1": "AX", 
    "zones": [ 
      "Europe/Helsinki" 
    ] 
  }, 
  { 
    "iso_3166_1": "AZ", 
    "zones": [ 
      "Asia/Baku" 
    ] 
  }, 
  { 
    "iso_3166_1": "BA", 
    "zones": [ 
      "Europe/Belgrade" 
    ] 
  }, 
  { 
    "iso_3166_1": "BB", 
    "zones": [ 
      "America/Barbados" 
    ] 
  }, 
  { 
    "iso_3166_1": "BD", 
    "zones": [ 
      "Asia/Dhaka" 
    ] 
  }, 
  { 
    "iso_3166_1": "BE", 
    "zones": [ 
      "Europe/Brussels" 
    ] 
  }, 
  { 
    "iso_3166_1": "BF", 
    "zones": [ 
      "Africa/Abidjan" 
    ] 
  }, 
  { 
    "iso_3166_1": "BG", 
    "zones": [ 
      "Europe/Sofia" 
    ] 
  }, 
  { 
    "iso_3166_1": "BH", 
    "zones": [ 
      "Asia/Qatar" 
    ] 
  }, 
  { 
    "iso_3166_1": "BI", 
    "zones": [ 
      "Africa/Maputo" 
    ] 
  }, 
  { 
    "iso_3166_1": "BJ", 
    "zones": [ 
      "Africa/Lagos" 
    ] 
  }, 
  { 
    "iso_3166_1": "BL", 
    "zones": [ 
      "America/Port_of_Spain" 
    ] 
  }, 
  { 
    "iso_3166_1": "BM", 
    "zones": [ 
      "Atlantic/Bermuda" 
    ] 
  }, 
  { 
    "iso_3166_1": "BN", 
    "zones": [ 
      "Asia/Brunei" 
    ] 
  }, 
  { 
    "iso_3166_1": "BO", 
    "zones": [ 
      "America/La_Paz" 
    ] 
  }, 
  { 
    "iso_3166_1": "BQ", 
    "zones": [ 
      "America/Curacao" 
    ] 
  }, 
  { 
    "iso_3166_1": "BR", 
    "zones": [ 
      "America/Noronha", 
      "America/Belem", 
      "America/Fortaleza", 
      "America/Recife", 
      "America/Araguaina", 
      "America/Maceio", 
      "America/Bahia", 
      "America/Sao_Paulo", 
      "America/Campo_Grande", 
      "America/Cuiaba", 
      "America/Santarem", 
      "America/Porto_Velho", 
      "America/Boa_Vista", 
      "America/Manaus", 
      "America/Eirunepe", 
      "America/Rio_Branco" 
    ] 
  }, 
  { 
    "iso_3166_1": "BS", 
    "zones": [ 
      "America/Nassau" 
    ] 
  }, 
  { 
    "iso_3166_1": "BT", 
    "zones": [ 
      "Asia/Thimphu" 
    ] 
  }, 
  { 
    "iso_3166_1": "BV", 
    "zones": [] 
  }, 
  { 
    "iso_3166_1": "BW", 
    "zones": [ 
      "Africa/Maputo" 
    ] 
  }, 
  { 
    "iso_3166_1": "BY", 
    "zones": [ 
      "Europe/Minsk" 
    ] 
  }, 
  { 
    "iso_3166_1": "BZ", 
    "zones": [ 
      "America/Belize" 
    ] 
  }, 
  { 
    "iso_3166_1": "CA", 
    "zones": [ 
      "America/St_Johns", 
      "America/Halifax", 
      "America/Glace_Bay", 
      "America/Moncton", 
      "America/Goose_Bay", 
      "America/Blanc-Sablon", 
      "America/Toronto", 
      "America/Nipigon", 
      "America/Thunder_Bay", 
      "America/Iqaluit", 
      "America/Pangnirtung", 
      "America/Atikokan", 
      "America/Winnipeg", 
      "America/Rainy_River", 
      "America/Resolute", 
      "America/Rankin_Inlet", 
      "America/Regina", 
      "America/Swift_Current", 
      "America/Edmonton", 
      "America/Cambridge_Bay", 
      "America/Yellowknife", 
      "America/Inuvik", 
      "America/Creston", 
      "America/Dawson_Creek", 
      "America/Fort_Nelson", 
      "America/Vancouver", 
      "America/Whitehorse", 
      "America/Dawson" 
    ] 
  }, 
  { 
    "iso_3166_1": "CC", 
    "zones": [ 
      "Indian/Cocos" 
    ] 
  }, 
  { 
    "iso_3166_1": "CD", 
    "zones": [ 
      "Africa/Maputo", 
      "Africa/Lagos" 
    ] 
  }, 
  { 
    "iso_3166_1": "CF", 
    "zones": [ 
      "Africa/Lagos" 
    ] 
  }, 
  { 
    "iso_3166_1": "CG", 
    "zones": [ 
      "Africa/Lagos" 
    ] 
  }, 
  { 
    "iso_3166_1": "CH", 
    "zones": [ 
      "Europe/Zurich" 
    ] 
  }, 
  { 
    "iso_3166_1": "CI", 
    "zones": [ 
      "Africa/Abidjan" 
    ] 
  }, 
  { 
    "iso_3166_1": "CK", 
    "zones": [ 
      "Pacific/Rarotonga" 
    ] 
  }, 
  { 
    "iso_3166_1": "CL", 
    "zones": [ 
      "America/Santiago", 
      "America/Punta_Arenas", 
      "Pacific/Easter" 
    ] 
  }, 
  { 
    "iso_3166_1": "CM", 
    "zones": [ 
      "Africa/Lagos" 
    ] 
  }, 
  { 
    "iso_3166_1": "CN", 
    "zones": [ 
      "Asia/Shanghai", 
      "Asia/Urumqi" 
    ] 
  }, 
  { 
    "iso_3166_1": "CO", 
    "zones": [ 
      "America/Bogota" 
    ] 
  }, 
  { 
    "iso_3166_1": "CR", 
    "zones": [ 
      "America/Costa_Rica" 
    ] 
  }, 
  { 
    "iso_3166_1": "CU", 
    "zones": [ 
      "America/Havana" 
    ] 
  }, 
  { 
    "iso_3166_1": "CV", 
    "zones": [ 
      "Atlantic/Cape_Verde" 
    ] 
  }, 
  { 
    "iso_3166_1": "CW", 
    "zones": [ 
      "America/Curacao" 
    ] 
  }, 
  { 
    "iso_3166_1": "CX", 
    "zones": [ 
      "Indian/Christmas" 
    ] 
  }, 
  { 
    "iso_3166_1": "CY", 
    "zones": [ 
      "Asia/Nicosia", 
      "Asia/Famagusta" 
    ] 
  }, 
  { 
    "iso_3166_1": "CZ", 
    "zones": [ 
      "Europe/Prague" 
    ] 
  }, 
  { 
    "iso_3166_1": "DE", 
    "zones": [ 
      "Europe/Berlin", 
      "Europe/Zurich" 
    ] 
  }, 
  { 
    "iso_3166_1": "DJ", 
    "zones": [ 
      "Africa/Nairobi" 
    ] 
  }, 
  { 
    "iso_3166_1": "DK", 
    "zones": [ 
      "Europe/Copenhagen" 
    ] 
  }, 
  { 
    "iso_3166_1": "DM", 
    "zones": [ 
      "America/Port_of_Spain" 
    ] 
  }, 
  { 
    "iso_3166_1": "DO", 
    "zones": [ 
      "America/Santo_Domingo" 
    ] 
  }, 
  { 
    "iso_3166_1": "DZ", 
    "zones": [ 
      "Africa/Algiers" 
    ] 
  }, 
  { 
    "iso_3166_1": "EC", 
    "zones": [ 
      "America/Guayaquil", 
      "Pacific/Galapagos" 
    ] 
  }, 
  { 
    "iso_3166_1": "EE", 
    "zones": [ 
      "Europe/Tallinn" 
    ] 
  }, 
  { 
    "iso_3166_1": "EG", 
    "zones": [ 
      "Africa/Cairo" 
    ] 
  }, 
  { 
    "iso_3166_1": "EH", 
    "zones": [ 
      "Africa/El_Aaiun" 
    ] 
  }, 
  { 
    "iso_3166_1": "ER", 
    "zones": [ 
      "Africa/Nairobi" 
    ] 
  }, 
  { 
    "iso_3166_1": "ES", 
    "zones": [ 
      "Europe/Madrid", 
      "Africa/Ceuta", 
      "Atlantic/Canary" 
    ] 
  }, 
  { 
    "iso_3166_1": "ET", 
    "zones": [ 
      "Africa/Nairobi" 
    ] 
  }, 
  { 
    "iso_3166_1": "FI", 
    "zones": [ 
      "Europe/Helsinki" 
    ] 
  }, 
  { 
    "iso_3166_1": "FJ", 
    "zones": [ 
      "Pacific/Fiji" 
    ] 
  }, 
  { 
    "iso_3166_1": "FK", 
    "zones": [ 
      "Atlantic/Stanley" 
    ] 
  }, 
  { 
    "iso_3166_1": "FM", 
    "zones": [ 
      "Pacific/Chuuk", 
      "Pacific/Pohnpei", 
      "Pacific/Kosrae" 
    ] 
  }, 
  { 
    "iso_3166_1": "FO", 
    "zones": [ 
      "Atlantic/Faroe" 
    ] 
  }, 
  { 
    "iso_3166_1": "FR", 
    "zones": [ 
      "Europe/Paris" 
    ] 
  }, 
  { 
    "iso_3166_1": "GA", 
    "zones": [ 
      "Africa/Lagos" 
    ] 
  }, 
  { 
    "iso_3166_1": "GB", 
    "zones": [ 
      "Europe/London" 
    ] 
  }, 
  { 
    "iso_3166_1": "GD", 
    "zones": [ 
      "America/Port_of_Spain" 
    ] 
  }, 
  { 
    "iso_3166_1": "GE", 
    "zones": [ 
      "Asia/Tbilisi" 
    ] 
  }, 
  { 
    "iso_3166_1": "GF", 
    "zones": [ 
      "America/Cayenne" 
    ] 
  }, 
  { 
    "iso_3166_1": "GG", 
    "zones": [ 
      "Europe/London" 
    ] 
  }, 
  { 
    "iso_3166_1": "GH", 
    "zones": [ 
      "Africa/Accra" 
    ] 
  }, 
  { 
    "iso_3166_1": "GI", 
    "zones": [ 
      "Europe/Gibraltar" 
    ] 
  }, 
  { 
    "iso_3166_1": "GL", 
    "zones": [ 
      "America/Godthab", 
      "America/Danmarkshavn", 
      "America/Scoresbysund", 
      "America/Thule" 
    ] 
  }, 
  { 
    "iso_3166_1": "GM", 
    "zones": [ 
      "Africa/Abidjan" 
    ] 
  }, 
  { 
    "iso_3166_1": "GN", 
    "zones": [ 
      "Africa/Abidjan" 
    ] 
  }, 
  { 
    "iso_3166_1": "GP", 
    "zones": [ 
      "America/Port_of_Spain" 
    ] 
  }, 
  { 
    "iso_3166_1": "GQ", 
    "zones": [ 
      "Africa/Lagos" 
    ] 
  }, 
  { 
    "iso_3166_1": "GR", 
    "zones": [ 
      "Europe/Athens" 
    ] 
  }, 
  { 
    "iso_3166_1": "GS", 
    "zones": [ 
      "Atlantic/South_Georgia" 
    ] 
  }, 
  { 
    "iso_3166_1": "GT", 
    "zones": [ 
      "America/Guatemala" 
    ] 
  }, 
  { 
    "iso_3166_1": "GU", 
    "zones": [ 
      "Pacific/Guam" 
    ] 
  }, 
  { 
    "iso_3166_1": "GW", 
    "zones": [ 
      "Africa/Bissau" 
    ] 
  }, 
  { 
    "iso_3166_1": "GY", 
    "zones": [ 
      "America/Guyana" 
    ] 
  }, 
  { 
    "iso_3166_1": "HK", 
    "zones": [ 
      "Asia/Hong_Kong" 
    ] 
  }, 
  { 
    "iso_3166_1": "HM", 
    "zones": [] 
  }, 
  { 
    "iso_3166_1": "HN", 
    "zones": [ 
      "America/Tegucigalpa" 
    ] 
  }, 
  { 
    "iso_3166_1": "HR", 
    "zones": [ 
      "Europe/Belgrade" 
    ] 
  }, 
  { 
    "iso_3166_1": "HT", 
    "zones": [ 
      "America/Port-au-Prince" 
    ] 
  }, 
  { 
    "iso_3166_1": "HU", 
    "zones": [ 
      "Europe/Budapest" 
    ] 
  }, 
  { 
    "iso_3166_1": "ID", 
    "zones": [ 
      "Asia/Jakarta", 
      "Asia/Pontianak", 
      "Asia/Makassar", 
      "Asia/Jayapura" 
    ] 
  }, 
  { 
    "iso_3166_1": "IE", 
    "zones": [ 
      "Europe/Dublin" 
    ] 
  }, 
  { 
    "iso_3166_1": "IL", 
    "zones": [ 
      "Asia/Jerusalem" 
    ] 
  }, 
  { 
    "iso_3166_1": "IM", 
    "zones": [ 
      "Europe/London" 
    ] 
  }, 
  { 
    "iso_3166_1": "IN", 
    "zones": [ 
      "Asia/Kolkata" 
    ] 
  }, 
  { 
    "iso_3166_1": "IO", 
    "zones": [ 
      "Indian/Chagos" 
    ] 
  }, 
  { 
    "iso_3166_1": "IQ", 
    "zones": [ 
      "Asia/Baghdad" 
    ] 
  }, 
  { 
    "iso_3166_1": "IR", 
    "zones": [ 
      "Asia/Tehran" 
    ] 
  }, 
  { 
    "iso_3166_1": "IS", 
    "zones": [ 
      "Atlantic/Reykjavik" 
    ] 
  }, 
  { 
    "iso_3166_1": "IT", 
    "zones": [ 
      "Europe/Rome" 
    ] 
  }, 
  { 
    "iso_3166_1": "JE", 
    "zones": [ 
      "Europe/London" 
    ] 
  }, 
  { 
    "iso_3166_1": "JM", 
    "zones": [ 
      "America/Jamaica" 
    ] 
  }, 
  { 
    "iso_3166_1": "JO", 
    "zones": [ 
      "Asia/Amman" 
    ] 
  }, 
  { 
    "iso_3166_1": "JP", 
    "zones": [ 
      "Asia/Tokyo" 
    ] 
  }, 
  { 
    "iso_3166_1": "KE", 
    "zones": [ 
      "Africa/Nairobi" 
    ] 
  }, 
  { 
    "iso_3166_1": "KG", 
    "zones": [ 
      "Asia/Bishkek" 
    ] 
  }, 
  { 
    "iso_3166_1": "KH", 
    "zones": [ 
      "Asia/Bangkok" 
    ] 
  }, 
  { 
    "iso_3166_1": "KI", 
    "zones": [ 
      "Pacific/Tarawa", 
      "Pacific/Enderbury", 
      "Pacific/Kiritimati" 
    ] 
  }, 
  { 
    "iso_3166_1": "KM", 
    "zones": [ 
      "Africa/Nairobi" 
    ] 
  }, 
  { 
    "iso_3166_1": "KN", 
    "zones": [ 
      "America/Port_of_Spain" 
    ] 
  }, 
  { 
    "iso_3166_1": "KP", 
    "zones": [ 
      "Asia/Pyongyang" 
    ] 
  }, 
  { 
    "iso_3166_1": "KR", 
    "zones": [ 
      "Asia/Seoul" 
    ] 
  }, 
  { 
    "iso_3166_1": "KW", 
    "zones": [ 
      "Asia/Riyadh" 
    ] 
  }, 
  { 
    "iso_3166_1": "KY", 
    "zones": [ 
      "America/Panama" 
    ] 
  }, 
  { 
    "iso_3166_1": "KZ", 
    "zones": [ 
      "Asia/Almaty", 
      "Asia/Qyzylorda", 
      "Asia/Aqtobe", 
      "Asia/Aqtau", 
      "Asia/Atyrau", 
      "Asia/Oral" 
    ] 
  }, 
  { 
    "iso_3166_1": "LA", 
    "zones": [ 
      "Asia/Bangkok" 
    ] 
  }, 
  { 
    "iso_3166_1": "LB", 
    "zones": [ 
      "Asia/Beirut" 
    ] 
  }, 
  { 
    "iso_3166_1": "LC", 
    "zones": [ 
      "America/Port_of_Spain" 
    ] 
  }, 
  { 
    "iso_3166_1": "LI", 
    "zones": [ 
      "Europe/Zurich" 
    ] 
  }, 
  { 
    "iso_3166_1": "LK", 
    "zones": [ 
      "Asia/Colombo" 
    ] 
  }, 
  { 
    "iso_3166_1": "LR", 
    "zones": [ 
      "Africa/Monrovia" 
    ] 
  }, 
  { 
    "iso_3166_1": "LS", 
    "zones": [ 
      "Africa/Johannesburg" 
    ] 
  }, 
  { 
    "iso_3166_1": "LT", 
    "zones": [ 
      "Europe/Vilnius" 
    ] 
  }, 
  { 
    "iso_3166_1": "LU", 
    "zones": [ 
      "Europe/Luxembourg" 
    ] 
  }, 
  { 
    "iso_3166_1": "LV", 
    "zones": [ 
      "Europe/Riga" 
    ] 
  }, 
  { 
    "iso_3166_1": "LY", 
    "zones": [ 
      "Africa/Tripoli" 
    ] 
  }, 
  { 
    "iso_3166_1": "MA", 
    "zones": [ 
      "Africa/Casablanca" 
    ] 
  }, 
  { 
    "iso_3166_1": "MC", 
    "zones": [ 
      "Europe/Monaco" 
    ] 
  }, 
  { 
    "iso_3166_1": "MD", 
    "zones": [ 
      "Europe/Chisinau" 
    ] 
  }, 
  { 
    "iso_3166_1": "ME", 
    "zones": [ 
      "Europe/Belgrade" 
    ] 
  }, 
  { 
    "iso_3166_1": "MF", 
    "zones": [ 
      "America/Port_of_Spain" 
    ] 
  }, 
  { 
    "iso_3166_1": "MG", 
    "zones": [ 
      "Africa/Nairobi" 
    ] 
  }, 
  { 
    "iso_3166_1": "MH", 
    "zones": [ 
      "Pacific/Majuro", 
      "Pacific/Kwajalein" 
    ] 
  }, 
  { 
    "iso_3166_1": "MK", 
    "zones": [ 
      "Europe/Belgrade" 
    ] 
  }, 
  { 
    "iso_3166_1": "ML", 
    "zones": [ 
      "Africa/Abidjan" 
    ] 
  }, 
  { 
    "iso_3166_1": "MM", 
    "zones": [ 
      "Asia/Yangon" 
    ] 
  }, 
  { 
    "iso_3166_1": "MN", 
    "zones": [ 
      "Asia/Ulaanbaatar", 
      "Asia/Hovd", 
      "Asia/Choibalsan" 
    ] 
  }, 
  { 
    "iso_3166_1": "MO", 
    "zones": [ 
      "Asia/Macau" 
    ] 
  }, 
  { 
    "iso_3166_1": "MP", 
    "zones": [ 
      "Pacific/Guam" 
    ] 
  }, 
  { 
    "iso_3166_1": "MQ", 
    "zones": [ 
      "America/Martinique" 
    ] 
  }, 
  { 
    "iso_3166_1": "MR", 
    "zones": [ 
      "Africa/Abidjan" 
    ] 
  }, 
  { 
    "iso_3166_1": "MS", 
    "zones": [ 
      "America/Port_of_Spain" 
    ] 
  }, 
  { 
    "iso_3166_1": "MT", 
    "zones": [ 
      "Europe/Malta" 
    ] 
  }, 
  { 
    "iso_3166_1": "MU", 
    "zones": [ 
      "Indian/Mauritius" 
    ] 
  }, 
  { 
    "iso_3166_1": "MV", 
    "zones": [ 
      "Indian/Maldives" 
    ] 
  }, 
  { 
    "iso_3166_1": "MW", 
    "zones": [ 
      "Africa/Maputo" 
    ] 
  }, 
  { 
    "iso_3166_1": "MX", 
    "zones": [ 
      "America/Mexico_City", 
      "America/Cancun", 
      "America/Merida", 
      "America/Monterrey", 
      "America/Matamoros", 
      "America/Mazatlan", 
      "America/Chihuahua", 
      "America/Ojinaga", 
      "America/Hermosillo", 
      "America/Tijuana", 
      "America/Bahia_Banderas" 
    ] 
  }, 
  { 
    "iso_3166_1": "MY", 
    "zones": [ 
      "Asia/Kuala_Lumpur", 
      "Asia/Kuching" 
    ] 
  }, 
  { 
    "iso_3166_1": "MZ", 
    "zones": [ 
      "Africa/Maputo" 
    ] 
  }, 
  { 
    "iso_3166_1": "NA", 
    "zones": [ 
      "Africa/Windhoek" 
    ] 
  }, 
  { 
    "iso_3166_1": "NC", 
    "zones": [ 
      "Pacific/Noumea" 
    ] 
  }, 
  { 
    "iso_3166_1": "NE", 
    "zones": [ 
      "Africa/Lagos" 
    ] 
  }, 
  { 
    "iso_3166_1": "NF", 
    "zones": [ 
      "Pacific/Norfolk" 
    ] 
  }, 
  { 
    "iso_3166_1": "NG", 
    "zones": [ 
      "Africa/Lagos" 
    ] 
  }, 
  { 
    "iso_3166_1": "NI", 
    "zones": [ 
      "America/Managua" 
    ] 
  }, 
  { 
    "iso_3166_1": "NL", 
    "zones": [ 
      "Europe/Amsterdam" 
    ] 
  }, 
  { 
    "iso_3166_1": "NO", 
    "zones": [ 
      "Europe/Oslo" 
    ] 
  }, 
  { 
    "iso_3166_1": "NP", 
    "zones": [ 
      "Asia/Kathmandu" 
    ] 
  }, 
  { 
    "iso_3166_1": "NR", 
    "zones": [ 
      "Pacific/Nauru" 
    ] 
  }, 
  { 
    "iso_3166_1": "NU", 
    "zones": [ 
      "Pacific/Niue" 
    ] 
  }, 
  { 
    "iso_3166_1": "NZ", 
    "zones": [ 
      "Pacific/Auckland", 
      "Pacific/Chatham" 
    ] 
  }, 
  { 
    "iso_3166_1": "OM", 
    "zones": [ 
      "Asia/Dubai" 
    ] 
  }, 
  { 
    "iso_3166_1": "PA", 
    "zones": [ 
      "America/Panama" 
    ] 
  }, 
  { 
    "iso_3166_1": "PE", 
    "zones": [ 
      "America/Lima" 
    ] 
  }, 
  { 
    "iso_3166_1": "PF", 
    "zones": [ 
      "Pacific/Tahiti", 
      "Pacific/Marquesas", 
      "Pacific/Gambier" 
    ] 
  }, 
  { 
    "iso_3166_1": "PG", 
    "zones": [ 
      "Pacific/Port_Moresby", 
      "Pacific/Bougainville" 
    ] 
  }, 
  { 
    "iso_3166_1": "PH", 
    "zones": [ 
      "Asia/Manila" 
    ] 
  }, 
  { 
    "iso_3166_1": "PK", 
    "zones": [ 
      "Asia/Karachi" 
    ] 
  }, 
  { 
    "iso_3166_1": "PL", 
    "zones": [ 
      "Europe/Warsaw" 
    ] 
  }, 
  { 
    "iso_3166_1": "PM", 
    "zones": [ 
      "America/Miquelon" 
    ] 
  }, 
  { 
    "iso_3166_1": "PN", 
    "zones": [ 
      "Pacific/Pitcairn" 
    ] 
  }, 
  { 
    "iso_3166_1": "PR", 
    "zones": [ 
      "America/Puerto_Rico" 
    ] 
  }, 
  { 
    "iso_3166_1": "PS", 
    "zones": [ 
      "Asia/Gaza", 
      "Asia/Hebron" 
    ] 
  }, 
  { 
    "iso_3166_1": "PT", 
    "zones": [ 
      "Europe/Lisbon", 
      "Atlantic/Madeira", 
      "Atlantic/Azores" 
    ] 
  }, 
  { 
    "iso_3166_1": "PW", 
    "zones": [ 
      "Pacific/Palau" 
    ] 
  }, 
  { 
    "iso_3166_1": "PY", 
    "zones": [ 
      "America/Asuncion" 
    ] 
  }, 
  { 
    "iso_3166_1": "QA", 
    "zones": [ 
      "Asia/Qatar" 
    ] 
  }, 
  { 
    "iso_3166_1": "RE", 
    "zones": [ 
      "Indian/Reunion" 
    ] 
  }, 
  { 
    "iso_3166_1": "RO", 
    "zones": [ 
      "Europe/Bucharest" 
    ] 
  }, 
  { 
    "iso_3166_1": "RS", 
    "zones": [ 
      "Europe/Belgrade" 
    ] 
  }, 
  { 
    "iso_3166_1": "RU", 
    "zones": [ 
      "Europe/Kaliningrad", 
      "Europe/Moscow", 
      "Europe/Simferopol", 
      "Europe/Volgograd", 
      "Europe/Kirov", 
      "Europe/Astrakhan", 
      "Europe/Saratov", 
      "Europe/Ulyanovsk", 
      "Europe/Samara", 
      "Asia/Yekaterinburg", 
      "Asia/Omsk", 
      "Asia/Novosibirsk", 
      "Asia/Barnaul", 
      "Asia/Tomsk", 
      "Asia/Novokuznetsk", 
      "Asia/Krasnoyarsk", 
      "Asia/Irkutsk", 
      "Asia/Chita", 
      "Asia/Yakutsk", 
      "Asia/Khandyga", 
      "Asia/Vladivostok", 
      "Asia/Ust-Nera", 
      "Asia/Magadan", 
      "Asia/Sakhalin", 
      "Asia/Srednekolymsk", 
      "Asia/Kamchatka", 
      "Asia/Anadyr" 
    ] 
  }, 
  { 
    "iso_3166_1": "RW", 
    "zones": [ 
      "Africa/Maputo" 
    ] 
  }, 
  { 
    "iso_3166_1": "SA", 
    "zones": [ 
      "Asia/Riyadh" 
    ] 
  }, 
  { 
    "iso_3166_1": "SB", 
    "zones": [ 
      "Pacific/Guadalcanal" 
    ] 
  }, 
  { 
    "iso_3166_1": "SC", 
    "zones": [ 
      "Indian/Mahe" 
    ] 
  }, 
  { 
    "iso_3166_1": "SD", 
    "zones": [ 
      "Africa/Khartoum" 
    ] 
  }, 
  { 
    "iso_3166_1": "SE", 
    "zones": [ 
      "Europe/Stockholm" 
    ] 
  }, 
  { 
    "iso_3166_1": "SG", 
    "zones": [ 
      "Asia/Singapore" 
    ] 
  }, 
  { 
    "iso_3166_1": "SH", 
    "zones": [ 
      "Africa/Abidjan" 
    ] 
  }, 
  { 
    "iso_3166_1": "SI", 
    "zones": [ 
      "Europe/Belgrade" 
    ] 
  }, 
  { 
    "iso_3166_1": "SJ", 
    "zones": [ 
      "Europe/Oslo" 
    ] 
  }, 
  { 
    "iso_3166_1": "SK", 
    "zones": [ 
      "Europe/Prague" 
    ] 
  }, 
  { 
    "iso_3166_1": "SL", 
    "zones": [ 
      "Africa/Abidjan" 
    ] 
  }, 
  { 
    "iso_3166_1": "SM", 
    "zones": [ 
      "Europe/Rome" 
    ] 
  }, 
  { 
    "iso_3166_1": "SN", 
    "zones": [ 
      "Africa/Abidjan" 
    ] 
  }, 
  { 
    "iso_3166_1": "SO", 
    "zones": [ 
      "Africa/Nairobi" 
    ] 
  }, 
  { 
    "iso_3166_1": "SR", 
    "zones": [ 
      "America/Paramaribo" 
    ] 
  }, 
  { 
    "iso_3166_1": "SS", 
    "zones": [ 
      "Africa/Juba" 
    ] 
  }, 
  { 
    "iso_3166_1": "ST", 
    "zones": [ 
      "Africa/Abidjan" 
    ] 
  }, 
  { 
    "iso_3166_1": "SV", 
    "zones": [ 
      "America/El_Salvador" 
    ] 
  }, 
  { 
    "iso_3166_1": "SX", 
    "zones": [ 
      "America/Curacao" 
    ] 
  }, 
  { 
    "iso_3166_1": "SY", 
    "zones": [ 
      "Asia/Damascus" 
    ] 
  }, 
  { 
    "iso_3166_1": "SZ", 
    "zones": [ 
      "Africa/Johannesburg" 
    ] 
  }, 
  { 
    "iso_3166_1": "TC", 
    "zones": [ 
      "America/Grand_Turk" 
    ] 
  }, 
  { 
    "iso_3166_1": "TD", 
    "zones": [ 
      "Africa/Ndjamena" 
    ] 
  }, 
  { 
    "iso_3166_1": "TF", 
    "zones": [ 
      "Indian/Kerguelen", 
      "Indian/Reunion" 
    ] 
  }, 
  { 
    "iso_3166_1": "TG", 
    "zones": [ 
      "Africa/Abidjan" 
    ] 
  }, 
  { 
    "iso_3166_1": "TH", 
    "zones": [ 
      "Asia/Bangkok" 
    ] 
  }, 
  { 
    "iso_3166_1": "TJ", 
    "zones": [ 
      "Asia/Dushanbe" 
    ] 
  }, 
  { 
    "iso_3166_1": "TK", 
    "zones": [ 
      "Pacific/Fakaofo" 
    ] 
  }, 
  { 
    "iso_3166_1": "TL", 
    "zones": [ 
      "Asia/Dili" 
    ] 
  }, 
  { 
    "iso_3166_1": "TM", 
    "zones": [ 
      "Asia/Ashgabat" 
    ] 
  }, 
  { 
    "iso_3166_1": "TN", 
    "zones": [ 
      "Africa/Tunis" 
    ] 
  }, 
  { 
    "iso_3166_1": "TO", 
    "zones": [ 
      "Pacific/Tongatapu" 
    ] 
  }, 
  { 
    "iso_3166_1": "TR", 
    "zones": [ 
      "Europe/Istanbul" 
    ] 
  }, 
  { 
    "iso_3166_1": "TT", 
    "zones": [ 
      "America/Port_of_Spain" 
    ] 
  }, 
  { 
    "iso_3166_1": "TV", 
    "zones": [ 
      "Pacific/Funafuti" 
    ] 
  }, 
  { 
    "iso_3166_1": "TW", 
    "zones": [ 
      "Asia/Taipei" 
    ] 
  }, 
  { 
    "iso_3166_1": "TZ", 
    "zones": [ 
      "Africa/Nairobi" 
    ] 
  }, 
  { 
    "iso_3166_1": "UA", 
    "zones": [ 
      "Europe/Kiev", 
      "Europe/Uzhgorod", 
      "Europe/Zaporozhye" 
    ] 
  }, 
  { 
    "iso_3166_1": "UG", 
    "zones": [ 
      "Africa/Nairobi" 
    ] 
  }, 
  { 
    "iso_3166_1": "UM", 
    "zones": [ 
      "Pacific/Wake", 
      "Pacific/Pago_Pago", 
      "Pacific/Honolulu" 
    ] 
  }, 
  { 
    "iso_3166_1": "US", 
    "zones": [ 
      "America/New_York", 
      "America/Detroit", 
      "America/Kentucky/Louisville", 
      "America/Kentucky/Monticello", 
      "America/Indiana/Indianapolis", 
      "America/Indiana/Vincennes", 
      "America/Indiana/Winamac", 
      "America/Indiana/Marengo", 
      "America/Indiana/Petersburg", 
      "America/Indiana/Vevay", 
      "America/Chicago", 
      "America/Indiana/Tell_City", 
      "America/Indiana/Knox", 
      "America/Menominee", 
      "America/North_Dakota/Center", 
      "America/North_Dakota/New_Salem", 
      "America/North_Dakota/Beulah", 
      "America/Denver", 
      "America/Boise", 
      "America/Phoenix", 
      "America/Los_Angeles", 
      "America/Anchorage", 
      "America/Juneau", 
      "America/Sitka", 
      "America/Metlakatla", 
      "America/Yakutat", 
      "America/Nome", 
      "America/Adak", 
      "Pacific/Honolulu" 
    ] 
  }, 
  { 
    "iso_3166_1": "UY", 
    "zones": [ 
      "America/Montevideo" 
    ] 
  }, 
  { 
    "iso_3166_1": "UZ", 
    "zones": [ 
      "Asia/Samarkand", 
      "Asia/Tashkent" 
    ] 
  }, 
  { 
    "iso_3166_1": "VA", 
    "zones": [ 
      "Europe/Rome" 
    ] 
  }, 
  { 
    "iso_3166_1": "VC", 
    "zones": [ 
      "America/Port_of_Spain" 
    ] 
  }, 
  { 
    "iso_3166_1": "VE", 
    "zones": [ 
      "America/Caracas" 
    ] 
  }, 
  { 
    "iso_3166_1": "VG", 
    "zones": [ 
      "America/Port_of_Spain" 
    ] 
  }, 
  { 
    "iso_3166_1": "VI", 
    "zones": [ 
      "America/Port_of_Spain" 
    ] 
  }, 
  { 
    "iso_3166_1": "VN", 
    "zones": [ 
      "Asia/Ho_Chi_Minh", 
      "Asia/Bangkok" 
    ] 
  }, 
  { 
    "iso_3166_1": "VU", 
    "zones": [ 
      "Pacific/Efate" 
    ] 
  }, 
  { 
    "iso_3166_1": "WF", 
    "zones": [ 
      "Pacific/Wallis" 
    ] 
  }, 
  { 
    "iso_3166_1": "WS", 
    "zones": [ 
      "Pacific/Apia" 
    ] 
  }, 
  { 
    "iso_3166_1": "YE", 
    "zones": [ 
      "Asia/Riyadh" 
    ] 
  }, 
  { 
    "iso_3166_1": "YT", 
    "zones": [ 
      "Africa/Nairobi" 
    ] 
  }, 
  { 
    "iso_3166_1": "ZA", 
    "zones": [ 
      "Africa/Johannesburg" 
    ] 
  }, 
  { 
    "iso_3166_1": "ZM", 
    "zones": [ 
      "Africa/Maputo" 
    ] 
  }, 
  { 
    "iso_3166_1": "ZW", 
    "zones": [ 
      "Africa/Maputo" 
    ] 
  } 
] 

Get Details 

{ 
  "credit_type": "cast", 
  "department": "Actors", 
  "job": "Actor", 
  "media": { 
    "id": 1396, 
    "name": "English Breaking Bad", 
    "original_name": "Breaking Bad", 
    "character": "Walter White", 
    "episodes": [], 
    "seasons": [ 
      { 
        "air_date": "2012-07-15", 
        "poster_path": "/elHbM2Ke72euRDXofdewP9GY5Y8.jpg", 
        "season_number": 5 
      } 
    ] 
  }, 
  "media_type": "tv", 
  "id": "52542282760ee313280017f9", 
  "person": { 
    "name": "Bryan Cranston", 
    "id": 17419 
  } 
} 

Movie Discover 

{ 
  "page": 1, 
  "results": [ 
    { 
      "poster_path": null, 
      "adult": false, 
      "overview": "Go behind the scenes during One Directions sell out \"Take Me Home\" tour and experience life on the road.", 
      "release_date": "2013-08-30", 
      "genre_ids": [ 
        99, 
        10402 
      ], 
      "id": 164558, 
      "original_title": "One Direction: This Is Us", 
      "original_language": "en", 
      "title": "One Direction: This Is Us", 
      "backdrop_path": null, 
      "popularity": 1.166982, 
      "vote_count": 55, 
      "video": false, 
      "vote_average": 8.45 
    }, 
    { 
      "poster_path": null, 
      "adult": false, 
      "overview": "", 
      "release_date": "1954-06-22", 
      "genre_ids": [ 
        80, 
        18 
      ], 
      "id": 654, 
      "original_title": "On the Waterfront", 
      "original_language": "en", 
      "title": "On the Waterfront", 
      "backdrop_path": null, 
      "popularity": 1.07031, 
      "vote_count": 51, 
      "video": false, 
      "vote_average": 8.19 
    }, 
    { 
      "poster_path": null, 
      "adult": false, 
      "overview": "A team of allied saboteurs are assigned an impossible mission: infiltrate an impregnable Nazi-held island and destroy the two enormous long-range field guns that prevent the rescue of 2,000 trapped British soldiers.", 
      "release_date": "1961-04-27", 
      "genre_ids": [ 
        28, 
        18, 
        12, 
        10752 
      ], 
      "id": 10911, 
      "original_title": "The Guns of Navarone", 
      "original_language": "en", 
      "title": "The Guns of Navarone", 
      "backdrop_path": null, 
      "popularity": 1.075583, 
      "vote_count": 50, 
      "video": false, 
      "vote_average": 7.56 
    }, 
    { 
      "poster_path": null, 
      "adult": false, 
      "overview": "The defendant In a murder trial says that he suffered temporary insanity after the victim had raped his wife. What is the truth, is his attorney being played, and will he win his case?", 
      "release_date": "1959-07-01", 
      "genre_ids": [ 
        80, 
        18, 
        9648, 
        53 
      ], 
      "id": 93, 
      "original_title": "Anatomy of a Murder", 
      "original_language": "en", 
      "title": "Anatomy of a Murder", 
      "backdrop_path": null, 
      "popularity": 1.05255, 
      "vote_count": 37, 
      "video": false, 
      "vote_average": 7.45 
    }, 
    { 
      "poster_path": null, 
      "adult": false, 
      "overview": "Ellie Andrews has just tied the knot with society aviator King Westley when she is whisked away to her father's yacht and out of King's clutches. Ellie jumps ship and eventually winds up on a bus headed back to her husband. Reluctantly she must accept the help of out-of- work reporter Peter Warne. Actually, Warne doesn't give her any choice: either she sticks with him until he gets her back to her husband, or he'll blow the whistle on Ellie to her father. Either way, Peter gets what he wants... a really juicy newspaper story!", 
      "release_date": "1934-02-22", 
      "genre_ids": [ 
        35, 
        10749 
      ], 
      "id": 3078, 
      "original_title": "It Happened One Night", 
      "original_language": "en", 
      "title": "It Happened One Night", 
      "backdrop_path": null, 
      "popularity": 1.092661, 
      "vote_count": 48, 
      "video": false, 
      "vote_average": 7.3 
    }, 
    { 
      "poster_path": null, 
      "adult": false, 
      "overview": "Lawrence of Arabia is the classic film from David Lean starring Peter O’Toole and based on the autobiography from Thomas Edward Lawrence who during the first World War was on assignment by the British Empire in Arabia. The film would become a cult classic and is known today as a masterpiece.", 
      "release_date": "1962-12-10", 
      "genre_ids": [ 
        12, 
        18, 
        36, 
        10752 
      ], 
      "id": 947, 
      "original_title": "Lawrence of Arabia", 
      "original_language": "en", 
      "title": "Lawrence of Arabia", 
      "backdrop_path": null, 
      "popularity": 1.080568, 
      "vote_count": 269, 
      "video": false, 
      "vote_average": 7.23 
    }, 
    { 
      "poster_path": null, 
      "adult": false, 
      "overview": "Hildy Johnson has divorced Walter Burns and visits his office to tell him that she is engaged to another man and that they are going to get married the day after. Walter Burns can't let that happen and frames the other man, Bruce Baldwin, for a lot of stuff getting him into trouble all the time, while he tries to steer Hildy back into her old job as his employee (editor of his newspaper).", 
      "release_date": "1940-01-11", 
      "genre_ids": [ 
        35, 
        18, 
        10749 
      ], 
      "id": 3085, 
      "original_title": "His Girl Friday", 
      "original_language": "en", 
      "title": "His Girl Friday", 
      "backdrop_path": null, 
      "popularity": 1.026144, 
      "vote_count": 20, 
      "video": false, 
      "vote_average": 7.2 
    }, 
    { 
      "poster_path": null, 
      "adult": false, 
      "overview": "Tough cop Dave Bannion takes on a politically powerful crime syndicate.", 
      "release_date": "1953-10-14", 
      "genre_ids": [ 
        80, 
        18 
      ], 
      "id": 14580, 
      "original_title": "The Big Heat", 
      "original_language": "en", 
      "title": "The Big Heat", 
      "backdrop_path": null, 
      "popularity": 1.01933, 
      "vote_count": 10, 
      "video": false, 
      "vote_average": 7.2 
    }, 
    { 
      "poster_path": null, 
      "adult": false, 
      "overview": "Rich Mr. Dashwood dies, leaving his second wife and her daughters poor by the rules of inheritance. Two daughters are the titular opposites.", 
      "release_date": "1995-12-13", 
      "genre_ids": [ 
        18, 
        10749 
      ], 
      "id": 4584, 
      "original_title": "Sense and Sensibility", 
      "original_language": "en", 
      "title": "Sense and Sensibility", 
      "backdrop_path": null, 
      "popularity": 1.113657, 
      "vote_count": 82, 
      "video": false, 
      "vote_average": 7.15 
    }, 
    { 
      "poster_path": null, 
      "adult": false, 
      "overview": "Ted Kramer is a career man for whom his work comes before his family. His wife Joanna cannot take this anymore, so she decides to leave him. Ted is now faced with the tasks of housekeeping and taking care of himself and their young son Billy. When he has learned to adjust his life to these new responsibilities, Joanna resurfaces and wants Billy back. Ted however refuses to give him up, so they go to court to fight for the custody of their son.", 
      "release_date": "1979-12-19", 
      "genre_ids": [ 
        18 
      ], 
      "id": 12102, 
      "original_title": "Kramer vs. Kramer", 
      "original_language": "en", 
      "title": "Kramer vs. Kramer", 
      "backdrop_path": null, 
      "popularity": 1.095982, 
      "vote_count": 68, 
      "video": false, 
      "vote_average": 7.15 
    }, 
    { 
      "poster_path": null, 
      "adult": false, 
      "overview": "A rule bound head butler's world of manners and decorum in the household he maintains is tested by the arrival of a housekeeper who falls in love with him in post-WWI Britain. The possibility of romance and his master's cultivation of ties with the Nazi cause challenge his carefully maintained veneer of servitude.", 
      "release_date": "1993-11-12", 
      "genre_ids": [ 
        18, 
        10749 
      ], 
      "id": 1245, 
      "original_title": "The Remains of the Day", 
      "original_language": "en", 
      "title": "The Remains of the Day", 
      "backdrop_path": null, 
      "popularity": 1.051793, 
      "vote_count": 37, 
      "video": false, 
      "vote_average": 7.11 
    }, 
    { 
      "poster_path": null, 
      "adult": false, 
      "overview": "Tale of 19th century New York high society in which a young lawyer falls in love with a woman separated from her husband, while he is engaged to the woman's cousin.", 
      "release_date": "1993-09-17", 
      "genre_ids": [ 
        18, 
        10749 
      ], 
      "id": 10436, 
      "original_title": "The Age of Innocence", 
      "original_language": "en", 
      "title": "The Age of Innocence", 
      "backdrop_path": null, 
      "popularity": 1.086733, 
      "vote_count": 26, 
      "video": false, 
      "vote_average": 7.06 
    }, 
    { 
      "poster_path": null, 
      "adult": false, 
      "overview": "And Now for Something Completely Different is a film spin-off from the television comedy series Monty Python's Flying Circus featuring favourite sketches from the first two seasons.", 
      "release_date": "1971-09-28", 
      "genre_ids": [ 
        35 
      ], 
      "id": 9267, 
      "original_title": "And Now for Something Completely Different", 
      "original_language": "en", 
      "title": "And Now for Something Completely Different", 
      "backdrop_path": null, 
      "popularity": 1.015368, 
      "vote_count": 25, 
      "video": false, 
      "vote_average": 6.98 
    }, 
    { 
      "poster_path": null, 
      "adult": false, 
      "overview": "A narcissistic TV weatherman, along with his attractive-but-distant producer and mawkish cameraman, is sent to report on Groundhog Day in the small town of Punxsutawney, where he finds himself repeating the same day over and over.", 
      "release_date": "1993-02-11", 
      "genre_ids": [ 
        10749, 
        14, 
        18, 
        35 
      ], 
      "id": 137, 
      "original_title": "Groundhog Day", 
      "original_language": "en", 
      "title": "Groundhog Day", 
      "backdrop_path": null, 
      "popularity": 1.113645, 
      "vote_count": 549, 
      "video": false, 
      "vote_average": 6.98 
    }, 
    { 
      "poster_path": null, 
      "adult": false, 
      "overview": "Longfellow Deeds lives in a small town, leading a small town kind of life. When a relative dies and leaves Deeds a fortune, Longfellow moves to the big city where he becomes an instant target for everyone. Deeds outwits them all until Babe Bennett comes along. When small-town boy meets big-city girl anything can, and does, happen.", 
      "release_date": "1936-04-12", 
      "genre_ids": [ 
        35, 
        18 
      ], 
      "id": 24807, 
      "original_title": "Mr. Deeds Goes to Town", 
      "original_language": "en", 
      "title": "Mr. Deeds Goes to Town", 
      "backdrop_path": null, 
      "popularity": 1.018888, 
      "vote_count": 11, 
      "video": false, 
      "vote_average": 6.95 
    }, 
    { 
      "poster_path": null, 
      "adult": false, 
      "overview": "A River Runs Through is a cinematographically stunning true story of Norman Maclean. The story follows Norman and his brother Paul through the experiences of life and growing up, and how their love of fly fishing keeps them together despite varying life circumstances in the untamed west of Montana in the 1920's.", 
      "release_date": "1992-10-09", 
      "genre_ids": [ 
        18 
      ], 
      "id": 293, 
      "original_title": "A River Runs Through It", 
      "original_language": "en", 
      "title": "A River Runs Through It", 
      "backdrop_path": null, 
      "popularity": 1.063204, 
      "vote_count": 69, 
      "video": false, 
      "vote_average": 6.75 
    }, 
    { 
      "poster_path": null, 
      "adult": false, 
      "overview": "This Christmas movie highlights the technological advances of operations at the North Pole, revealing how Santa and his vast army of highly trained elves produce gifts and distribute them around the world in one night. However, every operation has a margin of error… When one of 600 million children to receive a gift from Santa on Christmas Eve is missed, it is deemed \"acceptable\" to all but one, Arthur. Arthur Claus is Santa’s misfit son who executes an unauthorized rookie mission to get the last present half way around the globe before dawn on Christmas morning.", 
      "release_date": "2011-11-23", 
      "genre_ids": [ 
        18, 
        16, 
        10751, 
        35 
      ], 
      "id": 51052, 
      "original_title": "Arthur Christmas", 
      "original_language": "en", 
      "title": "Arthur Christmas", 
      "backdrop_path": null, 
      "popularity": 1.099023, 
      "vote_count": 102, 
      "video": false, 
      "vote_average": 6.72 
    }, 
    { 
      "poster_path": null, 
      "adult": false, 
      "overview": "Football coach Harold Jones befriends Radio, a mentally-challenged man who becomes a student at T.L. Hanna High School in Anderson, South Carolina. Their friendship extends over several decades, where Radio transforms from a shy, tormented man into an inspiration to his community.", 
      "release_date": "2003-10-24", 
      "genre_ids": [ 
        18 
      ], 
      "id": 13920, 
      "original_title": "Radio", 
      "original_language": "en", 
      "title": "Radio", 
      "backdrop_path": null, 
      "popularity": 1.010795, 
      "vote_count": 36, 
      "video": false, 
      "vote_average": 6.71 
    }, 
    { 
      "poster_path": null, 
      "adult": false, 
      "overview": "Amy is only 13 years old when her mother is killed. She goes to Canada to live with her father, an eccentric inventor whom she barely knows. Amy is miserable in her new life... until she discovers a nest of goose eggs that were abandoned when a local forest is torn down. The eggs hatch and Amy becomes \"Mama Goose\". When Winter comes, Amy, and her dad must find a way to lead the birds South...", 
      "release_date": "1996-09-13", 
      "genre_ids": [ 
        28, 
        12, 
        18, 
        10751 
      ], 
      "id": 11076, 
      "original_title": "Fly Away Home", 
      "original_language": "en", 
      "title": "Fly Away Home", 
      "backdrop_path": null, 
      "popularity": 1.022039, 
      "vote_count": 13, 
      "video": false, 
      "vote_average": 6.69 
    }, 
    { 
      "poster_path": null, 
      "adult": false, 
      "overview": "With their father away as a chaplain in the Civil War, Jo, Meg, Beth and Amy grow up with their mother in somewhat reduced circumstances. They are a close family who inevitably have their squabbles and tragedies. But the bond holds even when, later, male friends start to become a part of the household.", 
      "release_date": "1994-12-21", 
      "genre_ids": [ 
        18, 
        10749 
      ], 
      "id": 9587, 
      "original_title": "Little Women", 
      "original_language": "en", 
      "title": "Little Women", 
      "backdrop_path": null, 
      "popularity": 1.051359, 
      "vote_count": 50, 
      "video": false, 
      "vote_average": 6.65 
    } 
  ], 
  "total_results": 61, 
  "total_pages": 4 
} 

TV Discover 

{ 
  "page": 1, 
  "results": [ 
    { 
      "poster_path": "/dDfjzRicTeVaiysRTwx56aM8bC3.jpg", 
      "popularity": 5.4, 
      "id": 61889, 
      "backdrop_path": null, 
      "vote_average": 7.74, 
      "overview": "Lawyer-by-day Matt Murdock uses his heightened senses from being blinded as a young boy to fight crime at night on the streets of Hell’s Kitchen as Daredevil.......", 
      "first_air_date": "2015-04-10", 
      "origin_country": [ 
        "US" 
      ], 
      "genre_ids": [ 
        28 
      ], 
      "original_language": "en", 
      "vote_count": 19, 
      "name": "Marvel's Daredevil", 
      "original_name": "Marvel's Daredevil" 
    } 
  ], 
  "total_results": 61470, 
  "total_pages": 3074 
} 

Find by ID 

{ 
  "movie_results": [ 
    { 
      "adult": false, 
      "backdrop_path": null, 
      "genre_ids": [ 
        35 
      ], 
      "id": 12, 
      "original_language": "en", 
      "original_title": "Finding Nemo", 
      "overview": "A tale which follows the comedic and eventful journeys of two fish, the fretful Marlin and his young son Nemo, who are separated from each other in the Great Barrier Reef when Nemo is unexpectedly taken from his home and thrust into a fish tank in a dentist's office overlooking Sydney Harbor. Buoyed by the companionship of a friendly but forgetful fish named Dory, the overly cautious Marlin embarks on a dangerous trek and finds himself the unlikely hero of an epic journey to rescue his son.", 
      "release_date": "2003-05-30", 
      "poster_path": null, 
      "popularity": 1.256412, 
      "title": "Finding Nemo", 
      "video": false, 
      "vote_average": 7.2, 
      "vote_count": 2317 
    } 
  ], 
  "person_results": [], 
  "tv_results": [], 
  "tv_episode_results": [], 
  "tv_season_results": [] 
} 

Get Movie List 

{ 
  "genres": [ 
    { 
      "id": 28, 
      "name": "Action" 
    } 
  ] 
} 

Get TV List 

{ 
  "genres": [ 
    { 
      "id": 10759, 
      "name": "Action & Adventure" 
    } 
  ] 
} 

Get Rated Movie 

{ 
  "page": 1, 
  "results": [ 
    { 
      "adult": false, 
      "backdrop_path": "/fCayJrkfRaCRCTh8GqN30f8oyQF.jpg", 
      "genre_ids": [ 
        18 
      ], 
      "id": 550, 
      "original_language": "en", 
      "original_title": "Fight Club", 
      "overview": "A ticking-time-bomb insomniac and a slippery soap salesman channel primal male aggression into a shocking new form of therapy. Their concept catches on, with underground \"fight clubs\" forming in every town, until an eccentric gets in the way and ignites an out-of-control spiral toward oblivion.", 
      "release_date": "1999-10-12", 
      "poster_path": null, 
      "popularity": 0.5, 
      "title": "Fight Club", 
      "video": false, 
      "vote_average": 7.8, 
      "vote_count": 3439, 
      "rating": 4.5 
    } 
  ], 
  "total_pages": 1, 
  "total_results": 1 
} 

Get Rated TV Show 

{ 
  "page": 1, 
  "results": [ 
    { 
      "backdrop_path": "/aKz3lXU71wqdslC1IYRC3yHD6yw.jpg", 
      "first_air_date": "2011-04-17", 
      "genre_ids": [ 
        10765, 
        18 
      ], 
      "id": 1399, 
      "original_language": null, 
      "original_name": "Game of Thrones", 
      "overview": "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.\n\n", 
      "origin_country": [ 
        "US" 
      ], 
      "poster_path": "/jIhL6mlT7AblhbHJgEoiBIOUVl1.jpg", 
      "popularity": 35.072708, 
      "name": "Game of Thrones", 
      "vote_average": 9.1, 
      "vote_count": 274, 
      "rating": 9.5 
    } 
  ], 
  "total_pages": 1, 
  "total_results": 1 
} 

Get Rated TV Episodes 

{ 
  "page": 1, 
  "results": [ 
    { 
      "air_date": "2013-10-15", 
      "episode_number": 5, 
      "id": 64782, 
      "name": "The Workplace Proximity", 
      "overview": "Amy starts working at Caltech which causes friction with Sheldon. Howard agrees with Sheldon who mentions this to Bernadette causing a big fight for the Wolowitzes.", 
      "production_code": null, 
      "season_number": 7, 
      "show_id": 1418, 
      "still_path": null, 
      "vote_average": 8.5, 
      "vote_count": 3, 
      "rating": 8 
    }, 
    { 
      "air_date": "2013-12-08", 
      "episode_number": 11, 
      "id": 968782, 
      "name": "Big Man in Tehran", 
      "overview": "Brody's loyalty to the mission wavers when he meets a ghost from his past. As Lockhart's confirmation looms, Saul stares into the precipice between success and failure.", 
      "production_code": "3WAH11", 
      "season_number": 3, 
      "show_id": 1407, 
      "still_path": null, 
      "vote_average": 9, 
      "vote_count": 2, 
      "rating": 9 
    }, 
    { 
      "air_date": "2014-03-23", 
      "episode_number": 15, 
      "id": 973273, 
      "name": "Dramatics, Your Honor", 
      "overview": "Alicia asks Cary to be her lawyer when Nelson Dubeck (Eric Bogosian) asks her to participate in a deposition; Will faces off with a new prosecutor while defending Jeffrey Grant (Hunter Parrish).", 
      "production_code": null, 
      "season_number": 5, 
      "show_id": 1435, 
      "still_path": null, 
      "vote_average": 9, 
      "vote_count": 1, 
      "rating": 9 
    }, 
    { 
      "air_date": "2014-05-11", 
      "episode_number": 6, 
      "id": 63099, 
      "name": "The Laws of Gods and Men", 
      "overview": "Stannis and Davos set sail; Dany meets with supplicants; Tyrion faces down his father. ", 
      "production_code": null, 
      "season_number": 4, 
      "show_id": 1399, 
      "still_path": null, 
      "vote_average": 8.938, 
      "vote_count": 8, 
      "rating": 8.5 
    }, 
    { 
      "air_date": "2014-05-18", 
      "episode_number": 7, 
      "id": 63100, 
      "name": "Mockingbird", 
      "overview": "Tyrion gains an unlikely ally; Daario asks Dany to allow him to do what he does best; Jon's warnings about the vulnerability of the Wall are ignored; Brienne follows a new lead. ", 
      "production_code": null, 
      "season_number": 4, 
      "show_id": 1399, 
      "still_path": null, 
      "vote_average": 7.813, 
      "vote_count": 8, 
      "rating": 8.5 
    }, 
    { 
      "air_date": "2014-08-22", 
      "episode_number": 12, 
      "id": 975339, 
      "name": "Tome-wan", 
      "overview": "Bedelia returns and accepts immunity to testify against Hannibal. Mason Verger plots revenge after learning of Hannibal's manipulations.", 
      "production_code": "212", 
      "season_number": 2, 
      "show_id": 40008, 
      "still_path": null, 
      "vote_average": 9, 
      "vote_count": 1, 
      "rating": 9 
    }, 
    { 
      "air_date": "2014-08-22", 
      "episode_number": 13, 
      "id": 976285, 
      "name": "Mizumono", 
      "overview": "Springing their trap, Jack, Will and Alana face off with Hannibal in a bloody final showdown, but the doctor has a few surprises of his own.", 
      "production_code": "213", 
      "season_number": 2, 
      "show_id": 40008, 
      "still_path": null, 
      "vote_average": 10, 
      "vote_count": 2, 
      "rating": 10 
    }, 
    { 
      "air_date": "2014-06-01", 
      "episode_number": 8, 
      "id": 63101, 
      "name": "The Mountain and the Viper", 
      "overview": "Unexpected visitors arrive in Mole's Town. Littlefinger's motives are questioned. Ramsay tries to prove himself to his father. Tyrion's fate is decided.", 
      "production_code": null, 
      "season_number": 4, 
      "show_id": 1399, 
      "still_path": null, 
      "vote_average": 8.857, 
      "vote_count": 7, 
      "rating": 9.5 
    }, 
    { 
      "air_date": "2017-08-24", 
      "episode_number": 16, 
      "id": 62161, 
      "name": "Felina", 
      "overview": "All bad things must come to an end.", 
      "production_code": null, 
      "season_number": 5, 
      "show_id": 1396, 
      "still_path": null, 
      "vote_average": 9.75, 
      "vote_count": 4, 
      "rating": 9 
    }, 
    { 
      "air_date": "2014-07-13", 
      "episode_number": 1, 
      "id": 989249, 
      "name": "Night Zero", 
      "overview": "When a plane lands in New York City with everyone on board dead, Dr. Ephraim Goodweather, head of the CDC’s Canary Project, and his team are called upon to investigate. Harlem pawnbroker Abraham Setrakian races to the airport, convinced that what looks at first like a mysterious viral outbreak might be the beginning of something infinitely more sinister.", 
      "production_code": "XSN01001", 
      "season_number": 1, 
      "show_id": 47640, 
      "still_path": null, 
      "vote_average": 7.5, 
      "vote_count": 1, 
      "rating": 7.5 
    }, 
    { 
      "air_date": "2014-06-19", 
      "episode_number": 1, 
      "id": 976915, 
      "name": "Running with the Bull", 
      "overview": "Daniel’s family fears he won’t recover from his injuries and his attackers will escape justice. Judy Dean shows Bobby some unexpected affection. Ted, Jr. hides a shameful secret from his wife. Sheriff Daggett investigates Daniel’s beating.", 
      "production_code": null, 
      "season_number": 2, 
      "show_id": 46619, 
      "still_path": null, 
      "vote_average": 9.5, 
      "vote_count": 2, 
      "rating": 9 
    }, 
    { 
      "air_date": "2014-08-24", 
      "episode_number": 9, 
      "id": 990362, 
      "name": "The Garveys at Their Best", 
      "overview": "Kevin tries to suppress his bad habits while tracking down a marauding deer in Mapleton. Laurie receives not-unexpected news amidst a rising sense of foreboding. Tom connects with his past, against his better judgment. Nora has a job interview; Kevin Senior receives an honor.", 
      "production_code": null, 
      "season_number": 1, 
      "show_id": 54344, 
      "still_path": null, 
      "vote_average": 9.5, 
      "vote_count": 2, 
      "rating": 9 
    }, 
    { 
      "air_date": "2012-07-15", 
      "episode_number": 1, 
      "id": 62147, 
      "name": "Live Free or Die", 
      "overview": "As Walt deals with the aftermath of the Casa Tranquila explosion, Hank works to wrap up his investigation of Gus' empire. As Walt deals with the aftermath of the Casa Tranquila explosion, Hank works to wrap up his investigation of Gus' empire. As Walt deals with the aftermath of the Casa Tranquila explosion, Hank works to wrap up his investigation of Gus' empire. As Walt deals with the aftermath of the Casa Tranquila explosion, Hank works to wrap up his investigation of Gus' empire. As Walt deals with the aftermath of the Casa Tranquila explosion, Hank works to wrap up his investigation of Gus'.", 
      "production_code": null, 
      "season_number": 5, 
      "show_id": 1396, 
      "still_path": "/laWmmRi6qDGp4C2qUjaK4k1rRkr.jpg", 
      "vote_average": 7.75, 
      "vote_count": 2, 
      "rating": 8 
    }, 
    { 
      "air_date": "2012-08-26", 
      "episode_number": 7, 
      "id": 62153, 
      "name": "Say My Name", 
      "overview": "Walt takes control of business matters; Mike deals with the consequences of his actions.", 
      "production_code": null, 
      "season_number": 5, 
      "show_id": 1396, 
      "still_path": null, 
      "vote_average": 8.25, 
      "vote_count": 2, 
      "rating": 8.5 
    }, 
    { 
      "air_date": "2015-03-01", 
      "episode_number": 1, 
      "id": 1022053, 
      "name": "The Battle Creek Way", 
      "overview": "Jaded Det. Russ Agnew reluctantly partners with charming FBI Agent Milt Chamberlain to solve a drug-related double homicide, but while Milt investigates with the high-tech resources of the FBI, Russ prefers old-school police work and instinct.", 
      "production_code": null, 
      "season_number": 1, 
      "show_id": 61676, 
      "still_path": null, 
      "vote_average": 8, 
      "vote_count": 1, 
      "rating": 8 
    }, 
    { 
      "air_date": "2015-02-23", 
      "episode_number": 16, 
      "id": 1039439, 
      "name": "The Wrong Stuff", 
      "overview": "When an astronaut, training for a trip to Mars, is mysteriously killed inside a Mars simulation, Castle and Beckett don spacesuits to investigate. But when they discover no one inside the sealed simulation could have committed the murder and no one from the outside could get in, the case takes a shocking turn", 
      "production_code": null, 
      "season_number": 7, 
      "show_id": 1419, 
      "still_path": null, 
      "vote_average": 8, 
      "vote_count": 1, 
      "rating": 8 
    }, 
    { 
      "air_date": "2015-12-10", 
      "episode_number": 13, 
      "id": 1036361, 
      "name": "Episode 13", 
      "overview": "Test overview.", 
      "production_code": null, 
      "season_number": 1, 
      "show_id": 61889, 
      "still_path": null, 
      "vote_average": 6.667, 
      "vote_count": 3, 
      "rating": 9.5 
    }, 
    { 
      "air_date": "2015-03-20", 
      "episode_number": 1, 
      "id": 1040171, 
      "name": "Part 1", 
      "overview": "Trouble starts when oldest son Danny Rayburn comes home for the 45th anniversary celebration of his parents' hotel in the Florida Keys' Islamorada.", 
      "production_code": null, 
      "season_number": 1, 
      "show_id": 61986, 
      "still_path": null, 
      "vote_average": 0, 
      "vote_count": 0, 
      "rating": 8.5 
    }, 
    { 
      "air_date": "2015-06-05", 
      "episode_number": 4, 
      "id": 1057802, 
      "name": "What's Going On?", 
      "overview": "", 
      "production_code": null, 
      "season_number": 1, 
      "show_id": 61664, 
      "still_path": null, 
      "vote_average": 0, 
      "vote_count": 0, 
      "rating": 9 
    } 
  ], 
  "total_pages": 66, 
  "total_results": 1314 
} 

Get Details 

{ 
  "id": 3417, 
  "name": "wormhole" 
} 

Get Movies 

{ 
  "id": 3417, 
  "page": 1, 
  "results": [ 
    { 
      "adult": false, 
      "backdrop_path": null, 
      "genre_ids": [ 
        18 
      ], 
      "id": 157336, 
      "original_language": "en", 
      "original_title": "Interstellar", 
      "overview": "Interstellar chronicles the adventures of a group of explorers who make use of a newly discovered wormhole to surpass the limitations on human space travel and conquer the vast distances involved in an interstellar voyage. Or is it?", 
      "release_date": "2014-11-05", 
      "poster_path": "/qzjOE2ylfiHjbork6rupuDJg0YX.jpg", 
      "popularity": 5.531964, 
      "title": "Interstellar", 
      "video": false, 
      "vote_average": 8.4, 
      "vote_count": 2085 
    } 
  ], 
  "total_pages": 1, 
  "total_results": 6 
} 

Get Details 

{ 
  "created_by": "travisbell", 
  "description": "This is pretty wicked.", 
  "favorite_count": 0, 
  "id": "50941077760ee35e1500000c", 
  "items": [ 
    { 
      "poster_path": "/fpemzjF623QVTe98pCVlwwtFC5N.jpg", 
      "adult": false, 
      "overview": "A ticking-time-bomb insomniac and a slippery soap salesman channel primal male aggression into a shocking new form of therapy. Their concept catches on, with underground \"fight clubs\" forming in every town, until an eccentric gets in the way and ignites an out-of-control spiral toward oblivion.", 
      "release_date": "1999-10-12", 
      "original_title": "Fight Club", 
      "genre_ids": [ 
        18 
      ], 
      "id": 550, 
      "media_type": "movie", 
      "original_language": "en", 
      "title": "Fight Club", 
      "backdrop_path": null, 
      "popularity": 1.5, 
      "vote_count": 3439, 
      "video": false, 
      "vote_average": 7.8 
    } 
  ], 
  "item_count": 46, 
  "iso_639_1": "en", 
  "name": "The Marvel Universe", 
  "poster_path": "/6KhhINGLbwzylPdRGqu4JxtzAJ3.jpg" 
} 

Check Item Status 

{ 
  "id": "50941077760ee35e1500000c", 
  "item_present": true 
} 

Create List 

{ 
  "status_message": "The item/record was created successfully.", 
  "success": true, 
  "status_code": 1, 
  "list_id": 5861 
} 

Add Movies 

{ 
  "status_code": 12, 
  "status_message": "The item/record was updated successfully." 
} 

Remove Movies 

{ 
  "status_code": 13, 
  "status_message": "The item/record was deleted successfully." 
} 

Clear List 

{ 
  "status_code": 12, 
  "status_message": "The item/record was updated successfully." 
} 

Delete List 

{ 
  "status_code": 12, 
  "status_message": "The item/record was updated successfully." 
} 

Get Details 

{ 
  "adult": false, 
  "backdrop_path": "/fCayJrkfRaCRCTh8GqN30f8oyQF.jpg", 
  "belongs_to_collection": null, 
  "budget": 63000000, 
  "genres": [ 
    { 
      "id": 18, 
      "name": "Drama" 
    } 
  ], 
  "homepage": "", 
  "id": 550, 
  "imdb_id": "tt0137523", 
  "original_language": "en", 
  "original_title": "Fight Club", 
  "overview": "A ticking-time-bomb insomniac and a slippery soap salesman channel primal male aggression into a shocking new form of therapy. Their concept catches on, with underground \"fight clubs\" forming in every town, until an eccentric gets in the way and ignites an out-of-control spiral toward oblivion.", 
  "popularity": 0.5, 
  "poster_path": null, 
  "production_companies": [ 
    { 
      "id": 508, 
      "logo_path": "/7PzJdsLGlR7oW4J0J5Xcd0pHGRg.png", 
      "name": "Regency Enterprises", 
      "origin_country": "US" 
    }, 
    { 
      "id": 711, 
      "logo_path": null, 
      "name": "Fox 2000 Pictures", 
      "origin_country": "" 
    }, 
    { 
      "id": 20555, 
      "logo_path": null, 
      "name": "Taurus Film", 
      "origin_country": "" 
    }, 
    { 
      "id": 54050, 
      "logo_path": null, 
      "name": "Linson Films", 
      "origin_country": "" 
    }, 
    { 
      "id": 54051, 
      "logo_path": null, 
      "name": "Atman Entertainment", 
      "origin_country": "" 
    }, 
    { 
      "id": 54052, 
      "logo_path": null, 
      "name": "Knickerbocker Films", 
      "origin_country": "" 
    }, 
    { 
      "id": 25, 
      "logo_path": "/qZCc1lty5FzX30aOCVRBLzaVmcp.png", 
      "name": "20th Century Fox", 
      "origin_country": "US" 
    } 
  ], 
  "production_countries": [ 
    { 
      "iso_3166_1": "US", 
      "name": "United States of America" 
    } 
  ], 
  "release_date": "1999-10-12", 
  "revenue": 100853753, 
  "runtime": 139, 
  "spoken_languages": [ 
    { 
      "iso_639_1": "en", 
      "name": "English" 
    } 
  ], 
  "status": "Released", 
  "tagline": "How much can you know about yourself if you've never been in a fight?", 
  "title": "Fight Club", 
  "video": false, 
  "vote_average": 7.8, 
  "vote_count": 3439 
} 

Get Account States 

{ 
  "id": 550, 
  "favorite": true, 
  "rated": { 
    "value": 8 
  }, 
  "watchlist": false 
} 

Get Alternative Titles 

{ 
  "id": 550, 
  "titles": [ 
    { 
      "iso_3166_1": "AR", 
      "title": "El club de la pelea", 
      "type": "" 
    }, 
    { 
      "iso_3166_1": "RS", 
      "title": "Borilački klub", 
      "type": "" 
    }, 
    { 
      "iso_3166_1": "HU", 
      "title": "Harcosok Klubbja", 
      "type": "" 
    }, 
    { 
      "iso_3166_1": "IL", 
      "title": "Mo'adon Krav", 
      "type": "romanization" 
    }, 
    { 
      "iso_3166_1": "BR", 
      "title": "Clube da Luta", 
      "type": "" 
    }, 
    { 
      "iso_3166_1": "US", 
      "title": "Fight Club", 
      "type": "" 
    }, 
    { 
      "iso_3166_1": "HN", 
      "title": "El Club de la Pelea", 
      "type": "" 
    }, 
    { 
      "iso_3166_1": "KR", 
      "title": "파이트 클럽", 
      "type": "" 
    }, 
    { 
      "iso_3166_1": "JP", 
      "title": "ファイト・クラブ", 
      "type": "" 
    }, 
    { 
      "iso_3166_1": "CN", 
      "title": "鬥陣俱樂部", 
      "type": "" 
    }, 
    { 
      "iso_3166_1": "RU", 
      "title": "Бойцовский клуб", 
      "type": "" 
    } 
  ] 
} 

Get Changes 

{ 
  "changes": [ 
    { 
      "key": "overview", 
      "items": [ 
        { 
          "id": "57c464ef5dbf5b15a6000007", 
          "action": "updated", 
          "time": "2016-08-29 16:38:07 UTC", 
          "iso_639_1": "en", 
          "value": "When Tony Stark tries to jumpstart a dormant peacekeeping program, things go awry and Earth’s Mightiest Heroes are put to the ultimate test as the fate of the planet hangs in the balance. As the villainous Ultron emerges, it is up to The Avengers to stop him from enacting his terrible plans, and soon uneasy alliances and unexpected action pave the way for an epic and unique global adventure!", 
          "original_value": "When Tony Stark tries to jumpstart a dormant peacekeeping program, things go awry and Earth’s Mightiest Heroes are put to the ultimate test as the fate of the planet hangs in the balance. As the villainous Ultron emerges, it is up to The Avengers to stop him from enacting his terrible plans, and soon uneasy alliances and unexpected action pave the way for an epic and unique global adventure." 
        } 
      ] 
    } 
  ] 
} 

Get Credits 

 

Get External IDs 

{ 
  "imdb_id": "tt1856101", 
  "facebook_id": "BladeRunner2049", 
  "instagram_id": "bladerunnermovie", 
  "twitter_id": "bladerunner", 
  "id": 335984 
} 

Get Images 

{ 
  "id": 550, 
  "backdrops": [ 
    { 
      "aspect_ratio": 1.77777777777778, 
      "file_path": "/fCayJrkfRaCRCTh8GqN30f8oyQF.jpg", 
      "height": 720, 
      "iso_639_1": null, 
      "vote_average": 0, 
      "vote_count": 0, 
      "width": 1280 
    } 
  ], 
  "posters": [ 
    { 
      "aspect_ratio": 0.666666666666667, 
      "file_path": "/fpemzjF623QVTe98pCVlwwtFC5N.jpg", 
      "height": 1800, 
      "iso_639_1": "en", 
      "vote_average": 0, 
      "vote_count": 0, 
      "width": 1200 
    } 
  ] 
} 

Get Keywords 

{ 
  "id": 550, 
  "keywords": [ 
    { 
      "id": 825, 
      "name": "support group" 
    } 
  ] 
} 

Get Lists 

{ 
  "id": 550, 
  "page": 1, 
  "results": [ 
    { 
      "description": "Pick one and then one or two alternates", 
      "favorite_count": 0, 
      "id": 7213, 
      "item_count": 1358, 
      "iso_639_1": "en", 
      "list_type": "movie", 
      "name": "Movie Night", 
      "poster_path": "/p60VSQL7usdxztIGokJPpHmKWdU.jpg" 
    }, 
    { 
      "description": "Your favorite and classic movies of the 1990s", 
      "favorite_count": 0, 
      "id": 6968, 
      "item_count": 482, 
      "iso_639_1": "en", 
      "list_type": "movie", 
      "name": "1990", 
      "poster_path": "/5R68Xn4EG0g5qlaQxpE89zGrtes.jpg" 
    }, 
    { 
      "description": "All the movies I own on vhs/dvd/bluray or digital.", 
      "favorite_count": 0, 
      "id": 9660, 
      "item_count": 3299, 
      "iso_639_1": "en", 
      "list_type": "movie", 
      "name": "My Film Collection", 
      "poster_path": "/3TsnEEkBRfQ1b7Gi2FTsuxHFUZq.jpg" 
    }, 
    { 
      "description": "", 
      "favorite_count": 0, 
      "id": 8085, 
      "item_count": 23, 
      "iso_639_1": "en", 
      "list_type": "movie", 
      "name": "Twists and Shouts", 
      "poster_path": "/drzZQfdyoAq7pXq4EPI2aZKyGD5.jpg" 
    }, 
    { 
      "description": "", 
      "favorite_count": 0, 
      "id": 12031, 
      "item_count": 475, 
      "iso_639_1": "fr", 
      "list_type": "movie", 
      "name": "Films", 
      "poster_path": null 
    }, 
    { 
      "description": "List maintained by Movie Collection, the iOS app.", 
      "favorite_count": 0, 
      "id": 1718, 
      "item_count": 610, 
      "iso_639_1": "en", 
      "list_type": "movie", 
      "name": "Movie Collection", 
      "poster_path": null 
    }, 
    { 
      "description": "", 
      "favorite_count": 0, 
      "id": 11052, 
      "item_count": 478, 
      "iso_639_1": "en", 
      "list_type": "movie", 
      "name": "Movies", 
      "poster_path": null 
    }, 
    { 
      "description": "Weekly Box Office Nº1 from 1982", 
      "favorite_count": 0, 
      "id": 5576, 
      "item_count": 647, 
      "iso_639_1": "es", 
      "list_type": "movie", 
      "name": "Weekly Box Office Nº1 from 1982", 
      "poster_path": "/yTpKlgaNw3fEBndyDYPg3hRloR5.jpg" 
    }, 
    { 
      "description": "", 
      "favorite_count": 0, 
      "id": 4023, 
      "item_count": 1072, 
      "iso_639_1": "it", 
      "list_type": "movie", 
      "name": "Dvd collection", 
      "poster_path": "/sHGO5Ct2Vo0KPVnSEmSf3Zo5MIl.jpg" 
    }, 
    { 
      "description": "Películas para recomendar", 
      "favorite_count": 0, 
      "id": 10354, 
      "item_count": 33, 
      "iso_639_1": "en", 
      "list_type": "movie", 
      "name": "Peliculones", 
      "poster_path": null 
    }, 
    { 
      "description": "", 
      "favorite_count": 0, 
      "id": 10141, 
      "item_count": 304, 
      "iso_639_1": "en", 
      "list_type": "movie", 
      "name": "R3ST", 
      "poster_path": null 
    }, 
    { 
      "description": "", 
      "favorite_count": 0, 
      "id": 5829, 
      "item_count": 396, 
      "iso_639_1": "de", 
      "list_type": "movie", 
      "name": "Criss Filme", 
      "poster_path": "/gnNU653Lm0cCpdYDaOgjTREf6JI.jpg" 
    }, 
    { 
      "description": "movies that I've watched", 
      "favorite_count": 0, 
      "id": 6357, 
      "item_count": 1690, 
      "iso_639_1": "en", 
      "list_type": "movie", 
      "name": "watched", 
      "poster_path": "/7o7fCNaruJGrTjWpmmK2jj8rE7Q.jpg" 
    }, 
    { 
      "description": "", 
      "favorite_count": 0, 
      "id": 9267, 
      "item_count": 121, 
      "iso_639_1": "en", 
      "list_type": "movie", 
      "name": "Dangerous Hill Classics", 
      "poster_path": "/f7KYM1uO8f2duhoSY3Bps55mIe.jpg" 
    }, 
    { 
      "description": "List maintained by Movie Collection, the iOS app.", 
      "favorite_count": 0, 
      "id": 3136, 
      "item_count": 185, 
      "iso_639_1": "en", 
      "list_type": "movie", 
      "name": "Movie Collection", 
      "poster_path": "/koLwUfgmlT2kr0twamPJ8l6eQIp.jpg" 
    }, 
    { 
      "description": "", 
      "favorite_count": 0, 
      "id": 4557, 
      "item_count": 591, 
      "iso_639_1": "hu", 
      "list_type": "movie", 
      "name": "Watched", 
      "poster_path": "/43pgav2uIG0ZNGdcaZX1v073ITv.jpg" 
    }, 
    { 
      "description": "", 
      "favorite_count": 0, 
      "id": 12467, 
      "item_count": 13, 
      "iso_639_1": "en", 
      "list_type": "movie", 
      "name": "Bradd", 
      "poster_path": null 
    }, 
    { 
      "description": "", 
      "favorite_count": 0, 
      "id": 4280, 
      "item_count": 390, 
      "iso_639_1": "it", 
      "list_type": "movie", 
      "name": "MY COLLECTION", 
      "poster_path": "/noLXB6fiDAl9uC6O2W26kCDXIFl.jpg" 
    }, 
    { 
      "description": "Movies that I have watched.", 
      "favorite_count": 0, 
      "id": 10482, 
      "item_count": 567, 
      "iso_639_1": "en", 
      "list_type": "movie", 
      "name": "Watched", 
      "poster_path": null 
    }, 
    { 
      "description": "DVDs I have", 
      "favorite_count": 0, 
      "id": 11773, 
      "item_count": 1158, 
      "iso_639_1": "en", 
      "list_type": "movie", 
      "name": "DVD Collection", 
      "poster_path": null 
    } 
  ], 
  "total_pages": 18, 
  "total_results": 358 
} 

Get Recommendations 

{ 
  "page": 1, 
  "results": [ 
    { 
      "adult": false, 
      "backdrop_path": null, 
      "genre_ids": [ 
        28 
      ], 
      "id": 106912, 
      "original_language": "en", 
      "original_title": "Darna! Ang Pagbabalik", 
      "overview": "Valentina, Darna's snake-haired arch enemy, is trying to take over the Phillipines through subliminal messages on religious TV shows. Darna has her own problems, however, as she has lost her magic pearl and with it the ability to transform into her scantily clad super self. Trapped as her alter-ego, the plucky reporter Narda, she must try to regain the pearl and foil Valentina's plans.", 
      "release_date": "1994-05-09", 
      "poster_path": null, 
      "popularity": 1.012564, 
      "title": "Darna: The Return", 
      "video": false, 
      "vote_average": 0, 
      "vote_count": 0 
    } 
  ], 
  "total_pages": 9, 
  "total_results": 168 
} 

Get Release Dates 

{ 
  "id": 550, 
  "results": [ 
    { 
      "iso_3166_1": "EG", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "2000-03-01T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "SI", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "2000-02-24T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "ZA", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "2000-01-28T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "HU", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "2000-01-27T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "EE", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "2000-01-07T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "RU", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "2000-01-13T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "JP", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "1999-12-11T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "MY", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "2000-01-13T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "PH", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "note": "Davao", 
          "release_date": "1999-11-17T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "IL", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "1999-11-16T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "UY", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "1999-11-12T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "NO", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "1999-11-12T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "PL", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "2000-02-11T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "IE", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "1999-11-12T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "HK", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "1999-11-11T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "MX", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "1999-11-05T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "DK", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "1999-11-05T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "BR", 
      "release_dates": [ 
        { 
          "certification": "18", 
          "iso_639_1": "", 
          "note": "", 
          "release_date": "1999-10-29T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "CH", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "de", 
          "release_date": "1999-11-04T00:00:00.000Z", 
          "type": 3 
        }, 
        { 
          "certification": "", 
          "iso_639_1": "fr", 
          "release_date": "1999-11-10T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "SK", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "2000-02-10T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "NL", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "1999-11-04T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "ES", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "note": "", 
          "release_date": "1999-11-05T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "CA", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "1999-10-15T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "KR", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "1999-11-13T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "GR", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "note": "", 
          "release_date": "2000-02-18T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "AU", 
      "release_dates": [ 
        { 
          "certification": "R18+", 
          "iso_639_1": "", 
          "note": "", 
          "release_date": "1999-11-11T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "HR", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "2000-03-09T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "SG", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "1999-11-04T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "MT", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "1999-11-24T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "BG", 
      "release_dates": [ 
        { 
          "certification": "c", 
          "iso_639_1": "", 
          "note": "", 
          "release_date": "2012-08-28T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "FI", 
      "release_dates": [ 
        { 
          "certification": "K-18", 
          "iso_639_1": "", 
          "note": "", 
          "release_date": "1999-11-12T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "AR", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "1999-11-04T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "GB", 
      "release_dates": [ 
        { 
          "certification": "18", 
          "iso_639_1": "", 
          "note": "", 
          "release_date": "1999-11-12T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "DE", 
      "release_dates": [ 
        { 
          "certification": "18", 
          "iso_639_1": "", 
          "note": "", 
          "release_date": "1999-11-11T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "TW", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "1999-11-11T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "SE", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "1999-12-25T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "CZ", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "note": "Febio Film Festival", 
          "release_date": "2000-01-25T00:00:00.000Z", 
          "type": 1 
        }, 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "2000-02-10T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "IS", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "1999-11-05T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "US", 
      "release_dates": [ 
        { 
          "certification": "R", 
          "iso_639_1": "", 
          "note": "CMJ Film Festival", 
          "release_date": "1999-09-21T00:00:00.000Z", 
          "type": 1 
        }, 
        { 
          "certification": "R", 
          "iso_639_1": "", 
          "note": "Westwood, California", 
          "release_date": "1999-10-06T00:00:00.000Z", 
          "type": 1 
        }, 
        { 
          "certification": "R", 
          "iso_639_1": "", 
          "note": "", 
          "release_date": "1999-10-15T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "BE", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "1999-11-10T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "PT", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "1999-11-12T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "FR", 
      "release_dates": [ 
        { 
          "certification": "16", 
          "iso_639_1": "", 
          "note": "", 
          "release_date": "1999-11-10T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "NZ", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "release_date": "1999-11-11T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "TR", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "note": "", 
          "release_date": "1999-12-10T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    }, 
    { 
      "iso_3166_1": "IT", 
      "release_dates": [ 
        { 
          "certification": "", 
          "iso_639_1": "", 
          "note": "Venice Film Festival", 
          "release_date": "1999-09-10T00:00:00.000Z", 
          "type": 1 
        }, 
        { 
          "certification": "VM14", 
          "iso_639_1": "", 
          "note": "", 
          "release_date": "1999-10-29T00:00:00.000Z", 
          "type": 3 
        } 
      ] 
    } 
  ] 
} 

Get Reviews 

{ 
  "id": 11, 
  "page": 1, 
  "results": [ 
    { 
      "author": "Cat Ellington", 
      "author_details": { 
        "name": "Cat Ellington", 
        "username": "CatEllington", 
        "avatar_path": "/uCmwgSbJAcHqNwSvQvTv2dB95tx.jpg", 
        "rating": null 
      }, 
      "content": "(As I'm writing this review, Darth Vader's theme music begins to build in my mind...)\r\n\r\nWell, it actually has a title, what the Darth Vader theme. And that title is \"The Imperial March\", composed by the great John Williams, whom, as many of you may already know, also composed the theme music for \"Jaws\" - that legendary score simply titled, \"Main Title (Theme From Jaws)\".\r\n\r\nNow, with that lil' bit of trivia aside, let us procede with the fabled film currently under review: Star Wars. It had been at a drive-in theater in some small Illinois town or other where my mother, my older brother, and I had spent our weekly \"Movie Date Night\" watching this George Lucas directed cult masterpiece from our car in the parking lot. On the huge outdoor screen, the film appeared to be a silent one, but thanks to an old wire-attached speaker, we were able to hear both the character dialogue and soundtrack loud and clear. We even had ourselves a carful of vittles and snacks - walked back to our vehicle, of course, from the wide-opened cinema's briefly distant concession stand. Indeed, it had been a lovely summer evening that July.\r\n\r\nFrom the time the film started, with my brother and I following along as our mother sped-read the opening crawl, I began to feel rather antsy, thinking that this movie, the first in a franchise that would soon be world-renowned, was going to be boring, due to its genre being Science Fiction: A respectably likable, but not a passionately lovable genre of mine DURING THAT TIME. I just didn't believe I was going to like Star Wars all that much ... But I soon found myself intrigued ... And awed.\r\n\r\nGeorge Lucas is a man with a phenomenal, and I do mean phenomenal imagination. Apart from his human characters (Han, Luke, Leia, and Obi-Wan Kenobi, among others), the droids: C-3P0, R2-D2, R2-series, and IG-88, not to mention those unusual characters like Jabba the Hutt, Yoda, and Chewbacca, just to name a few, are all creations of Lucas's phenomenal imagination. And I was completely in awe of each one of these strange beings. Then there was Vader ... And the evil Emperor ... And the Stormtroopers ... And the Spacecraft ... And the galaxies (I'll admit that I am a huge lover of the Universe in all its Celestial glory) ... And the magnificent planets ... The Lightsabers ... And so on. Star Wars is a gorgeously shot space opera; it is truly an epic masterpiece. We enjoyed this film tremendously. And my brother was a die-hard fan from that night onward. He, my brother, had even received for Christmas that year, nearly every Star Wars action figure that my mother could find, including two of the spacecraft: The Millennium Falcon and Star Destroyer. The Death Star space station had too been wrapped beneath our Christmas tree - tagged with his name. It was totally crazy, what the new Star Wars era. Frenzied! But it was great ... Even still, to this day.\r\n\r\nI don't personally know anyone whom has yet to see Star Wars, but that certainly doesn't suggest there are still a few people out there who haven't. And if you're one of the latter, then you should know that this classic space opera comes highly recommended. The entire series is told backwards, so you'll definitely want to see Star Wars first, followed by its two sequels: The Empire Strikes Back and Return of the Jedi ... In that order. I trust that you'll too discover yourself to be a lifelong cult fan in the wake. 😊", 
      "created_at": "2017-02-13T22:23:01.268Z", 
      "id": "58a231c5925141179e000674", 
      "updated_at": "2017-02-13T23:16:19.538Z", 
      "url": "https://www.themoviedb.org/review/58a231c5925141179e000674" 
    }, 
    { 
      "author": "John Chard", 
      "author_details": { 
        "name": "", 
        "username": "John Chard", 
        "avatar_path": "/utEXl2EDiXBK6f41wCLsvprvMg4.jpg", 
        "rating": 10 
      }, 
      "content": "A long time ago in a childhood not too far away...\r\n\r\nPrincess Leia is captured and held hostage by the Imperial Army as it seeks to rule the Galactic Empire. An old Jedi Knight by the name of Ben \"Obi-Wan\" Kenobi may just be hers, and the rebels only hope. Teaming up with farm boy Luke Skywalker, scoundrel Captain Han Solo, and a couple of quirky droids, Kenobi sets off on a mission that could well shape the destiny of the Galaxy, and all who dwell within it.\r\n\r\nBack in 1977 I was but a wee 11 year old boy, weened on films from all genres by my movie loving parents, I had no idea that Star Wars was to have the same impact on me as Jaws had two summers previously, where yet again I found myself queueing around the block for two whole hours to see a film in a one screen theatre. My love of cinema firmly cemented, Star Wars was the start of a love affair that lasts to this very day.\r\n\r\nAs the years have rolled by and my love of cinema has taken on more in-depth and serious tones, I have come to realise that Star Wars proves to be a far from flawless picture. Certainly its detractors do point to some frayed acting and call the plot structure a jazzed up good versus evil axis, while the charge of George Lucas referencing many prior pictures most assuredly stands, but really do those things matter? No they do not, because Star Wars opened up a new world of cinema, something of a portal to youngsters such as I, it got people talking and debating about the merits of model work in films (which is of an extraordinary high standard here), it nudged film makers to explore being bigger and bolder in their approach, and crucially, above all else, it got film goers hungry again, a hankering for more please if you may. Now it has to be said that all that followed 20th Century Fox's historic blockbuster didn't run with the baton, in fact most pale into comparison on impact value, but for better or worse (depending on the discerning viewers peccadilloes), Star Wars stands as a bastion of adventure laden entertainment.\r\n\r\nIt is by definition one of the most successful films in history, George Lucas perhaps didn't know it at the time, but in what was to become an almost operatic anthology, he didn't just make a movie, he created a whole new world seeping with style and rich texture. Almost as amazing as the success of the series, is how it has become part of modern day pop culture, anything from religion to everyday speak has at some time or another referenced Lucas' baby. Ultimately, though, it's one single thing that made (and still does make) Star Wars so great, it's that it has the ability to lift the audience into a rousing united feel good cheer; and that is something that few films can ever lay claim too. In 1977 it was an awe inspiring event to watch in the theatre, now here in my middle age it's an event that is like hugging a dear old friend, a friend that I know will never ever let me down no matter how many times I turn to it. 10/10", 
      "created_at": "2019-07-21T07:04:26.939Z", 
      "id": "5d340e7a2f8d090388d21ff2", 
      "updated_at": "2019-07-23T15:30:47.707Z", 
      "url": "https://www.themoviedb.org/review/5d340e7a2f8d090388d21ff2" 
    }, 
    { 
      "author": "gastyny", 
      "author_details": { 
        "name": "", 
        "username": "gastyny", 
        "avatar_path": null, 
        "rating": 10 
      }, 
      "content": "Star Wars (1977) is a true masterpiece of cinema, and is \r\n  definitely one of the best films ever made.\r\n\r\nFor me Star Wars (1977) is the best movie of all time,tied with The Lord of the Rings trilogy. Star Wars (1977) it is for sure the most iconic film of all time everything in it is iconic. The direction, the script, the performances in this film are brilliant, all the characters are captivating and well developed. \r\n\r\nAnyway, this is a totally perfect film, I only have praise for it, it is certainly a masterpiece of cinema, and my grade for it is 10\\10.", 
      "created_at": "2020-04-13T22:40:05.539Z", 
      "id": "5e94ea4566565a0014baa6c5", 
      "updated_at": "2020-04-14T21:30:50.409Z", 
      "url": "https://www.themoviedb.org/review/5e94ea4566565a0014baa6c5" 
    } 
  ], 
  "total_pages": 1, 
  "total_results": 3 
} 

Get Similar Movies 

{ 
  "page": 1, 
  "results": [ 
    { 
      "adult": false, 
      "backdrop_path": null, 
      "genre_ids": [ 
        28 
      ], 
      "id": 106912, 
      "original_language": "en", 
      "original_title": "Darna! Ang Pagbabalik", 
      "overview": "Valentina, Darna's snake-haired arch enemy, is trying to take over the Phillipines through subliminal messages on religious TV shows. Darna has her own problems, however, as she has lost her magic pearl and with it the ability to transform into her scantily clad super self. Trapped as her alter-ego, the plucky reporter Narda, she must try to regain the pearl and foil Valentina's plans.", 
      "release_date": "1994-05-09", 
      "poster_path": null, 
      "popularity": 1.012564, 
      "title": "Darna: The Return", 
      "video": false, 
      "vote_average": 0, 
      "vote_count": 0 
    } 
  ], 
  "total_pages": 9, 
  "total_results": 168 
} 

Get Translations 

{ 
  "id": 550, 
  "translations": [ 
    { 
      "iso_3166_1": "UA", 
      "iso_639_1": "uk", 
      "name": "Український", 
      "english_name": "Ukrainian", 
      "data": { 
        "title": "Бійцівський клуб", 
        "overview": "Джек, страждає хронічним безсонням і відчайдушно намагається вирватися з нудного життя. Саме тоді він зустрічає Тайлера Дердена, торговця із збоченою філософією. Тайлер впевнений, що самовдосконалення - доля слабких, а саморуйнування - єдине, заради чого варто жити. І ось вже Джек і Тайлер луплять один одному пики на стоянці перед баром, що приносить їм неабияке задоволення. Залучаючи інших чоловіків до простих радощів фізичної жорстокості, Джек і Тайлер засновують таємний Бійцівський Клуб, який має величезний успіх. Але Джека чекає шокуюче відкриття, здатне змінити все...", 
        "homepage": "" 
      } 
    }, 

Get Videos 

{ 
  "id": 550, 
  "results": [ 
    { 
      "iso_639_1": "en", 
      "iso_3166_1": "US", 
      "name": "Fight Club - Theatrical Trailer Remastered in HD", 
      "key": "6JnN1DmbqoU", 
      "site": "YouTube", 
      "size": 1080, 
      "type": "Trailer", 
      "official": false, 
      "published_at": "2015-02-26T03:19:25.000Z", 
      "id": "5e382d1b4ca676001453826d" 
    }, 
    { 
      "iso_639_1": "en", 
      "iso_3166_1": "US", 
      "name": "Fight Club | #TBT Trailer | 20th Century FOX", 
      "key": "BdJKm16Co6M", 
      "site": "YouTube", 
      "size": 1080, 
      "type": "Trailer", 
      "official": true, 
      "published_at": "2014-10-02T19:20:22.000Z", 
      "id": "5c9294240e0a267cd516835f" 
    } 
  ] 
} 

Get Watch Providers 

{ 
  "id": 550, 
  "results": { 
    "AR": { 
      "link": "https://www.themoviedb.org/movie/550-fight-club/watch?locale=AR", 
      "flatrate": [ 
        { 
          "display_priority": 1, 
          "logo_path": "/68MNrwlkpF7WnmNPXLah69CR5cb.jpg", 
          "provider_id": 119, 
          "provider_name": "Amazon Prime Video" 
        }, 

Rate Movies 

{ 
  "status_code": 1, 
  "status_message": "Success." 
} 

Delete Rating 

{ 
  "status_code": 13, 
  "status_message": "The item/record was deleted successfully." 
} 

Get Latest 

{ 
  "adult": false, 
  "backdrop_path": null, 
  "belongs_to_collection": null, 
  "budget": 0, 
  "genres": [ 
    { 
      "id": 99, 
      "name": "Documentary" 
    } 
  ], 
  "homepage": "", 
  "id": 413323, 
  "imdb_id": "tt5852644", 
  "original_language": "en", 
  "original_title": "Deadpool: From Comics to Screen... to Screen", 
  "overview": "This documentary divided into five segments examines the source and its path to the movies, backstory, special effects story/character areas, cast and performances. It includes notes from Reynolds, Liefeld, Miller, Wernick, Reese, executive producers Aditya Sood and Stan Lee, co-creator/comics writer Fabian Nicieza, producer Simon Kinberg, comics writer Joe Kelly, specialty costume designer Russell Shinkle, makeup designer Bill Corso, production designer Sean Haworth, director of photography Ken Seng, executive producer/unit production manager John J. Kelly, previs supervisor Franck Balson, stunt coordinator Philip J. Silvera, visual effects supervisors Pauline Duvall and Jonathan Rothbart, visual effects producer Annemarie Griggs, 2nd unit director/stunt coordinator Robert Alonzo, special effects coordinator Alex Burdett, utility stunts Regis Harrington, composer Tom Holkenberg, and actors Morena Baccarin, TJ Miller, Brianna Hildebrand, Leslie Uggams, Ed Skrein, and Gina Carano.", 
  "popularity": 0, 
  "poster_path": "/chV0avy5ogIB2PMTInT4KpHDzwj.jpg", 
  "production_companies": [], 
  "production_countries": [], 
  "release_date": "2016-05-10", 
  "revenue": 0, 
  "runtime": 80, 
  "spoken_languages": [], 
  "status": "Released", 
  "tagline": "", 
  "title": "Deadpool: From Comics to Screen... to Screen", 
  "video": false, 
  "vote_average": 0, 
  "vote_count": 0 
} 

Get Now Playing 

{ 
  "adult": false, 
  "backdrop_path": null, 
  "belongs_to_collection": null, 
  "budget": 0, 
  "genres": [ 
    { 
      "id": 99, 
      "name": "Documentary" 
    } 
  ], 
  "homepage": "", 
  "id": 413323, 
  "imdb_id": "tt5852644", 
  "original_language": "en", 
  "original_title": "Deadpool: From Comics to Screen... to Screen", 
  "overview": "This documentary divided into five segments examines the source and its path to the movies, backstory, special effects story/character areas, cast and performances. It includes notes from Reynolds, Liefeld, Miller, Wernick, Reese, executive producers Aditya Sood and Stan Lee, co-creator/comics writer Fabian Nicieza, producer Simon Kinberg, comics writer Joe Kelly, specialty costume designer Russell Shinkle, makeup designer Bill Corso, production designer Sean Haworth, director of photography Ken Seng, executive producer/unit production manager John J. Kelly, previs supervisor Franck Balson, stunt coordinator Philip J. Silvera, visual effects supervisors Pauline Duvall and Jonathan Rothbart, visual effects producer Annemarie Griggs, 2nd unit director/stunt coordinator Robert Alonzo, special effects coordinator Alex Burdett, utility stunts Regis Harrington, composer Tom Holkenberg, and actors Morena Baccarin, TJ Miller, Brianna Hildebrand, Leslie Uggams, Ed Skrein, and Gina Carano.", 
  "popularity": 0, 
  "poster_path": "/chV0avy5ogIB2PMTInT4KpHDzwj.jpg", 
  "production_companies": [], 
  "production_countries": [], 
  "release_date": "2016-05-10", 
  "revenue": 0, 
  "runtime": 80, 
  "spoken_languages": [], 
  "status": "Released", 
  "tagline": "", 
  "title": "Deadpool: From Comics to Screen... to Screen", 
  "video": false, 
  "vote_average": 0, 
  "vote_count": 0 
} 

Get Popular 

{ 
  "page": 1, 
  "results": [ 
    { 
      "poster_path": "/e1mjopzAS2KNsvpbpahQ1a6SkSn.jpg", 
      "adult": false, 
      "overview": "From DC Comics comes the Suicide Squad, an antihero team of incarcerated supervillains who act as deniable assets for the United States government, undertaking high-risk black ops missions in exchange for commuted prison sentences.", 
      "release_date": "2016-08-03", 
      "genre_ids": [ 
        14, 
        28, 
        80 
      ], 
      "id": 297761, 
      "original_title": "Suicide Squad", 
      "original_language": "en", 
      "title": "Suicide Squad", 
      "backdrop_path": "/ndlQ2Cuc3cjTL7lTynw6I4boP4S.jpg", 
      "popularity": 48.261451, 
      "vote_count": 1466, 
      "video": false, 
      "vote_average": 5.91 
    }, 

Get Top Rated 

{ 
  "page": 1, 
  "results": [ 
    { 
      "poster_path": "/9O7gLzmreU0nGkIB6K3BsJbzvNv.jpg", 
      "adult": false, 
      "overview": "Framed in the 1940s for the double murder of his wife and her lover, upstanding banker Andy Dufresne begins a new life at the Shawshank prison, where he puts his accounting skills to work for an amoral warden. During his long stretch in prison, Dufresne comes to be admired by the other inmates -- including an older prisoner named Red -- for his integrity and unquenchable sense of hope.", 
      "release_date": "1994-09-10", 
      "genre_ids": [ 
        18, 
        80 
      ], 
      "id": 278, 
      "original_title": "The Shawshank Redemption", 
      "original_language": "en", 
      "title": "The Shawshank Redemption", 
      "backdrop_path": "/xBKGJQsAIeweesB79KC89FpBrVr.jpg", 
      "popularity": 6.741296, 
      "vote_count": 5238, 
      "video": false, 
      "vote_average": 8.32 
    }, 

Get Upcoming 

{ 
  "page": 1, 
  "results": [ 
    { 
      "poster_path": "/pEFRzXtLmxYNjGd0XqJDHPDFKB2.jpg", 
      "adult": false, 
      "overview": "A lighthouse keeper and his wife living off the coast of Western Australia raise a baby they rescue from an adrift rowboat.", 
      "release_date": "2016-09-02", 
      "genre_ids": [ 
        18 
      ], 
      "id": 283552, 
      "original_title": "The Light Between Oceans", 
      "original_language": "en", 
      "title": "The Light Between Oceans", 
      "backdrop_path": "/2Ah63TIvVmZM3hzUwR5hXFg2LEk.jpg", 
      "popularity": 4.546151, 
      "vote_count": 11, 
      "video": false, 
      "vote_average": 4.41 
    }, 

Get Details 

{ 
  "headquarters": "Los Gatos, California", 
  "homepage": "http://www.netflix.com", 
  "id": 213, 
  "logo_path": "/wwemzKWzjKYJFfCeiB57q3r4Bcm.png", 
  "name": "Netflix", 
  "origin_country": "" 
} 

Get Alternative Names 

{ 
  "id": 174, 
  "results": [ 
    { 
      "name": "American Movie Classics", 
      "type": "1984–2002" 
    } 
  ] 
} 

Get Image 

{ 
  "id": 213, 
  "logos": [ 
    { 
      "aspect_ratio": 3.73134328358209, 
      "file_path": "/wwemzKWzjKYJFfCeiB57q3r4Bcm.png", 
      "height": 268, 
      "id": "5a7a61b5c3a36821980020ff", 
      "file_type": ".svg", 
      "vote_average": 0, 
      "vote_count": 0, 
      "width": 1000 
    } 
  ] 
} 

Get Trending 

{ 
  "page": 1, 
  "results": [ 
    { 
      "adult": false, 
      "backdrop_path": "/bOGkgRGdhrBYJSLpXaxhXVstddV.jpg", 
      "genre_ids": [ 
        28, 
        12, 
        14, 
        878 
      ], 
      "id": 299536, 
      "original_language": "en", 
      "original_title": "Avengers: Infinity War", 
      "overview": "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.", 
      "poster_path": "/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg", 
      "release_date": "2018-04-25", 
      "title": "Avengers: Infinity War", 
      "video": false, 
      "vote_average": 8.3, 
      "vote_count": 6937, 
      "popularity": 358.799 
    }, 

Get Details 

{ 
  "birthday": "1963-12-18", 
  "known_for_department": "Acting", 
  "deathday": null, 
  "id": 287, 
  "name": "Brad Pitt", 
  "also_known_as": [ 
    "برد پیت", 
    "Бред Питт", 
    "Бред Пітт", 
    "Buratto Pitto", 
    "Брэд Питт", 
    "畢·彼特", 
    "ブラッド・ピット", 
    "브래드 피트", 
    "براد بيت", 
    "แบรด พิตต์" 
  ], 
  "gender": 2, 
  "biography": "William Bradley \"Brad\" Pitt (born December 18, 1963) is an American actor and film producer. Pitt has received two Academy Award nominations and four Golden Globe Award nominations, winning one. He has been described as one of the world's most attractive men, a label for which he has received substantial media attention. Pitt began his acting career with television guest appearances, including a role on the CBS prime-time soap opera Dallas in 1987. He later gained recognition as the cowboy hitchhiker who seduces Geena Davis's character in the 1991 road movie Thelma & Louise. Pitt's first leading roles in big-budget productions came with A River Runs Through It (1992) and Interview with the Vampire (1994). He was cast opposite Anthony Hopkins in the 1994 drama Legends of the Fall, which earned him his first Golden Globe nomination. In 1995 he gave critically acclaimed performances in the crime thriller Seven and the science fiction film 12 Monkeys, the latter securing him a Golden Globe Award for Best Supporting Actor and an Academy Award nomination.\n\nFour years later, in 1999, Pitt starred in the cult hit Fight Club. He then starred in the major international hit as Rusty Ryan in Ocean's Eleven (2001) and its sequels, Ocean's Twelve (2004) and Ocean's Thirteen (2007). His greatest commercial successes have been Troy (2004) and Mr. & Mrs. Smith (2005).\n\nPitt received his second Academy Award nomination for his title role performance in the 2008 film The Curious Case of Benjamin Button. Following a high-profile relationship with actress Gwyneth Paltrow, Pitt was married to actress Jennifer Aniston for five years. Pitt lives with actress Angelina Jolie in a relationship that has generated wide publicity. He and Jolie have six children—Maddox, Pax, Zahara, Shiloh, Knox, and Vivienne.\n\nSince beginning his relationship with Jolie, he has become increasingly involved in social issues both in the United States and internationally. Pitt owns a production company named Plan B Entertainment, whose productions include the 2007 Academy Award winning Best Picture, The Departed.", 
  "popularity": 10.647, 
  "place_of_birth": "Shawnee, Oklahoma, USA", 
  "profile_path": "/kU3B75TyRiCgE270EyZnHjfivoq.jpg", 
  "adult": false, 
  "imdb_id": "nm0000093", 
  "homepage": null 
} 

Get Changes 

{ 
  "changes": [ 
    { 
      "key": "images", 
      "items": [ 
        { 
          "id": "5696d98292514154c9000291", 
          "action": "deleted", 
          "time": "2016-01-13 23:10:58 UTC", 
          "original_value": { 
            "profile": { 
              "file_path": "/wywUfSkVggWhUnXE4qucoIe1EcA.jpg" 
            } 
          } 
        } 
      ] 
    } 
  ] 
} 

Get Movie Credits 

{ 
  "cast": [ 
    { 
      "character": "Tristan Ludlow", 
      "credit_id": "52fe43c4c3a36847f806e20d", 
      "release_date": "1994-12-16", 
      "vote_count": 568, 
      "video": false, 
      "adult": false, 
      "vote_average": 7.2, 
      "title": "Legends of the Fall", 
      "genre_ids": [ 
        12, 
        18, 
        10749, 
        10752 
      ], 
      "original_language": "en", 
      "original_title": "Legends of the Fall", 
      "popularity": 2.356929, 
      "id": 4476, 
      "backdrop_path": "/jet7PQMY8aVzxBvkpG4P0eQI2n6.jpg", 
      "overview": "An epic tale of three brothers and their father living in the remote wilderness of 1900s USA and how their lives are affected by nature, history, war, and love.", 
      "poster_path": "/uh0sJcx3SLtclJSuKAXl6Tt6AV0.jpg" 
    }, 

Get TV Credits 

{ 
  "cast": [ 
    { 
      "credit_id": "525333fb19c295794002c720", 
      "original_name": "Growing Pains", 
      "id": 54, 
      "genre_ids": [ 
        35 
      ], 
      "character": "", 
      "name": "Growing Pains", 
      "poster_path": "/eKyeUFwjc0LhPSp129IHpXniJVR.jpg", 
      "vote_count": 25, 
      "vote_average": 6.2, 
      "popularity": 2.883124, 
      "episode_count": 2, 
      "original_language": "en", 
      "first_air_date": "1985-09-24", 
      "backdrop_path": "/xYpXcp7S8pStWihcksTQQue3jlV.jpg", 
      "overview": "Growing Pains is an American television sitcom about an affluent family, residing in Huntington, Long Island, New York, with a working mother and a stay-at-home psychiatrist father raising three children together, which aired on ABC from September 24, 1985, to April 25, 1992.", 
      "origin_country": [ 
        "US" 
      ] 
    }, 

Get Combined Credits 

{ 
  "cast": [ 
    { 
      "id": 54, 
      "original_language": "en", 
      "episode_count": 2, 
      "overview": "Growing Pains is an American television sitcom about an affluent family, residing in Huntington, Long Island, New York, with a working mother and a stay-at-home psychiatrist father raising three children together, which aired on ABC from September 24, 1985, to April 25, 1992.", 
      "origin_country": [ 
        "US" 
      ], 
      "original_name": "Growing Pains", 
      "genre_ids": [ 
        35 
      ], 
      "name": "Growing Pains", 
      "media_type": "tv", 
      "poster_path": "/eKyeUFwjc0LhPSp129IHpXniJVR.jpg", 
      "first_air_date": "1985-09-24", 
      "vote_average": 6.2, 
      "vote_count": 25, 
      "character": "", 
      "backdrop_path": "/xYpXcp7S8pStWihcksTQQue3jlV.jpg", 
      "popularity": 2.883124, 
      "credit_id": "525333fb19c295794002c720" 
    }, 

Get External IDs 

{ 
  "imdb_id": "nm0319213", 
  "facebook_id": null, 
  "freebase_mid": "/m/03y9ccy", 
  "freebase_id": null, 
  "tvrage_id": 67721, 
  "twitter_id": null, 
  "id": 66633 
} 

Get Images 

{ 
  "id": 66633, 
  "profiles": [ 
    { 
      "aspect_ratio": 0.666666666666667, 
      "file_path": "/rLSUjr725ez1cK7SKVxC9udO03Y.jpg", 
      "height": 819, 
      "iso_639_1": null, 
      "vote_average": 5.3125, 
      "vote_count": 1, 
      "width": 546 
    }, 
    { 
      "aspect_ratio": 0.666666666666667, 
      "file_path": "/lYqC8Amj4owX05xQg5Yo7uUHgah.jpg", 
      "height": 3000, 
      "iso_639_1": null, 
      "vote_average": 0, 
      "vote_count": 0, 
      "width": 2000 
    } 
  ] 
} 

Get Tagged Images 

{ 
  "id": 287, 
  "page": 1, 
  "results": [ 
    { 
      "aspect_ratio": 0.666666666666667, 
      "file_path": "/811DjJTon9gD6hZ8nCjSitaIXFQ.jpg", 
      "height": 1800, 
      "id": "5520e4a59251415c82002fb9", 
      "iso_639_1": "en", 
      "vote_average": 5.82903040734366, 
      "vote_count": 20, 
      "width": 1200, 
      "image_type": "poster", 
      "media": { 
        "adult": false, 
        "backdrop_path": "/8uO0gUM8aNqYLs1OsTBQiXu0fEv.jpg", 
        "genre_ids": [ 
          18 
        ], 
        "_id": "4bc88fc1017a3c122d009254", 
        "id": 550, 
        "original_language": "en", 
        "original_title": "Fight Club", 
        "overview": "A ticking-time-bomb insomniac and a slippery soap salesman channel primal male aggression into a shocking new form of therapy. Their concept catches on, with underground \"fight clubs\" forming in every town, until an eccentric gets in the way and ignites an out-of-control spiral toward oblivion.", 
        "release_date": "1999-10-14", 
        "poster_path": "/811DjJTon9gD6hZ8nCjSitaIXFQ.jpg", 
        "popularity": 6.590102, 
        "title": "Fight Club", 
        "video": false, 
        "vote_average": 8.1, 
        "vote_count": 5221 
      }, 
      "media_type": "movie" 
    }, 

Get Translations 

{ 
  "translations": [ 
    { 
      "iso_639_1": "en", 
      "iso_3166_1": "US", 
      "name": "English", 
      "data": { 
        "biography": "William Bradley \"Brad\" Pitt (born December 18, 1963) is an American actor and film producer. Pitt has received two Academy Award nominations and four Golden Globe Award nominations, winning one. He has been described as one of the world's most attractive men, a label for which he has received substantial media attention. Pitt began his acting career with television guest appearances, including a role on the CBS prime-time soap opera Dallas in 1987. He later gained recognition as the cowboy hitchhiker who seduces Geena Davis's character in the 1991 road movie Thelma & Louise. Pitt's first leading roles in big-budget productions came with A River Runs Through It (1992) and Interview with the Vampire (1994). He was cast opposite Anthony Hopkins in the 1994 drama Legends of the Fall, which earned him his first Golden Globe nomination. In 1995 he gave critically acclaimed performances in the crime thriller Seven and the science fiction film 12 Monkeys, the latter securing him a Golden Globe Award for Best Supporting Actor and an Academy Award nomination.\n\nFour years later, in 1999, Pitt starred in the cult hit Fight Club. He then starred in the major international hit as Rusty Ryan in Ocean's Eleven (2001) and its sequels, Ocean's Twelve (2004) and Ocean's Thirteen (2007). His greatest commercial successes have been Troy (2004) and Mr. & Mrs. Smith (2005).\n\nPitt received his second Academy Award nomination for his title role performance in the 2008 film The Curious Case of Benjamin Button. Following a high-profile relationship with actress Gwyneth Paltrow, Pitt was married to actress Jennifer Aniston for five years. Pitt lives with actress Angelina Jolie in a relationship that has generated wide publicity. He and Jolie have six children—Maddox, Pax, Zahara, Shiloh, Knox, and Vivienne.\n\nSince beginning his relationship with Jolie, he has become increasingly involved in social issues both in the United States and internationally. Pitt owns a production company named Plan B Entertainment, whose productions include the 2007 Academy Award winning Best Picture, The Departed." 
      }, 
      "english_name": "en" 
    }, 
 

 

Get Latest 

{ 
  "adult": false, 
  "also_known_as": [], 
  "biography": null, 
  "birthday": null, 
  "deathday": null, 
  "gender": 0, 
  "homepage": null, 
  "id": 1671971, 
  "imdb_id": null, 
  "name": "Midnight Syndicate", 
  "place_of_birth": null, 
  "popularity": 0, 
  "profile_path": null 
} 

Get Popular 

{ 
  "page": 1, 
  "results": [ 
    { 
      "profile_path": "/z3sLuRKP7hQVrvSTsqdLjGSldwG.jpg", 
      "adult": false, 
      "id": 28782, 
      "known_for": [ 
        { 
          "poster_path": "/hE24GYddaxB9MVZl1CaiI86M3kp.jpg", 
          "adult": false, 
          "overview": "A cryptic message from Bond’s past sends him on a trail to uncover a sinister organization. While M battles political forces to keep the secret service alive, Bond peels back the layers of deceit to reveal the terrible truth behind SPECTRE.", 
          "release_date": "2015-10-26", 
          "original_title": "Spectre", 
          "genre_ids": [ 
            28, 
            12, 
            80 
          ], 
          "id": 206647, 
          "media_type": "movie", 
          "original_language": "en", 
          "title": "Spectre", 
          "backdrop_path": "/wVTYlkKPKrljJfugXN7UlLNjtuJ.jpg", 
          "popularity": 7.090211, 
          "vote_count": 2956, 
          "video": false, 
          "vote_average": 6.2 
        }, 

Get Details 

{ 
  "id": "58aa82f09251416f92006a3a", 
  "author": "lmao7", 
  "author_details": { 
    "name": "lmao7", 
    "username": "lmao7", 
    "avatar_path": "/ekmYOUU4tfx9zGGadjRdE7UPce.jpg", 
    "rating": 9 
  }, 
  "content": "I started watching when it came out as I heard that fans of LOTR also liked this. I stopped watching after Season 1 as I was devastated lol kinda. Only 2015 I decided to continue watching and got addicted like it seemed complicated at first, too many stories and characters. I even used a guide from internet like family tree per house while watching or GOT wiki so I can have more background on the characters. For a TV series, this show can really take you to a different world and never knowing what will happen. It is very daring that any time anybody can just die (I learned not to be attached and have accepted that they will all die so I won't be devastated hehe). I have never read the books but the show is entertaining and you will really root for your faves and really hate on those you hate. \r\n\r\nFantasy, action, drama, comedy, love...and lots of surprises!", 
  "created_at": "2017-02-20T05:47:28.872Z", 
  "iso_639_1": "en", 
  "media_id": 1399, 
  "media_title": "Game of Thrones", 
  "media_type": "tv", 
  "updated_at": "2017-02-20T05:59:47.762Z", 
  "url": "https://www.themoviedb.org/review/58aa82f09251416f92006a3a" 
} 

Search Companies 

{ 
  "page": 1, 
  "results": [ 
    { 
      "id": 34, 
      "logo_path": "/GagSvqWlyPdkFHMfQ3pNq6ix9P.png", 
      "name": "Sony Pictures" 
    }, 

Search Collections 

{ 
  "page": 1, 
  "results": [ 
    { 
      "id": 9485, 
      "backdrop_path": "/z5A5W3WYJc3UVEWljSGwdjDgQ0j.jpg", 
      "name": "The Fast and the Furious Collection", 
      "poster_path": "/uv63yAGg1zETAs1XQsOQpava87l.jpg" 
    } 
  ], 
  "total_pages": 1, 
  "total_results": 1 
} 

Search Keywords 

{ 
  "page": 1, 
  "results": [ 
    { 
      "id": 9951, 
      "name": "alien" 
    }, 

Search Movies 

{ 
  "page": 1, 
  "results": [ 
    { 
      "poster_path": "/cezWGskPY5x7GaglTTRN4Fugfb8.jpg", 
      "adult": false, 
      "overview": "When an unexpected enemy emerges and threatens global safety and security, Nick Fury, director of the international peacekeeping agency known as S.H.I.E.L.D., finds himself in need of a team to pull the world back from the brink of disaster. Spanning the globe, a daring recruitment effort begins!", 
      "release_date": "2012-04-25", 
      "genre_ids": [ 
        878, 
        28, 
        12 
      ], 
      "id": 24428, 
      "original_title": "The Avengers", 
      "original_language": "en", 
      "title": "The Avengers", 
      "backdrop_path": "/hbn46fQaRmlpBuUrEiFqv0GDL6Y.jpg", 
      "popularity": 7.353212, 
      "vote_count": 8503, 
      "video": false, 
      "vote_average": 7.33 
    }, 

Multi Search 

{ 
  "page": 1, 
  "results": [ 
    { 
      "poster_path": "/cezWGskPY5x7GaglTTRN4Fugfb8.jpg", 
      "adult": false, 
      "overview": "When an unexpected enemy emerges and threatens global safety and security, Nick Fury, director of the international peacekeeping agency known as S.H.I.E.L.D., finds himself in need of a team to pull the world back from the brink of disaster. Spanning the globe, a daring recruitment effort begins!", 
      "release_date": "2012-04-25", 
      "genre_ids": [ 
        878, 
        28, 
        12 
      ], 
      "id": 24428, 
      "original_title": "The Avengers", 
      "original_language": "en", 
      "title": "The Avengers", 
      "backdrop_path": "/hbn46fQaRmlpBuUrEiFqv0GDL6Y.jpg", 
      "popularity": 7.353212, 
      "vote_count": 8503, 
      "video": false, 
      "vote_average": 7.33 
    }, 

Search Peoples 

{ 
  "page": 1, 
  "results": [ 
    { 
      "profile_path": "/2daC5DeXqwkFND0xxutbnSVKN6c.jpg", 
      "adult": false, 
      "id": 51329, 
      "known_for": [ 
        { 
          "poster_path": "/y31QB9kn3XSudA15tV7UWQ9XLuW.jpg", 
          "adult": false, 
          "overview": "Light years from Earth, 26 years after being abducted, Peter Quill finds himself the prime target of a manhunt after discovering an orb wanted by Ronan the Accuser.", 
          "release_date": "2014-07-30", 
          "original_title": "Guardians of the Galaxy", 
          "genre_ids": [ 
            28, 
            878, 
            12 
          ], 
          "id": 118340, 
          "media_type": "movie", 
          "original_language": "en", 
          "title": "Guardians of the Galaxy", 
          "backdrop_path": "/bHarw8xrmQeqf3t8HpuMY7zoK4x.jpg", 
          "popularity": 9.267731, 
          "vote_count": 5002, 
          "video": false, 
          "vote_average": 7.97 
        }, 

Search TV Shows 

{ 
  "page": 1, 
  "results": [ 
    { 
      "poster_path": "/jIhL6mlT7AblhbHJgEoiBIOUVl1.jpg", 
      "popularity": 29.780826, 
      "id": 1399, 
      "backdrop_path": "/mUkuc2wyV9dHLG0D0Loaw5pO2s8.jpg", 
      "vote_average": 7.91, 
      "overview": "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.", 
      "first_air_date": "2011-04-17", 
      "origin_country": [ 
        "US" 
      ], 
      "genre_ids": [ 
        10765, 
        10759, 
        18 
      ], 
      "original_language": "en", 
      "vote_count": 1172, 
      "name": "Game of Thrones", 
      "original_name": "Game of Thrones" 
    } 
  ], 
  "total_results": 1, 
  "total_pages": 1 
} 

Get Details 

{ 
  "backdrop_path": "/suopoADq0k8YZr4dQXcU6pToj6s.jpg", 
  "created_by": [ 
    { 
      "id": 9813, 
      "credit_id": "5256c8c219c2956ff604858a", 
      "name": "David Benioff", 
      "gender": 2, 
      "profile_path": "/xvNN5huL0X8yJ7h3IZfGG4O2zBD.jpg" 
    }, 

Get Account States 

{ 
  "id": 1399, 
  "favorite": true, 
  "rated": { 
    "value": 9 
  }, 
  "watchlist": false 
} 

Get Aggregative Credits 

{ 
  "cast": [ 
    { 
      "adult": false, 
      "gender": 1, 
      "id": 1223786, 
      "known_for_department": "Acting", 
      "name": "Emilia Clarke", 
      "original_name": "Emilia Clarke", 
      "popularity": 14.322, 
      "profile_path": "/r6i4C3kYrBRzUzZ8JKAHYQ0T0dD.jpg", 
      "roles": [ 
        { 
          "credit_id": "5256c8af19c2956ff60479f6", 
          "character": "Daenerys Targaryen", 
          "episode_count": 73 
        } 
      ], 
      "total_episode_count": 73, 
      "order": 0 
    }, 

Get Alternative Titles 

{ 
  "id": 1399, 
  "results": [ 
    { 
      "title": "Game of Thrones - Das Lied von Eis und Feuer", 
      "iso_3166_1": "DE" 
    }, 

Get Changes 

{ 
  "changes": [ 
    { 
      "key": "season", 
      "items": [ 
        { 
          "id": "5725bbf49251411e9f002658", 
          "action": "updated", 
          "time": "2016-05-01 08:19:00 UTC", 
          "value": { 
            "season_id": 71881, 
            "season_number": 6 
          } 
        }, 

Get Content Ratings 

{ 
  "results": [ 
    { 
      "iso_3166_1": "DE", 
      "rating": "16" 
    }, 
 
 

Get Credits 

{ 
  "cast": [ 
    { 
      "adult": false, 
      "gender": 1, 
      "id": 1223786, 
      "known_for_department": "Acting", 
      "name": "Emilia Clarke", 
      "original_name": "Emilia Clarke", 
      "popularity": 14.322, 
      "profile_path": "/r6i4C3kYrBRzUzZ8JKAHYQ0T0dD.jpg", 
      "character": "Daenerys Targaryen", 
      "credit_id": "5256c8af19c2956ff60479f6", 
      "order": 0 
    }, 

Get Episode Groups 

{ 
  "results": [ 
    { 
      "description": "All episodes chronologically split by calendar year.", 
      "episode_count": 903, 
      "group_count": 23, 
      "id": "5af83d88c3a3682ac8007b28", 
      "name": "Year Split", 
      "network": { 
        "id": 569, 
        "logo_path": "/cIMyE9cw1W4kMFGxmC17HKTnVz9.png", 
        "name": "Yomiuri Telecasting Corporation", 
        "origin_country": "JP" 
      }, 
      "type": 1 
    }, 

Get External IDs 

{ 
  "imdb_id": "tt0944947", 
  "freebase_mid": "/m/0524b41", 
  "freebase_id": "/en/game_of_thrones", 
  "tvdb_id": 121361, 
  "tvrage_id": 24493, 
  "facebook_id": "GameOfThrones", 
  "instagram_id": "gameofthrones", 
  "twitter_id": "GameOfThrones", 
  "id": 1399 
} 

Get Images 

{ 
  "backdrops": [ 
    { 
      "aspect_ratio": 1.77777777777778, 
      "file_path": "/mUkuc2wyV9dHLG0D0Loaw5pO2s8.jpg", 
      "height": 1080, 
      "iso_639_1": null, 
      "vote_average": 5.6265664160401, 
      "vote_count": 13, 
      "width": 1920 
    }, 

Get Keywords 

{ 
  "id": 1399, 
  "results": [ 
    { 
      "id": 6091, 
      "name": "war" 
    }, 

Get Recommendations 

{ 
  "page": 1, 
  "results": [ 
    { 
      "backdrop_path": "/AwB0BmQm1GxP0BH8ZL7WPNDTkb5.jpg", 
      "first_air_date": "2016-01-05", 
      "genre_ids": [ 
        10759, 
        10765 
      ], 
      "id": 64122, 
      "original_language": "en", 
      "original_name": "The Shannara Chronicles", 
      "overview": "A young Healer armed with an unpredictable magic guides a runaway Elf in her perilous quest to save the peoples of the Four Lands from an age-old Demon scourge.", 
      "origin_country": [ 
        "US" 
      ], 
      "poster_path": "/aurZJ8UsXqhGwwBnNuZsPNepY8y.jpg", 
      "popularity": 9.523348, 
      "name": "The Shannara Chronicles", 
      "vote_average": 5.5, 
      "vote_count": 61 
    }, 

Get Reviews 

{ 
  "id": 1399, 
  "page": 1, 
  "results": [ 
    { 
      "author": "lmao7", 
      "author_details": { 
        "name": "lmao7", 
        "username": "lmao7", 
        "avatar_path": "/ekmYOUU4tfx9zGGadjRdE7UPce.jpg", 
        "rating": 9 
      }, 
      "content": "I started watching when it came out as I heard that fans of LOTR also liked this. I stopped watching after Season 1 as I was devastated lol kinda. Only 2015 I decided to continue watching and got addicted like it seemed complicated at first, too many stories and characters. I even used a guide from internet like family tree per house while watching or GOT wiki so I can have more background on the characters. For a TV series, this show can really take you to a different world and never knowing what will happen. It is very daring that any time anybody can just die (I learned not to be attached and have accepted that they will all die so I won't be devastated hehe). I have never read the books but the show is entertaining and you will really root for your faves and really hate on those you hate. \r\n\r\nFantasy, action, drama, comedy, love...and lots of surprises!", 
      "created_at": "2017-02-20T05:47:28.872Z", 
      "id": "58aa82f09251416f92006a3a", 
      "updated_at": "2017-02-20T05:59:47.762Z", 
      "url": "https://www.themoviedb.org/review/58aa82f09251416f92006a3a" 
    }, 

Get Screened Theatrically 

{ 
  "id": 68716, 
  "results": [ 
    { 
      "id": 1279700, 
      "episode_number": 1, 
      "season_number": 1 
    }, 
    { 
      "id": 1332116, 
      "episode_number": 2, 
      "season_number": 1 
    } 
  ] 
} 

Get Similar Movies 

{ 
  "page": 1, 
  "results": [ 
    { 
      "backdrop_path": "/AwB0BmQm1GxP0BH8ZL7WPNDTkb5.jpg", 
      "first_air_date": "2016-01-05", 
      "genre_ids": [ 
        10759, 
        10765 
      ], 
      "id": 64122, 
      "original_language": "en", 
      "original_name": "The Shannara Chronicles", 
      "overview": "A young Healer armed with an unpredictable magic guides a runaway Elf in her perilous quest to save the peoples of the Four Lands from an age-old Demon scourge.", 
      "origin_country": [ 
        "US" 
      ], 
      "poster_path": "/aurZJ8UsXqhGwwBnNuZsPNepY8y.jpg", 
      "popularity": 9.523348, 
      "name": "The Shannara Chronicles", 
      "vote_average": 5.5, 
      "vote_count": 61 
    }, 

Get Similar TV Shows 

{ 
  "page": 1, 
  "results": [ 
    { 
      "backdrop_path": "/AwB0BmQm1GxP0BH8ZL7WPNDTkb5.jpg", 
      "first_air_date": "2016-01-05", 
      "genre_ids": [ 
        10759, 
        10765 
      ], 
      "id": 64122, 
      "original_language": "en", 
      "original_name": "The Shannara Chronicles", 
      "overview": "A young Healer armed with an unpredictable magic guides a runaway Elf in her perilous quest to save the peoples of the Four Lands from an age-old Demon scourge.", 
      "origin_country": [ 
        "US" 
      ], 
      "poster_path": "/aurZJ8UsXqhGwwBnNuZsPNepY8y.jpg", 
      "popularity": 9.523348, 
      "name": "The Shannara Chronicles", 
      "vote_average": 5.5, 
      "vote_count": 61 
    }, 

Get Translations 

{ 
  "id": 1399, 
  "translations": [ 
    { 
      "iso_3166_1": "US", 
      "iso_639_1": "en", 
      "name": "English", 
      "english_name": "English", 
      "data": { 
        "name": "", 
        "overview": "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.", 
        "homepage": "" 
      } 
    }, 

Get Videos 

{ 
  "id": 1399, 
  "results": [ 
    { 
      "iso_639_1": "en", 
      "iso_3166_1": "US", 
      "name": "Inside Game of Thrones: A Story in Camera Work – BTS (HBO)", 
      "key": "y2ZJ3lTaREY", 
      "site": "YouTube", 
      "size": 1080, 
      "type": "Behind the Scenes", 
      "official": true, 
      "published_at": "2019-03-25T14:00:06.000Z", 
      "id": "5c999b48c3a36863b73b9d42" 
    }, 

Get Watch Providers 

{ 
  "id": 1399, 
  "results": { 
    "AR": { 
      "link": "https://www.themoviedb.org/tv/1399-game-of-thrones/watch?locale=AR", 
      "flatrate": [ 
        { 
          "display_priority": 4, 
          "logo_path": "/2slPVV21kaPDx0NwjVtcUjdvzXz.jpg", 
          "provider_id": 31, 
          "provider_name": "HBO Go" 
        }, 

Rate TV Shows 

{ 
  "status_code": 1, 
  "status_message": "Success." 
} 

Delete Rating 

{ 
  "status_code": 13, 
  "status_message": "The item/record was deleted successfully." 
} 

Get Latest 

{ 
  "backdrop_path": null, 
  "created_by": [], 
  "episode_run_time": [ 
    30 
  ], 
  "first_air_date": "2016-08-23", 
  "genres": [ 
    { 
      "id": 35, 
      "name": "Comedy" 
    }, 

Get TV Airing Today 

{ 
  "page": 1, 
  "results": [ 
    { 
      "poster_path": "/zra8NrzxaEeunRWJmUm3HZOL4sd.jpg", 
      "popularity": 11.520271, 
      "id": 67419, 
      "backdrop_path": "/b0BckgEovxYLBbIk5xXyWYQpmlT.jpg", 
      "vote_average": 1.39, 
      "overview": "The early life of Queen Victoria, from her accession to the throne at the tender age of 18 through to her courtship and marriage to Prince Albert. Victoria went on to rule for 63 years, and was the longest-serving monarch until she was overtaken by Elizabeth II on 9th September 2016. Rufus Sewell was Victoria’s first prime minister; the two immediately connected and their intimate friendship became a popular source of gossip that threatened to destabilise the Government – angering both Tory and Whigs alike.", 
      "first_air_date": "2016-08-28", 
      "origin_country": [ 
        "GB" 
      ], 
      "genre_ids": [ 
        18 
      ], 
      "original_language": "en", 
      "vote_count": 9, 
      "name": "Victoria", 
      "original_name": "Victoria" 
    }, 

Get TV On The Air 

{ 
  "page": 1, 
  "results": [ 
    { 
      "poster_path": "/vC324sdfcS313vh9QXwijLIHPJp.jpg", 
      "popularity": 47.432451, 
      "id": 31917, 
      "backdrop_path": "/rQGBjWNveVeF8f2PGRtS85w9o9r.jpg", 
      "vote_average": 5.04, 
      "overview": "Based on the Pretty Little Liars series of young adult novels by Sara Shepard, the series follows the lives of four girls — Spencer, Hanna, Aria, and Emily — whose clique falls apart after the disappearance of their queen bee, Alison. One year later, they begin receiving messages from someone using the name \"A\" who threatens to expose their secrets — including long-hidden ones they thought only Alison knew.", 
      "first_air_date": "2010-06-08", 
      "origin_country": [ 
        "US" 
      ], 
      "genre_ids": [ 
        18, 
        9648 
      ], 
      "original_language": "en", 
      "vote_count": 133, 
      "name": "Pretty Little Liars", 
      "original_name": "Pretty Little Liars" 
    }, 

Get Popular 

{ 
  "page": 1, 
  "results": [ 
    { 
      "poster_path": "/vC324sdfcS313vh9QXwijLIHPJp.jpg", 
      "popularity": 47.432451, 
      "id": 31917, 
      "backdrop_path": "/rQGBjWNveVeF8f2PGRtS85w9o9r.jpg", 
      "vote_average": 5.04, 
      "overview": "Based on the Pretty Little Liars series of young adult novels by Sara Shepard, the series follows the lives of four girls — Spencer, Hanna, Aria, and Emily — whose clique falls apart after the disappearance of their queen bee, Alison. One year later, they begin receiving messages from someone using the name \"A\" who threatens to expose their secrets — including long-hidden ones they thought only Alison knew.", 
      "first_air_date": "2010-06-08", 
      "origin_country": [ 
        "US" 
      ], 
      "genre_ids": [ 
        18, 
        9648 
      ], 
      "original_language": "en", 
      "vote_count": 133, 
      "name": "Pretty Little Liars", 
      "original_name": "Pretty Little Liars" 
    }, 

Get Top Rated 

{ 
  "page": 1, 
  "results": [ 
    { 
      "poster_path": "/tfdiVvJkYMbUOXDWibPjzu5dY6S.jpg", 
      "popularity": 1.722162, 
      "id": 604, 
      "backdrop_path": "/hHwEptckXUwZM7XO2lxZ8w8upuU.jpg", 
      "vote_average": 8.17, 
      "overview": "Teen Titans is an American animated television series based on the DC Comics characters of the same name, primarily the run of stories by Marv Wolfman and George Pérez in the early-1980s The New Teen Titans comic book series. The show was created by Glen Murakami, developed by David Slack, and produced by Warner Bros. Animation. It premiered on Cartoon Network on July 19, 2003 with the episode \"Divide and Conquer\" and the final episode \"Things Change\" aired on January 16, 2006, with the film Teen Titans: Trouble in Tokyo serving as the series finale. A comic book series, Teen Titans Go!, was based on the TV series. On June 8, 2012, it was announced that the series would be revived as Teen Titans Go! in April 23, 2013 and air on the DC Nation block.IT now airs on the Boomerang channel. ", 
      "first_air_date": "2003-07-19", 
      "origin_country": [ 
        "US" 
      ], 
      "genre_ids": [ 
        16, 
        10759 
      ], 
      "original_language": "en", 
      "vote_count": 12, 
      "name": "Teen Titans", 
      "original_name": "Teen Titans" 
    }, 

Get Details 

{ 
  "_id": "5256c89f19c2956ff6046d47", 
  "air_date": "2011-04-17", 
  "episodes": [ 
    { 
      "air_date": "2011-04-17", 
      "episode_number": 1, 
      "crew": [ 
        { 
          "department": "Directing", 
          "job": "Director", 
          "credit_id": "5256c8a219c2956ff6046e77", 
          "adult": false, 
          "gender": 2, 
          "id": 44797, 
          "known_for_department": "Directing", 
          "name": "Timothy Van Patten", 
          "original_name": "Timothy Van Patten", 
          "popularity": 2.744, 
          "profile_path": "/MzSOFrd99HRdr6pkSRSctk3kBR.jpg" 
        }, 

Get Account States 

"id": 3624, 
  "results": [ 
    { 
      "id": 63056, 
      "episode_number": 1, 
      "rated": { 
        "value": 9 
      } 
    }, 

Get Aggregative Credits 

{ 
  "cast": [ 
    { 
      "adult": false, 
      "gender": 1, 
      "id": 1223786, 
      "known_for_department": "Acting", 
      "name": "Emilia Clarke", 
      "original_name": "Emilia Clarke", 
      "popularity": 14.322, 
      "profile_path": "/r6i4C3kYrBRzUzZ8JKAHYQ0T0dD.jpg", 
      "roles": [ 
        { 
          "credit_id": "5256c8af19c2956ff60479f6", 
          "character": "Daenerys Targaryen", 
          "episode_count": 10 
        } 
      ], 
      "total_episode_count": 10, 
      "order": 0 
    }, 

Get Changes 

{ 
  "changes": [ 
    { 
      "key": "episode", 
      "items": [ 
        { 
          "id": "5717c8c69251414cfd00250f", 
          "action": "updated", 
          "time": "2016-04-20 18:21:58 UTC", 
          "value": { 
            "episode_id": 63056, 
            "episode_number": 1 
          } 
        },  

Get Credits 

{ 
  "cast": [ 
    { 
      "adult": false, 
      "gender": 1, 
      "id": 1223786, 
      "known_for_department": "Acting", 
      "name": "Emilia Clarke", 
      "original_name": "Emilia Clarke", 
      "popularity": 14.322, 
      "profile_path": "/r6i4C3kYrBRzUzZ8JKAHYQ0T0dD.jpg", 
      "character": "Daenerys Targaryen", 
      "credit_id": "5256c8af19c2956ff60479f6", 
      "order": 0 
    }, 

Get External IDs 

{ 
  "cast": [ 
    { 
      "adult": false, 
      "gender": 1, 
      "id": 1223786, 
      "known_for_department": "Acting", 
      "name": "Emilia Clarke", 
      "original_name": "Emilia Clarke", 
      "popularity": 14.322, 
      "profile_path": "/r6i4C3kYrBRzUzZ8JKAHYQ0T0dD.jpg", 
      "character": "Daenerys Targaryen", 
      "credit_id": "5256c8af19c2956ff60479f6", 
      "order": 0 
    }, 

Get Images 

{ 
  "id": 3624, 
  "posters": [ 
    { 
      "aspect_ratio": 0.666666666666667, 
      "file_path": "/olJ6ivXxCMq3cfujo1IRw30OrsQ.jpg", 
      "height": 1425, 
      "iso_639_1": "en", 
      "vote_average": 5.37612146307798, 
      "vote_count": 6, 
      "width": 950 
    }, 

Get Translations 

{ 
  "id": 3624, 
  "translations": [ 
    { 
      "iso_3166_1": "SA", 
      "iso_639_1": "ar", 
      "name": "العربية", 
      "english_name": "Arabic", 
      "data": { 
        "name": "", 
        "overview": "سلسلة درامية مبنية على سلسلة روايات لـ جورج آر آر مارتن بعنوان \"إيه سونغ أوف آيس أن فاير\" والتي حققت مبيعات كبيرة وتتمحور حول الصراعات التي كانت تحدث في العصور الوسطى بين العائلات النبيلة للسيطرة على عرش وستيروس." 
      } 
    }, 

Get Videos 

{ 
  "id": 3624, 
  "results": [ 
    { 
      "iso_639_1": "en", 
      "iso_3166_1": "US", 
      "name": "Game Of Thrones - Season 1 Recap - Official HBO UK", 
      "key": "e0Y8KpQpW8c", 
      "site": "YouTube", 
      "size": 1080, 
      "type": "Recap", 
      "official": true, 
      "published_at": "2015-05-19T16:31:23.000Z", 
      "id": "5ce71a920e0a265ac0cfe497" 
    }, 

Get Details 

{ 
  "air_date": "2011-04-17", 
  "crew": [ 
    { 
      "id": 44797, 
      "credit_id": "5256c8a219c2956ff6046e77", 
      "name": "Tim Van Patten", 
      "department": "Directing", 
      "job": "Director", 
      "profile_path": "/6b7l9YbkDHDOzOKUFNqBVaPjcgm.jpg" 
    }, 

Get Account States 

{ 
  "id": 63056, 
  "rated": { 
    "value": 9 
  } 
} 

Get Changes 

{ 
  "changes": [ 
    { 
      "key": "production_code", 
      "items": [ 
        { 
          "id": "54bd9ed7c3a3686c6b00da66", 
          "action": "added", 
          "time": "2015-01-20 00:18:31 UTC", 
          "value": "101" 
        } 
      ] 
    }, 

Get Credits 

{ 
  "cast": [ 
    { 
      "adult": false, 
      "gender": 1, 
      "id": 1223786, 
      "known_for_department": "Acting", 
      "name": "Emilia Clarke", 
      "original_name": "Emilia Clarke", 
      "popularity": 14.322, 
      "profile_path": "/r6i4C3kYrBRzUzZ8JKAHYQ0T0dD.jpg", 
      "character": "Daenerys Targaryen", 
      "credit_id": "5256c8af19c2956ff60479f6", 
      "order": 0 
    }, 

Get External IDs 

{ 
  "imdb_id": "tt1480055", 
  "freebase_mid": "/m/0gmc6ph", 
  "freebase_id": "/en/winter_is_coming", 
  "tvdb_id": 3254641, 
  "tvrage_id": 1065008299, 
  "id": 63056 
} 

Get Images 

{ 
  "id": 63056, 
  "stills": [ 
    { 
      "aspect_ratio": 1.77777777777778, 
      "file_path": "/wrGWeW4WKxnaeA8sxJb2T9O6ryo.jpg", 
      "height": 1080, 
      "iso_639_1": null, 
      "vote_average": 5.30505952380952, 
      "vote_count": 1, 
      "width": 1920 
    }, 

Get Translations 

{ 
  "id": 63056, 
  "translations": [ 
    { 
      "iso_3166_1": "US", 
      "iso_639_1": "en", 
      "name": "English", 
      "english_name": "English", 
      "data": { 
        "name": "Winter Is Coming", 
        "overview": "Jon Arryn, the Hand of the King, is dead. King Robert Baratheon plans to ask his oldest friend, Eddard Stark, to take Jon's place. Across the sea, Viserys Targaryen plans to wed his sister to a nomadic warlord in exchange for an army." 
      } 
    }, 

Rate TV Episodes 

{ 
  "status_code": 1, 
  "status_message": "Success." 
} 

Delete Rating 

{ 
  "status_code": 13, 
  "status_message": "The item/record was deleted successfully." 
} 

Get Videos 

{ 
  "id": 63057, 
  "results": [ 
    { 
      "iso_639_1": "en", 
      "iso_3166_1": "US", 
      "name": "Game of Thrones: Season 1 - Episode 2 Clip #1 (HBO)", 
      "key": "kPrW3Swrp4E", 
      "published_at": "2011-04-21T20:16:51.000Z", 
      "site": "YouTube", 
      "size": 720, 
      "type": "Clip", 
      "official": true, 
      "id": "5349285f0e0a266b4a00153e" 
    } 
  ] 
} 

Get details 

{ 
  "description": "Comedians in Cars organized in Netflix's collections.", 
  "episode_count": 71, 
  "group_count": 5, 
  "groups": [ 
    { 
      "id": "5acf93efc3a368739a0000a9", 
      "name": "First Cup", 
      "order": 1, 
      "episodes": [ 
        { 
          "air_date": "2015-06-17", 
          "episode_number": 3, 
          "id": 1078262, 
          "name": "Jim Carrey: We Love Breathing What You're Burning, Baby", 
          "overview": "Jerry’s full of testosterone as he steps into a ‘76 Lamborghini Countach with Jim Carrey, who’s between a three-week cleanse and a five-day silent retreat. After coffee, it’s off to Carrey’s studio to study a portrait of a gorilla with a machine gun. Wow.", 
          "production_code": null, 
          "season_number": 6, 
          "show_id": 59717, 
          "still_path": "/aOyE420zuFq9zWtEWjIccAiTrzU.jpg", 
          "vote_average": 0, 
          "vote_count": 0, 
          "order": 0 
        }, 

Get Available Regions 

{ 
  "results": [ 
    { 
      "iso_3166_1": "AR", 
      "english_name": "Argentina", 
      "native_name": "Argentina" 
    }, 

Get Movie Providers 

{ 
  "results": [ 
    { 
      "display_priority": 0, 
      "logo_path": "/9A1JSVmSxsyaBK4SUFsYVqbAYfW.jpg", 
      "provider_name": "Netflix", 
      "provider_id": 8 
    }, 

Get TV Providers 

{ 
  "results": [ 
    { 
      "display_priority": 0, 
      "logo_path": "/9A1JSVmSxsyaBK4SUFsYVqbAYfW.jpg", 
      "provider_name": "Netflix", 
      "provider_id": 8 
    }, 

	 

ATRIBUTOS/PARÂMETROS SOLICITADOS POR CADA MÉTODO 

Get Detail 

Api_key string 

Get Created List 

account_id integer 

Get Favorite Movies 

account_id integer 

Get Favorite TV Shows 

account_id integer 

Mark as Favorite 

account_id integer 

Get Rated Movies 

account_id integer 

Get Rated TV Shows 

account_id integer 

Get Rated TV Episodes 

account_id string 

Get Movies Watchlist 

account_id integer 

Get TV Show Watchlist 

account_id integer 

Add to Watchlist 

account_id integer 

Create Guest Session 

Api_key string 

Create Request Token 

Api_key string 

Create Session 

Api_key string 

Create Session With Login 

Api_key string 

Create Session (from v4 access token) 

Api_key string 

Delete Session 

Api_key string 

Get Movie Certifications 

Api_key string 

Get TV Certifications 

Api_key string 

Get Movie Change List 

Api_key string, end_date string, star_date string e page integer 

Get TV Change List 

Api_key string, end_date string, star_date string e page integer 

Get Perso Change List 

 Api_key string, end_date string, star_date string e page integer 

Get Details 

collection_id integer 

Get Images 

collection_id integer 

Get Translations 

collection_id integer 

Get Details 

company_id integer 

Get Alternative Names 

company_id integer 

Get Images 

company_id integer 

Get API Configuration 

Api_key string 

Get  Countries 

Api_key string 

Get Jobs 

Api_key string 

Get Languages 

Api_key string 

Get Primary Translations 

Api_key string 

Get Timezones 

Api_key string 

Get Details 

credit_id string 

Movie Discover 

Api_key 

TV Discover 

Api_key 

Find by ID 

External_id string 

Get Movie List 

Api_key string e langue  

Get TV List 

Api_key string e langue 

Get Rated Movie 

guest_session_id string 

Get Rated TV Show 

guest_session_id string 

Get Rated TV Episodes 

guest_session_id string 

Get Details 

keyword_id integer 

Get Movies 

keyword_id integer 

Get Details 

list_id string ou integer 

Check Item Status 

list_id string ou integer 

Create List 

Content-Type 

Add Movies 

list_id string ou integer 

Remove Movies 

list_id string ou integer 

Clear List 

list_id string  

Delete List 

list_id string  

Get Details 

movie_id integer 

Get Account States 

movie_id integer 

Get Alternative Titles 

company_id integer 

Get Changes 

movie_id integer 

Get Credits 

movie_id integer 

Get External IDs 

movie_id integer 

Get Images 

movie_id integer 

Get Keywords 

movie_id integer 

Get Lists 

movie_id integer 

Get Recommendations 

movie_id integer 

Get Release Dates 

movie_id integer 

Get Reviews 

movie_id integer 

Get Similar Movies 

movie_id integer 

Get Translations 

movie_id integer 

Get Videos 

movie_id integer 

Get Watch Providers 

movie_id integer 

Rate Movies 

movie_id integer 

Delete Rating 

movie_id integer 

Get Latest 

Api_key e language 

Get Now Playing 

Api_key, language, page e region 

Get Popular 

Api_key, language, page e region 

Get Top Rated 

Api_key, language, page e region 

Get Upcoming 

Api_key, language, page e region 

Get Details 

network_id integer 

Get Alternative Names 

network_id integer 

Get Image 

network_id integer 

Get Trending 

media_type e time_window 

Get Details 

credit_id string 

Get Changes 

person_id integer 

Get Movie Credits 

person_id integer 

Get TV Credits 

person_id integer 

Get Combined Credits 

person_id integer 

Get External IDs 

person_id integer 

Get Images 

person_id integer 

Get Tagged Images 

person_id integer 

Get Translations 

person_id integer 

Get Latest 

Api_key e language 

Get Popular 

Api_key e language 

Get Details 

review_id string 

Search Companies 

Api_key, query e page 

Search Collections 

Api_key, query, page e language 

Search Keywords 

Api_key, query e page 

Search Movies 

Api_key, query, page, language, include_adult, region, year e primary_release_year 

Multi Search 

Api_key, query, page, language, include_adult e region 

Search Peoples 

Api_key, query, page, language, include_adult e region 

Search TV Shows 

Api_key, query, page, language, include_adult e first_air_date_year 

Get Details 

Tv_id integer 

Get Account States 

Tv_id integer 

Get Aggregative Credits 

Tv_id integer 

Get Alternative Titles 

Tv_id integer 

Get Changes 

Tv_id integer 

Get Content Ratings 

Tv_id integer 

Get Credits 

Tv_id integer 

Get Episode Groups 

Tv_id integer 

Get External IDs 

Tv_id integer 

Get Images 

Tv_id integer 

Get Keywords 

Tv_id integer 

Get Recommendations 

Tv_id integer 

Get Reviews 

Tv_id integer 

Get Screened Theatrically 

Tv_id integer 

Get Similar Movies 

movie_id integer 

Get Similar TV Shows 

Tv_id integer 

Get Translations 

Tv_id integer 

Get Videos 

Tv_id integer 

Get Watch Providers 

Tv_id integer 

Rate TV Shows 

Tv_id integer 

Delete Rating 

Tv_id integer 

Get Latest 

Api_key e language 

Get TV Airing Today 

Api_key, language e page 

Get TV On The Air 

Api_key, language e page 

Get Popular 

Api_key, language e page 

Get Top Rated 

Api_key, language e page 

Get Details 

Tv_id e season_number 

Get Account States 

Tv_id e season_number 

Get Aggregative Credits 

Tv_id e season_number 

Get Changes 

Season_id integer 

Get Credits 

Tv_id e season_number 

Get External IDs 

Tv_id e season_number 

Get Images 

Tv_id e season_number 

Get Translations 

Tv_id e season_number 

Get Videos 

Tv_id e season_number 

Get Details 

Tv_id e season_number 

Get Account States 

Tv_id e season_number 

Get Changes 

Season_id integer 

Get Credits 

Tv_id e season_number 

Get External IDs 

Tv_id e season_number 

Get Images 

Tv_id e season_number 

Get Translations 

Tv_id e season_number 

Rate TV Episodes 

Tv_id, season_number e episode_number 

Delete Rating 

Tv_id, season_number e episode_number 

Get Videos 

Tv_id, season_number e episode_number 

Get details 

Id string 

Get Available Regions 

Api_key e language 

Get Movie Providers 

Api_key, language e watch_region 

Get TV Providers 

Api_key, language e watch_region 

 

QUAL/QUAIS SERÃO IMPLEMENTADOS NA APLICAÇÃO 

Filmes: 

Get Details – informar as principais informações do filme 

Get Credits – mostrar elenco e produtores que participaram do filme 

Get List – para separar as listas que cada filme pertence 

Get Recommendations – recomendações de filmes 

Get Release Dates – indicar datas de lançamento dos filmes 

Get Latest – indicar filmes recém-criados 

Get Upcoming – indicar próximos filmes nos cinemas 

Possui um erro na compilação e uma linha de código da API. Não sabemos o que á de errado e tentaremos arrumar para o próximo bimestre.
