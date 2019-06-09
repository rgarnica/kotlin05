#### Explique o que fazem os seguintes métodos de Activity: ####
* onCreateOptionMenu(menu: Menu!): Boolean
  * Possibilita customizar as opções da action bar do aplicativo, adiciondo botões e opções.
* onOptionItemSelected(menuItem: MenuItem!): Boolean
  * É executado quando uma opção do menu é selecionada. Nesse método conseguimos verificar qual foi o botão pressionado e direcionar para a operação certa.

#### Explique como uma activity pode desencadear a exibição de outra activity e como esta segunda activity pode passar dados de volta para a primeira. Identifique os métodos de Activity envolvidos nessas ações. ####

Uma activity deve acionar outra através de métodos como `startActivity()` passando um `Intent`. Caso a primeira espere um retorno, ela deve utilizar o método `startActivityForResult` para abrir e implementar um método `onActivityResult` que será executado quando a outra activity finalizar sua operação.
A activity que foi chamada, deve utilizar os métodos `finish()` e `setResult()`. Neste último, pode passar um `Intent` com os dados que precisam ser devolvidos.

#### Suponha um objeto do tipo Button, button. A partir dele, explique como realizar as seguintes ações no código Kotlin: ####
* Mudar seu texto de conteúdo
  * `button.text = "novo texto"`
* Adicionar tratamento para quando for clicado
  * `button.setOnClickListener { }`
* Fazer com que exiba o teclado numérico e aceite somente números.
  * `button.inputType = InputType.TYPE_CLASS_NUMBER` ou no xml `android:inputType=number`


#### Como criar uma interface visual tabular usando LinearLayout? ####

Pode ser criado utilizando a propriedade `layout_weight` e `orientation`. Pode ser necessário aninhar layouts e criar outros `LinearLayout`

#### Qual a função da interface Parcelable? Como suas implementações devem serializar e desserializar suas propriedades? ####

A função dela é permitir a serialização de objetos de uma maneira mais eficiente que a interface `Serializable`, proporcionando uma maneira performática de transportar objetos entre as Activities.

#### O que são as propriedades layout_width e layout_height, que definimos em todos as views, no XML? Quais são os possíveis valores que podemos atribuir a elas e o que cada um faz? ####

São respectivamente a largura e altura do elemento. Podem ter os valores `match_parent`, `wrap_content` e uma medida específica.
Usando o primeiro, o elemento ocupa todo o espaço do elemento pai. Da segunda forma, ele cresce conforme seu conteúdo. 

#### Supondo que um aplicativo use o texto “Olá, bem vindo” em algum TextView, como podemos oferecer diferentes versões desse texto para diferentes idiomas? É possível usar este mesmo mecanismo de “tradução” para levar em consideração outros aspectos do dispositivo executando o aplicativo (e.g., tamanho da tela, versão do android, orientação, etc.)? ####

Podemos criar resources de string baseados no idioma. Os resources nos ajudam a tornar os aplicativos mais versáteis aproveitando parte comum do código e trocando apenas o necessário dinâmicamente.

#### O que são Fragments? Quais seriam dois casos de uso onde são úteis? ####

Fragments são partes de uma view, que podem ser reutilizados. Um exemplo de uso seria em uma activity com abas, onde cada aba pode ser um `Fragment` organizando o código fonte. Outro exemplo é para uma interface muito usada na aplicação e que teria que ser replicada.
