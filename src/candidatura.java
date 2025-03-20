public class candidatura {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo");
            analisarCandidato(1900.0);
            analisarCandidato(2200.0);
            analisarCandidato(2000.0); 

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
