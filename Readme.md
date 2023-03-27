Crie um programa que cria um bichinho virtual com algumas características e que possui um estado inicial na inicialização do programa (nascimento). Depois que “nascer”, ele poderá executar quatro ações: comer, correr, dormir e morrer. O jogo só termina quando o bichinho morrer, encerrando o programa. As opções para o programa  são: 
\\Metodos.

1- Comer
2- Correr
3- Dormir
4- Sair do programa

- Seja um Classe Animais que possui as seguintes características:
\\Atributos.

1- nome. \\ok 
2-classe. \\ok
3-família. \\ok
4-idade. \\ok
5-estado (vivo = true e morto = false). \\ok 
6-caloria (0 a 100). \\ok 
7- força (0 a 100). \\ok 

Estes animais podem fazer as seguintes ações:

· nascer: pergunta os dados do animal (nome, classe e família). O animal recebe 10 de força e 10 de caloria, 0 na idade e true como estado. Imprima a seguinte frase ao terminar o método:  "O animal se chama " + nome + " é da classe " + classe + " da familia " + familia + ". O animal possui força de " + forca + ", caloria de " + caloria + " e idade de " +idade \\ok

· morrer: coloca 0 na força e false como estado. Imprima a seguinte frase: "O animal morreu!"; \\ok 

· comer: caso o animal não esteja cheio e/ou morto, insere 10 no estado caloria e retira 2 de força. Imprima a seguinte frase: "O animal comeu e agora sua força é de " + forca +" e suas calorias valem " + caloria; \\ok

· correr: caso o animal não esteja morto ou exausto (caloria = 0), retira 5 do estado força e 5 do estado caloria. Imprima a seguinte frase: "O animal está correndo!! Agora sua força é de " + forca + " e suas calorias valem " + caloria; \\ok

· dormir: caso o animal não esteja morto, insere 10 no estado força e retira 2 do estado caloria. Imprima a seguinte frase: "O animal está domingo agora! Sua força aumentou para " + forca + " e suas calorias aumentaram para " + caloria. \\ok 