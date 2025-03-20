import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class candidatura {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"FELIPE", "MARCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato: candidatos){
            entrandoEmContado(candidato);
        }
     
    }
    
    static void entrandoEmContado(String canditado){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTADO REALIZADO COM SUCESSO");
        }while(continuarTentando && tentativasRealizadas<3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + canditado + " NA " + tentativasRealizadas);
        else
            System.out.println("NÃO CONSEGUIMOS CONTADO COM " + canditado +", NÚMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas);
    }

    //metodo auxiliar
        static boolean atender(){
            return new Random().nextInt(3)==1;
        }

    // imprimindo para o RH
    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA","JULIA","PAULO","AUGUSTO"};
        
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n " + (indice + 1) + " é o " + candidatos[indice]);
        }

        //FORMA ABREVIADA
        System.out.println("forma abreviada de interação for each");

        for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }

    }
    
    //novo metoodo
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidado = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidado + "Solicitou este valor sálario " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O canditado " + candidado + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    //Criei o método para analisar os candidatos
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO");
        } else if (salarioBase==salarioPretendido)
            System.out.println("LIGAR PARA CANDIDATO");
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
