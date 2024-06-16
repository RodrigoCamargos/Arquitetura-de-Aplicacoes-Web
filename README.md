# Arquitetura de Aplicações Web

## Documentação da API JWT User

### Visão Geral

 A API JWT User suporta autenticação utilizando JSON Web Tokens (JWT), facilitando a autenticação de usuários e a emissão de tokens JWT para acessar endpoints seguros.

### APIs Disponíveis

POST /login: Endpoint para autenticação e obtenção de um token JWT.
Endpoint: https://api.exemplo.com/login

GET /username/{token}: Rota que obtém o nome de usuário a partir de um token JWT.
Endpoint: https://api.exemplo.com/username/{token}

GET /user: Rota que obtém informações sobre o usuário autenticado.
Endpoint: https://api.exemplo.com/user

GET /admin: Rota protegida acessível apenas por usuários com a função ADMIN.
Endpoint: https://api.exemplo.com/admin

GET /moderado: Rota protegida acessível apenas por usuários com a função MODERADO.
Endpoint: https://api.exemplo.com/moderado

GET /comum: Rota acessível por usuários comuns.
Endpoint: https://api.exemplo.com/comum

## Guia de Introdução
### Para começar a usar a API JWT User, siga estes passos:

Obtenha uma chave de API ativa para autenticar suas solicitações.
Certifique-se de que a chave de API esteja incluída em cada solicitação para os endpoints da API.
Todas as solicitações devem ser feitas via HTTPS.
As respostas da API estão no formato JSON.
Autenticação
A API autentica as chamadas usando um token JWT.

### Para autenticar uma solicitação:

Obtenha um token JWT no endpoint POST /login.
Passe o token JWT no cabeçalho da solicitação para chamadas subsequentes (Authorization: Bearer {token}).

### Resposta de Erro de Autenticação:

Se uma chave de API estiver ausente ou inválida/malformada, a resposta retornará um código de status HTTP 401 Não Autorizado.

### Testes com Insomnia
A API JWT User foi testada utilizando o Insomnia. Você pode baixar a coleção de testes e importá-la diretamente no Insomnia para testar os endpoints e o comportamento da API.

### Limites de Taxa e Uso
Os limites de taxa e uso da API JWT User são os seguintes:

### Limite de Taxa: 
300 solicitações por minuto por chave de API.

### Código de Status:
 Você receberá uma resposta HTTP 429 Too Many Requests se exceder o limite de taxa.

## Cabeçalhos de Resposta:

X-RateLimit-Limit: O número máximo de solicitações permitidas por minuto.
X-RateLimit-Remaining: O número de solicitações restantes na janela de limite de taxa atual.
X-RateLimit-Reset: O timestamp de quando a janela de limite de taxa atual será redefinida, em segundos do éon UTC.

## Resposta HTTP 503:

Uma resposta HTTP 503 indica que o tráfego da API aumentou inesperadamente. O servidor deve retornar ao normal em um máximo de cinco minutos. Se o problema persistir ou se você continuar recebendo qualquer erro HTTP 5XX, sinta-se à vontade para contatar a equipe de suporte.

## Conclusão
A API JWT User oferece autenticação segura utilizando JSON Web Tokens (JWT), permitindo acesso a endpoints protegidos por diferentes níveis de permissão (ADMIN, MODERADO, comum). Para começar, obtenha uma chave de API, inclua-a em solicitações HTTPS e utilize tokens JWT para autenticação. A API possui limites de taxa de 300 solicitações por minuto por chave de API, com respostas detalhadas sobre o status da taxa de solicitações. Em caso de aumento de tráfego repentino, a API retorna um HTTP 503 temporário. Para mais suporte, nossa equipe está à disposição.

# Diagrama JWT
![image](https://github.com/RodrigoCamargos/Arquitetura-de-Aplicacoes-Web/assets/92878953/7c91bc70-35b4-46d9-b0cc-6979f090849e)



## Imagens do Insomnia em execusão:
![image](https://github.com/RodrigoCamargos/Arquitetura-de-Aplicacoes-Web/assets/92878953/6e5a7634-0168-4f8d-a5b1-7d52a3732a08)
![image](https://github.com/RodrigoCamargos/Arquitetura-de-Aplicacoes-Web/assets/92878953/d09e4c09-ac6b-412b-88d9-8d4d13c82978)
![image](https://github.com/RodrigoCamargos/Arquitetura-de-Aplicacoes-Web/assets/92878953/232b2dbd-3c8b-437d-8df9-b4dc127a9c23)
![image](https://github.com/RodrigoCamargos/Arquitetura-de-Aplicacoes-Web/assets/92878953/4197c3ce-19f7-4f91-b126-08b2d3827696)
![image](https://github.com/RodrigoCamargos/Arquitetura-de-Aplicacoes-Web/assets/92878953/0c010188-9fd0-4639-989c-44ee189e886b)

## EXEMPLO DE USER NÃO AUTORIZADO:
![image](https://github.com/RodrigoCamargos/Arquitetura-de-Aplicacoes-Web/assets/92878953/2ef82049-4ef8-432b-9d82-f3ebe222aa34)



