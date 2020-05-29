# Métodos Avançados de Programação
## UNIESP Faculdades 
### Professora 
° DRª Alana Morais (alanamm.prof@gmail.com)
### Aluno
Fabio Soares de Brito Junior
### Padrão Corpotamental:
Memento
## Memento
Memento é um padrão de projeto de software documentado no Catálogo Gang of Four, sendo considerado como um padrão comportamental. Ele permite armazenar o estado interno de um objeto em um determinando momento, para que seja possível retorná-lo a este estado, sem que isso cause problemas com o encapsulamento.
## Problema:
Em Algum Momento Que desejar Permitir o usuario Quaisquer operações Realizadas o Padrão memento Serve Como o Verdadeiro (Control + z ), de forma que Os usuarios Consigam Voltar as telas anteriores .
## Solução
 padrão Memento delega a criação dos retratos do estado para o próprio dono do estado, o objeto originador. Portanto, ao invés de outros objetos tentarem copiar o estado do editor “a partir do lado de fora”, a própria classe do editor pode fazer o retrato já que tem acesso total a seu próprio estado.
  O padrão sugere armazenar a cópia do estado de um objeto em um objeto especial chamado memento. Os conteúdos de um memento não são acessíveis para qualquer outro objeto exceto aquele que o produziu. Outros objetos podem se comunicar com mementos usando uma interface limitada que pode permitir a recuperação dos metadados do retrato (data de criação, nome a operação efetuada, etc.), mas não ao estado do objeto original contido no retrato.
 ## Consequências 
 A aplicação pode consumir muita RAM se os clientes criarem mementos com muita frequência.
 Cuidadoras devem acompanhar o ciclo de vida da originadora para serem capazes de destruir mementos obsoletos.
 A maioria das linguagens de programação dinâmicas, tais como PHP, Python, e JavaScript, não conseguem garantir que o estado dentro do memento permaneça intacto.
## Exemplo
Foi Usado Um Exemplo Para Salvamento de Arquivos.
