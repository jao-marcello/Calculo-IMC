import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Pessoa eq = new Pessoa(null, null, null, 0, 0, 0, 0);
        String nome, sobrenome, obesidade;
        int idade;
        double peso, altura, imc;

        System.out.println("Informe seu NOME e SOBRENOME: ");
        nome = input.nextLine(); eq.setNome(nome);
        sobrenome = input.nextLine(); eq.setSobrenome(sobrenome);

        System.out.println("informe sua IDADE: ");
        idade = input.nextInt(); eq.setIdade(idade);
        
        System.out.println("Informe seu PESO em KG: ");
        peso = input.nextDouble(); eq.setPeso(peso);

        System.out.println("Informe sua ALTURA em METROS: ");
        altura = input.nextDouble(); eq.setAltura(altura);

        imc = eq.calculaIMC();
        obesidade = eq.informaObesidade();

        System.out.println("Nome: " + nome + " " + sobrenome +
        "\nIdade: " + idade + 
        "\nPeso: " + peso +
        "\nAltura: " + altura +
        "\nseu IMC: " + imc + 
        "\nVocê está: " + obesidade);
    }
}
