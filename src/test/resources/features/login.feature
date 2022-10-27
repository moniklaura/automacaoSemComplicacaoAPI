#language:pt
  @login

Funcionalidade: Realizar Login
  Testes da API de Login

  @loginSucesso
  Cenario: Ralizar login com Sucesso
    Dado que tenha um payload valido  da API  de Login
    Quando envio uma requisicao do tipo POST de Login
    Entao valido que recebo o status 200 no response
    #E armazeno o token que recebo do response de Login

  @loginInvalido
  Esquema do Cenario: Cenario: Realizar Login com <cenarios>
    Dado que tenha um payload da API  de login com as seguintes informacoes
      | email | <email> |
      | senha | <senha> |
    Quando envio uma requisicao do tipo POST de Login
    Entao valido que recebo o status 400 no response

    @loginUsuarioInvalido
    Exemplos:
    |cenario          |email             |senha  |
    |usuario invalido |invalido@email.com|123456 |

    @loginSenhaInvalida
    Exemplos:
    |cenario         |email             |senha   |
    |senha invalida  |aluno@email.com   |invalido|



    