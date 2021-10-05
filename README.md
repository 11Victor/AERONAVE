<h1>Gestão de Aeronaves - Back end</h1>


<div>Link do back-end do Projeto, rodando no Heroku --> https://aeronave.herokuapp.com/ </div>

<div>Link do front-end do Projeto, rodando no Netlify --> https://aeronave.netlify.app/ </div>


<div>Link da documentação --> https://documentacao-aeronaves.netlify.app/</div><br>

<h2>CRUD | Requisições</h2>

<h3>✔Get All</h3>
<div>Função: Exibir todas aeronaves --> "localhost:8080/aeronaves"</div>

<h3>✔Get By Id</h3>
<div>Função: Exibir aeronave pelo ID --> "localhost:8080/aeronaves/{id}"</div>

<h3>✔Get By Descricao</h3>
<div>Função: Exibir aeronaves pela descrição --> "localhost:8080/aeronaves/aeronaves/descricao/{descricao}"</div>

<h3>✔Get By Marca</h3>
<div>Função: Exibir aeronave pela marca --> "localhost:8080/aeronaves/marca/{marca}"</div>

<h3>✔Get By Nome</h3>
<div>Função: Exibir aeronave pelo nome --> "localhost:8080/aeronaves/nome/{nome}"</div>

<h3>✔Get Vendido False</h3>
<div>Função: Exibir aeronaves que não foram vendidas --> "localhost:8080/aeronaves/vendido/false"</div>

<h3>✔Get Vendido True</h3>
<div>Função: Exibir aeronaves vendidas --> "localhost:8080/aeronaves/vendido/true"</div>

<h3>✔Post Aeronave</h3>
<div>Função: Cadastrar uma nova aeronave --> "localhost:8080/aeronaves"</div>
Parâmetros:
{
  "ano": 0,
  "descricao": "string",
  "foto": "string",
  "marca": "string",
  "nome": "string",
  "vendido": true
}

<h3>✔Put Aeronave</h3>
<div>Função: Editar aeronave pelo ID --> "localhost:8080/aeronaves"</div>
Parâmetros:
{
  "id": 0,
  "ano": 0,
  "descricao": "string",
  "foto": "string",
  "marca": "string",
  "nome": "string",
  "vendido": true
}

<h3>✔Delete Aeronave</h3>
<div>Função: Deletar aeronave por ID --> "localhost:8080/aeronaves/{id}"</div>
