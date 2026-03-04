Sistema PaletaDeSombra
1. Descrição do Projeto

Este projeto foi desenvolvido com o objetivo de aplicar os conceitos fundamentais de Programação Orientada a Objetos (POO) utilizando a linguagem Java.

A classe PaletaDeSombra representa uma paleta de maquiagem e simula seu comportamento por meio de métodos que alteram seu estado interno, respeitando regras de negócio previamente definidas.

2. Representação no Mundo Real

O objeto PaletaDeSombra representa uma paleta de sombras utilizada para maquiagem.

No sistema:

Suas características foram modeladas como atributos.

Suas ações e comportamentos foram implementados como métodos.

Seu estado pode ser alterado conforme as interações realizadas.

3. Estrutura da Classe
Atributos (privados)

acabamento (String): tipo da sombra (ex: matte, cintilante).

nivelPigmentacao (int): intensidade da cor aplicada.

horasDuracao (int): tempo restante de duração da sombra.

quantidadeCores (int): quantidade de cores disponíveis na paleta.

estaQuebrada (boolean): indica se a paleta está danificada.

Os atributos são privados, aplicando o conceito de encapsulamento, garantindo que o estado do objeto só possa ser alterado por meio dos métodos da classe.

4. Métodos e Regras de Negócio
aplicarSombra(int intensidade)

Simula a aplicação da sombra.

Regras de validação:

A intensidade deve ser maior que zero.

A paleta não pode estar quebrada.

O valor de horasDuracao deve ser maior que zero.

Se válido:

O nivelPigmentacao é aumentado.

O horasDuracao é reduzido em 1 unidade.

esfumarSombra(int nivelSuavizacao)

Simula o ato de esfumar a sombra.

Regras de validação:

O nível de suavização deve ser maior que zero.

Deve existir pigmentação disponível.

Comportamento:

O nivelPigmentacao é reduzido.

O valor nunca pode se tornar negativo (é ajustado para zero se necessário).

quebrarPaleta()

Altera o estado da paleta para quebrada (estaQuebrada = true), impedindo sua utilização.

repararPaleta()

Permite que a paleta volte ao estado funcional (estaQuebrada = false), caso esteja quebrada.

5. Funcionamento do SistemaPrincipal

No método main, são criadas duas instâncias da classe:

Uma paleta em funcionamento.

Uma segunda paleta que é quebrada para testar as validações.

O sistema realiza chamadas aos métodos para demonstrar:

Aplicação válida da sombra

Esfumação

Tentativa de uso com objeto quebrado

Reparo e reutilização

Tentativa de uso com valor inválido

6. Exemplo de Uso
PaletaDeSombra minhaPaleta =
        new PaletaDeSombra("Matte", 8, 12, 16);

minhaPaleta.aplicarSombra(3);
minhaPaleta.esfumarSombra(2);
minhaPaleta.quebrarPaleta();
minhaPaleta.repararPaleta();

O exemplo acima demonstra a criação do objeto e a utilização de seus métodos, respeitando as regras implementadas.

7. Conceitos de POO Utilizados

Classe

Objeto

Construtor

Encapsulamento

Estado e comportamento

Validação de regras de negócio

Proteção contra inconsistência de estado
