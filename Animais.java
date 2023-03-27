import java.util.Scanner;

public class Animais {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private String classe;
    private String familia;
    private int idade;
    private boolean estado;
    private int caloria;
    private int forca;

    Animais() {

    }

    Animais(String n, String c, String f) {
        this.nome = n;
        this.classe = c;
        this.familia = f;
    }

    public void setCaloria(int caloria) {
        this.caloria = caloria;
    }

    public int getCaloria() {
        return caloria;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getClasse() {
        return classe;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public boolean getestado() {
        return estado;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getFamilia() {
        return familia;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void nascer() {

        System.out.println("Entao digite um nome, classe e uma famila para o seu tamagoshi: ");
        System.out.println("===================================");
        String nome = sc.nextLine();
        setNome(nome);

        String classe = sc.nextLine();
        setClasse(classe);

        String famila = sc.nextLine();
        setFamilia(famila);

        this.caloria = 10;
        this.forca = 10;
        this.idade = 0;
        this.estado = true;
        System.out.println("===================================");
        System.out.println("O animal se chama " + nome + " é da classe " + classe + " da familia " + familia
                + ". O animal possui força de " + forca + ", caloria de " + caloria + " e idade de " + idade);

    }

    public void morreu() {

        this.caloria = 0;
        this.forca = 0;
        this.estado = false;
        System.out.println("===================================");
        System.out.println("O animal morreu!");
        System.out.println("Deseja continuar: [sim/não] ");
        System.out.println("===================================");
        String continuar = sc.nextLine();
        switch (continuar) {
            case "sim":
                nascer();
                break;

            default:
                System.exit(0);
                break;
        }

    }

    public void comer() {

        if (forca == 2) {
            System.out.println("===================================");
            System.out.println("seu tamagoshi " + nome
                    + " esta cheio ele não consegue mais comer, tente fazer algumm esforço fisico com ele");
            System.out.println("===================================");

        } else {
            this.caloria = this.caloria + 10;
            this.forca = this.forca - 2;
            System.out.println("===================================");
            System.out.println(
                    "O animal comeu e agora sua força é de " + forca + " e suas calorias valem " + caloria);

            if (forca <= 1) {
                morreu();
            }
        }

    }

    public void correr() {
        if (caloria == 2) {
            System.out.println("===================================");
            System.out.println("seu tamagoshi " + nome
                    + " esta exausto ele não consegue relizar mais nem uma função tnete alimentar");

        } else {
            this.caloria = this.caloria - 2;
            this.forca = this.forca + 10;
            System.out.println("===================================");
            System.out.println(
                    "O animal está correndo!! Agora sua força é de " + forca + " e suas calorias valem " + caloria);

            if (caloria <= 1) {
                morreu();
            }
        }

    }

    public void dormir() {
        if (caloria == 2 && forca == 2) {
            System.out.println("===================================");
            System.out.println("seu tamagoshi " + nome
                    + " ele não e capaz de dormir tente alimentalo e aumentar a sua força.");

        } else {
            this.caloria = this.caloria - 5;
            this.forca = this.forca - 5;
            System.out.println("===================================");
            System.out.println("O animal está domingo agora! Sua força aumentou para " + forca
                    + " e suas calorias aumentaram para " + caloria);

            if (caloria <= 1 || forca <= 1) {
                morreu();
            }

        }

    }

    public void menu() {
        System.out.println("===================================");
        System.out.println("Agora quais açoes seu tamagoshi ira tomar \na-Correr: \nb-Comer: \nc-Dormir \nd-Sair");
        String descisao3 = sc.nextLine();

        switch (descisao3) {
            case "a":
                correr();
                menu();
                break;

            case "b":
                correr();
                menu();
                break;

            case "c":
                dormir();
                menu();
                break;
            case "d":
                System.out.println("Então tachau!");
                System.exit(0);
                break;

        }

    }
    public void inicio(){
        System.out.println("===================================");
        System.out.println("Esse e o menu de inicio do seu tamagoshi anseia de comecar? [Sim/Nao]");
        String descisao = sc.nextLine();
        System.out.println(
                "OBS: com esse tamagoshi se sair do programa seu bichinnho ira falecer (ir de base, pra cidade do pe junto, nn irar tankar, foi ver o Paul Walker)");
        System.out.println("===================================");

        do {
            System.out.println("Voce pode realizar as seguinte opções:");

            System.out.println("a - Deseja chocar o seu tamagoshi? \nb- Dejesa sair?");

            String descisao2 = sc.nextLine();

            System.out.println("===================================");
            switch (descisao2) {
                case "a":
                    

                    nascer();

                    

                    menu();
                    

                    break;

                case "b":
                    System.out.println("Entao tchau! ");
                    System.exit(0);

                    break;
            }

        } while (descisao == "Sim" || descisao == "sim");
    }

}
