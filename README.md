# 🧠 Mochila Fracionária - Algoritmo Guloso em Java (POO)

Este projeto implementa a solução do **Problema da Mochila Fracionária** usando o **paradigma guloso** com **Programação Orientada a Objetos (POO)** em Java. O algoritmo maximiza o valor total dos itens que podem ser transportados sem ultrapassar a capacidade da mochila.

---

## 💼 Sobre o Problema

Dado:
Considere o **Problema da Mochila Fracionária**, onde:

- É dada uma mochila com **capacidade máxima W**
- Há um conjunto de **n itens**
- Cada item `i` possui:
    - um **peso** `pᵢ`
    - um **valor** `vᵢ`

Objetivo:
Selecionar itens (ou frações deles) de modo que:
- O peso total não ultrapasse `W`
- O valor total seja **máximo**

---

## 🧩 Estrutura do Projeto

```bash
.
├── Item.java                # Classe que representa um item com valor e peso
├── Main.java               # Classe principal com entrada via Scanner
├── MochilaFracionaria.java # Classe com o algoritmo guloso
└── README.md               # Este arquivo


🚀 Como Executar
Clone este repositório:
git clone https://github.com/seu-usuario/nome-do-repositorio.git
cd nome-do-repositorio

Compile os arquivos:
javac Item.java MochilaFracionaria.java Main.java

Execute o programa:
java Main

🧪 Exemplo de Uso

Digite a capacidade da mochila: 60
Digite o número de itens: 4
Item 1:
  Valor: 80
  Peso: 10
Item 2:
  Valor: 120
  Peso: 20
Item 3:
  Valor: 180
  Peso: 30
Item 4:
  Valor: 160
  Peso: 40

Valor máximo que pode ser carregado: 380.0

📚 Conceitos Envolvidos
Algoritmo Guloso

Subestrutura Ótima

Propriedade da Escolha Gulosa

Programação Orientada a Objetos (POO)

Entrada de dados com Scanner em Java

📄 Licença
Este projeto está licenciado sob a MIT License.

✍️ Autor
Nome: Alisson Souza Costa
