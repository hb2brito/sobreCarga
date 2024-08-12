public class ExemplosSobrecarga {
    double maior;

    public double calcularNumeroMaior(double n1, double  n2){
        if((n1 == n2)){
            maior = 0;
        }else if (n1>n2) {
            maior =n1;            
        }else if (n2>n1) {
            maior=n2;            
        }else if (n1 == n2) {
            System.out.println("Nem maior e nem Menor. Apenas igual.");
            return 0; // Retorna 0 se os números forem iguais
        }
        return maior;
    }

    public double calcularNumeroMaior(double n1, double n2, double n3) {
        if (n1 == n2 && n2 == n3) {
            System.out.println("Todos os números são iguais.");
            return 0; // Retorna 0 se todos os números forem iguais
        } else {
            double maior = n1; // Inicialmente, assumimos que n1 é o maior
    
            if (n2 > maior) {
                maior = n2; // Atualiza 'maior' se n2 for maior
            }
            
            if (n3 > maior) {
                maior = n3; // Atualiza 'maior' se n3 for maior
            }
    
            return maior; // Retorna o maior número encontrado
        }
    }

    
    
    
}
