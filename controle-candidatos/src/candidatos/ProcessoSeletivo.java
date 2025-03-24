package candidatos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
        public static void main(String[] args) {
            System.out.println("Processo Seletivo");
            selecaoCandidatos();
        }
        static void entrandoEmContato(String candidato){
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false ;
            do {
                
                atendeu = atender();
                continuarTentando = !atendeu;
                tentativasRealizadas++;

            } while (continuarTentando && tentativasRealizadas < 3);
            if(atendeu){
                System.out.println("Conseguimos contato com " + candidato + "na" + tentativasRealizadas);
            }else{
                System.out.println("Não conseguimos contato com " + candidato + " após " + tentativasRealizadas + " tentativas");
            }
        }

        //método auxiliar
        static boolean atender(){
            return new Random().nextInt(3)==1;
        }
        static  void imprimirSelecionados(){
            String [] candidatos = {"Felipe", "João", "Maria", "Pedro", "Ana"};
            System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

            for (int i = 0; i < candidatos.length; i++) {
                System.out.println("O candidato de nº " + i + " é " + candidatos[i]);
            }
        }
        static void selecaoCandidatos(){
            String [] candidatos = {"Felipe", "João", "Maria", "Pedro", "Ana", "Carlos", "Beatriz", "Luiz"};

            int candidatosSelecionados = 0;
            int candidatosAtual = 0;
            double salarioBase = 2000.0;
            while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
                String candidato = candidatos[candidatosAtual];
                double salarioPretendido = valorPretendido();

                System.out.println("O candidato " + candidato + " Solicitou este valor de salário " +  salarioPretendido);
                if (salarioBase >= salarioPretendido) {
                    System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                    candidatosAtual++;
                }
                candidatosAtual++;
            } 
        }
        static double valorPretendido(){
            return ThreadLocalRandom.current().nextDouble(1800, 2200);
        }

        static void analisarCandidato(double salarioPretendido){
            double salarioBase = 2000.0;
            if (salarioBase > salarioPretendido) {
                System.out.println("Ligar para o Candidato");
            }else if (salarioBase == salarioPretendido) {
                System.out.println("Ligar para o Candidato com contra proposta");
            }else {
                System.out.println("Aguardando o resultado dos demais candidatos");
            }
        }
        
}
